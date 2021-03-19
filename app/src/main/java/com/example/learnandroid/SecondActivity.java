package com.example.learnandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        finish();

    }
    @Override
    public void finish(){
        Intent data= new Intent();
        data.putExtra("returnValue1"," value 1 cua SecondActivity");
        data.putExtra("returnValue2","value2 cua SecondActivity");
        setResult(RESULT_OK,data);
        super.finish();
    }
}