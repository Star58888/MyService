package com.star.myservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.print("MainActivity.onCreate");
    }

    public void onStartService(View v)
    {
        System.out.print("MainActivity.onStartService");
        Intent intent = new Intent(this , MyService.class);
        MyService.isStop = false;
        startService(intent);
    }

    public void onStopService(View v)
    {
        System.out.print("MainActivity.onStopService");
        Intent intent = new Intent(this , MyService.class);
        MyService.isStop = true;
        stopService(intent);
    }

}
