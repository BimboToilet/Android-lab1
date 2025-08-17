package com.example.lab1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import androidx.core.content.ContextCompat;


public class ColourActivity extends Activity {

    RelativeLayout relativeLayout;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour);
        relativeLayout = (RelativeLayout) findViewById(R.id.layoutclr);
        String colour = getIntent().getStringExtra("colour");
        if (colour.equals("red")){
            relativeLayout.setBackgroundColor(getColor(R.color.red));
        }
        else if (colour.equals("green")){
            relativeLayout.setBackgroundColor(getColor(R.color.green));
        }
        else if (colour.equals("blue")){
            relativeLayout.setBackgroundColor(getColor(R.color.blue));
        }
    }
}
