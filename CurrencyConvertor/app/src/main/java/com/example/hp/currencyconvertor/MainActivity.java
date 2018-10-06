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
    public void clickFun(View v){
        EditText et=(EditText)findViewById(R.id.editText4);
        String amts=et.getText().toString();
        Double amtd=Double.parseDouble(amts);
        Double amnt=amtd/73.77;
        String amnts=String.format("%.2f",amnt);
        Toast.makeText(this, "Rps. "+amts+" is equal to $"+amnts, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
