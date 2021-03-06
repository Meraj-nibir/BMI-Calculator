package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText heightText;
    EditText weightText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.heightText  = findViewById(R.id.editTextNumber);
        this.weightText  = findViewById(R.id.editTextNumber2);

        Button calculateButton = findViewById(R.id.button);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float height = Float.parseFloat(heightText.getText().toString())/100;
                float weight = Float.parseFloat(weightText.getText().toString());
                float result = weight/(height*height);
                TextView textView = (TextView) findViewById(R.id.textView7);
                TextView textView1 = (TextView) findViewById(R.id.textView2);
                double res = Math.floor((result*100)/100);
                textView.setText(""+res);
                if(res<18.5){
                    textView1.setText("Underweight");
                }
                else if(res>18.5&&res<24.9){
                    textView1.setText("Normal");
                }
                else if(res>24.9&&res<29.9){
                    textView1.setText("Overweight");
                }
                else{
                    textView1.setText("Obese");
                }


            }
        });
    }
}