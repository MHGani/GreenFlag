package com.example.greenflag;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    private EditText emailVal;
    private TextView valmsg;


    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);


        emailVal = findViewById(R.id.edit_email);
        valmsg = findViewById(R.id.valMsg);
        isEmpty();

    }

    public void isEmpty(){
        String email = emailVal.getText().toString().trim();
        String emailPattern = "[a - zA - Z0 - 9._-]+@[a - z]+\\.+[a-z]";

        if (email.matches( emailPattern) && email!=null){
        }else{
            emailVal.setError("please change data" );

        }
    }

}
