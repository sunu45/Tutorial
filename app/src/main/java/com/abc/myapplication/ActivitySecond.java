package com.abc.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivitySecond extends AppCompatActivity {

    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

     btnClick = findViewById(R.id.clickMe);
     btnClick.setText("abcd");
     btnClick.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            Log.d("button_clicked","hi i am clicked");
         }
     });




        // Capture the layout's TextView and set the string as its text


    }
}