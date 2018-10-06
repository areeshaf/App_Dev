package com.example.hp.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickfun(View view){
        EditText et=(EditText)findViewById(R.id.editText);
       String value= et.getText().toString();
        Log.i("Info","Button pressed");
        Log.i("Info",et.getText().toString());
        int num=Integer.parseInt(value);
        double amount=num*73.77;
        String amountd=String.format("%.2f",amount);
        Toast.makeText(this, "$"+et.getText().toString()+" is equal to Rps."+amountd, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
