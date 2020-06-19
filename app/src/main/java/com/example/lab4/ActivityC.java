/*

Name: Francisco Ozuna Diaz
Assignment: CS 7455 Lab 4
Lab Date: Due June 21, 2020 at 11:59 PM

 */

package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityC extends AppCompatActivity {
    Button backButtonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_activity);

        backButtonC = (Button) findViewById(R.id.button_back_c);
        backButtonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityC.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}