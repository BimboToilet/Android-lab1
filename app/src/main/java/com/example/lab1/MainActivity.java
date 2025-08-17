package com.example.lab1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button start;
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (Button) findViewById(R.id.lnchclr);
        edit = (EditText) findViewById(R.id.editclr);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String colour = edit.getText().toString();
                if (colour.equals("red") || colour.equals("blue") || colour.equals("green")){
                    Intent intent = new Intent (MainActivity.this, ColourActivity.class);
                    intent.putExtra("colour", colour);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, getString(R.string.wrong_enter), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}