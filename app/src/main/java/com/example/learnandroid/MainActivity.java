package com.example.learnandroid;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnClick = findViewById(R.id.btnClick);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("value1","Lay gia tri value 1 tu secondActivity");
                i.putExtra("value2","Lay gia tri value3 tu SecondActivity");
                int REQUEST_CODE=9;
                startActivityForResult(i,REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==RESULT_OK&& requestCode==9){

                Toast.makeText(this,data.getExtras().getString("returnValue1"),Toast.LENGTH_LONG).show();
            Toast.makeText(this,data.getExtras().getString("returnValue2"),Toast.LENGTH_LONG).show();
            }
        }
    }
