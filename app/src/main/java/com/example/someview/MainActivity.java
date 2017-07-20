package com.example.someview;

import android.os.SystemClock;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {
/*单选和复选框
    private RadioGroup rg;
    private TextView show;
    private TextView show1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = (RadioGroup) findViewById(R.id.rg);
        show = (TextView) findViewById(R.id.show);
        show1 = (TextView) findViewById(R.id.show1);
        final CheckBox cbRed = (CheckBox) findViewById(R.id.red);
        CheckBox cbGreen = (CheckBox) findViewById(R.id.green);
        final CheckBox cbBlue = (CheckBox) findViewById(R.id.blue);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String tip = checkedId == R.id.male?
                        "您的性别是男人":"您的性别是女人";
                show.setText(tip);
            }
        });
        CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked)
                {
                   show1.setText(cbRed.getText());
                }
            }
        };
        cbRed.setOnCheckedChangeListener(listener);
        cbGreen.setOnCheckedChangeListener(listener);
        cbBlue.setOnCheckedChangeListener(listener);
    }
    */
   /* 状态开关按钮(ToggleButton)和开关(Switch)
    ToggleButton toggle;
    Switch switcher;
    @Override
    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        toggle = (ToggleButton) findViewById(R.id.toggle);
        switcher = (Switch) findViewById(R.id.switcher);
        final LinearLayout test = (LinearLayout) findViewById(R.id.test);
        CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    test.setOrientation(LinearLayout.VERTICAL);
                    toggle.setChecked(true);
                    switcher.setChecked(true);
                }
                else
                {
                    test.setOrientation(LinearLayout.HORIZONTAL);
                    toggle.setChecked(false);
                    switcher.setChecked(false);
                }
            }
        };
        toggle.setOnCheckedChangeListener(listener);
        switcher.setOnCheckedChangeListener(listener);
    }
    */

   /*时钟
   Chronometer ch;
    Button start;
   @Override
    protected void onCreate(Bundle saveInstanceState)
   {
       super.onCreate(saveInstanceState);
       setContentView(R.layout.activity_main);
       //获取计时器组件
       ch = (Chronometer) findViewById(R.id.test);
       start = (Button) findViewById(R.id.bn1);
       start.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               ch.setBase(SystemClock.elapsedRealtime());
               ch.start();
               start.setEnabled(false);
           }
       });
       ch.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
           @Override
           public void onChronometerTick(Chronometer chronometer) {
               if (SystemClock.elapsedRealtime()-ch.getBase()>20*1000)
               {
                   ch.stop();
                   start.setEnabled(true);
               }
           }
       });

   }
   */

   /*生命周期*/
   @Override
   protected void onCreate(Bundle saveInstanceState)
   {
       super.onCreate(saveInstanceState);
       setContentView(R.layout.activity_main);
       System.out.println("MainActivity onCreate");
   }
    @Override
    protected void onStart()
    {
        super.onStart();
        System.out.println("MainActivity onStart");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        System.out.println("MainActivity onDestroy");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        System.out.println("MainActivity onPause");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        System.out.println("MainActivity onResume");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        System.out.println("MainActivity onStop");
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        System.out.println("MainActivity onRestart");
    }
}
