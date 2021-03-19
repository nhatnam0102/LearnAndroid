package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SaveInstanceActivity extends AppCompatActivity implements View.OnClickListener {
private EditText eNumber1;
private  EditText eNumber2;
private TextView txtResult;
private Button btnTong;

private  int number1;
private  int number2;
private int result;

@Override
protected  void onCreate(@Nullable Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    eNumber1=findViewById(R.id.edtTextNumber1);
    eNumber2=findViewById(R.id.editTextNumber4);
    txtResult=findViewById(R.id.txtResult);
    btnTong=findViewById(R.id.btnTong);
    btnTong.setOnClickListener(this);



}
    @Override
    public void onClick(View v) {
if (v==btnTong){
    if (eNumber2.getText().toString().isEmpty()||eNumber1.getText().toString().isEmpty()){
        runOnUiThread(() -> Toast.makeText(this,"null ",Toast.LENGTH_LONG).show());

    }
    else
    {
        number1= Integer.parseInt(eNumber1.getText().toString());
        number2= Integer.parseInt(eNumber2.getText().toString());
        result=number1+number2;
        txtResult.setText(String.valueOf(result));

    }
}
    }
}
