package com.example.someview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ASUS on 2017/7/21.
 */

public class ThirdActivity  extends AppCompatActivity {
    private TextView text;
    private Button button;
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.third_activity);
        System.out.println("Third onCreate");


        final Intent intent = getIntent();
        int age = intent.getIntExtra("com.example.some", 3);
        text = (TextView) findViewById(R.id.text);
        text.setText(age+"");
        button = (Button) findViewById(R.id.third);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setClass(ThirdActivity.this, SecondActivity.class);
                startActivity(intent1);
            }
        });
    }







    @Override
    protected void onStart()
    {
        super.onStart();
        System.out.println("ThirdActivity onStart");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        System.out.println("ThirdActivity onDestroy");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        System.out.println("ThirdActivity onPause");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        System.out.println("ThirdActivity onResume");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        System.out.println("ThirdActivity onStop");
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        System.out.println("ThirdActivity onRestart");
    }
}
