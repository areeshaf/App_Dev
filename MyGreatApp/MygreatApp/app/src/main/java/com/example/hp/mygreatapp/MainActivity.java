package com.example.hp.mygreatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        EditText name=(EditText) findViewById(R.id.editTextName);
        EditText pass=(EditText) findViewById(R.id.editTextPassword);
        Log.i("Info",   "Button Pressed");
        Log.i("Values",name.getText().toString());
        Log.i("Values",pass.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
