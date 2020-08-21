package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
        public void change(View view){
            EditText editText=findViewById(R.id.a1);
            EditText editText2=findViewById(R.id.a2);
            EditText editText3=findViewById(R.id.a3);
            TextView text1=findViewById(R.id.a4);
            TextView text2=findViewById(R.id.a5);
            TextView text3=findViewById(R.id.a6);
            final String p=editText.getText().toString();
            if(p.length()==0){
                editText.requestFocus();
                editText.setError("Please enter your name");
            }
            text1.setText(p);
            text2.setText(editText2.getText().toString());
            text3.setText(editText3.getText().toString());
            Toast.makeText(this, "hey", Toast.LENGTH_LONG).show();
        }
}