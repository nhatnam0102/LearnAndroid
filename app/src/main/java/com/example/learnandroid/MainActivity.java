package com.example.learnandroid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String STATE = "Trang thai";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(STATE, "onCreate");


//        Button btnClick = findViewById(R.id.btnClick);
//        btnClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i  = new Intent(MainActivity.this, SecondActivity.class);
//                i.putExtra("value1","Lay gia tri value 1 tu secondActivity");
//                i.putExtra("value2","Lay gia tri value3 tu SecondActivity");
//                int REQUEST_CODE=9;
//                startActivityForResult(i,REQUEST_CODE);
//            }
//        });
    }





    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(STATE, "onDestroy");
    }

//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.e(STATE, "onPause");
//    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(STATE, "onResume");
    }
    @Override
    protected void onStop() {
        super.onStop();

        Log.e(STATE, "onStop");
    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(STATE, "onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle saveInstanceState) {
        super.onSaveInstanceState(saveInstanceState);
        Log.e(STATE, "onSaveInstanceState");
    }
    //    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (resultCode==RESULT_OK&& requestCode==9){
//
//                Toast.makeText(this,data.getExtras().getString("returnValue1"),Toast.LENGTH_LONG).show();
//            Toast.makeText(this,data.getExtras().getString("returnValue2"),Toast.LENGTH_LONG).show();
//            }
//        }
}
