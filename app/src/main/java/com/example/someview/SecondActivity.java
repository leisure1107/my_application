package com.example.someview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.nio.BufferUnderflowException;

/**
 * Created by ASUS on 2017/7/21.
 */

public class SecondActivity extends AppCompatActivity {
    private Button button;
    private TextView text;
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.second_activity);
        System.out.println("SecondActivity onCreate");
        button = (Button) findViewById(R.id.next);

        Intent intent = getIntent();
        int age = intent.getIntExtra("com.example.someview", 10);
        text = (TextView) findViewById(R.id.text);
        text.setText(age+"");

        button.setOnClickListener(new ButtonListener());
    }

//    第一种事件机制
    class ButtonListener implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(SecondActivity.this, ThirdActivity.class);
            intent.putExtra("com.example.some", 30);
            startActivity(intent);
        }
    }
//    第二种事件机制，在xml中定义OnClick属性
    public void getBack(View source)
        {
            Intent intent = new Intent();
            intent.setClass(SecondActivity.this, MainActivity.class);
            startActivity(intent);
        }





/*生命周期*/
    @Override
    protected void onStart()
    {
        super.onStart();
        System.out.println("SecondActivity onStart");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        System.out.println("SecondActivity onDestroy");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        System.out.println("SecondActivity onPause");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        System.out.println("SecondActivity onResume");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        System.out.println("SecondActivity onStop");
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        System.out.println("SecondActivity onRestart");
    }
}
