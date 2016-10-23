package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView)findViewById(R.id.show);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = df.format(new Date());
        tv.setText(tv.getText() + time + "  生命周期：onStart()\n");
        Log.i("生命周期", "onCreate()");
        Toast.makeText(getApplicationContext(),"onCreate()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        TextView tv = (TextView)findViewById(R.id.show);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = df.format(new Date());
        tv.setText(tv.getText() + time + "  生命周期：onStart()\n");

        Log.i("生命周期", "onStart()");
        Toast.makeText(getApplicationContext(),"onStart()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        TextView tv = (TextView)findViewById(R.id.show);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = df.format(new Date());
        tv.setText(tv.getText() + time + "  生命周期：onResume()\n");
        tv.setText(tv.getText() + time + "  当前APP正在运行！\n");
        Log.i("生命周期", "onResume()");
        Log.w("生命周期", "当前APP正在运行！");
        Toast.makeText(getApplicationContext(),"onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        TextView tv = (TextView)findViewById(R.id.show);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = df.format(new Date());
        tv.setText(tv.getText() + time + "  生命周期：onPause()\n");
        Log.i("生命周期", "onPause()");
        Toast.makeText(getApplicationContext(),"onPause()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        TextView tv = (TextView)findViewById(R.id.show);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = df.format(new Date());
        tv.setText(tv.getText() + time + "  生命周期：onStop()\n");
        Log.i("生命周期", "onStop()");
        Toast.makeText(getApplicationContext(),"onStop()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        TextView tv = (TextView)findViewById(R.id.show);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = df.format(new Date());
        tv.setText(tv.getText() + time + "  生命周期：onDestroy()\n");
        Log.i("生命周期", "onDestroy()");
        Toast.makeText(getApplicationContext(),"onDestroy()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        TextView tv = (TextView)findViewById(R.id.show);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = df.format(new Date());
        tv.setText(tv.getText() + time + "  生命周期：onRestart()\n");
        Log.i("生命周期", "onRestart()");
        Toast.makeText(getApplicationContext(),"onRestart()",Toast.LENGTH_SHORT).show();
    }
}
