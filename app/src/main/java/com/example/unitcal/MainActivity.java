package com.example.unitcal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculate(View v)
    {

        Intent goToSecond=new Intent();
        goToSecond.setClass(this,first.class);
        startActivity(goToSecond);


    }
    public void unit(View v)
    {

        Intent goToSecond=new Intent();
        goToSecond.setClass(this,MainActivity2.class);
        startActivity(goToSecond);

    }
}