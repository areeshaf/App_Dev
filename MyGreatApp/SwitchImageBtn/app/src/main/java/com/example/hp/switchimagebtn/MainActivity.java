package com.example.hp.switchimagebtn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void clickfun(View view){
        Log.i("Info","Button Pressed");
        ImageView im=(ImageView)findViewById(R.id.imageView);
        im.setImageResource(R.drawable.london);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
