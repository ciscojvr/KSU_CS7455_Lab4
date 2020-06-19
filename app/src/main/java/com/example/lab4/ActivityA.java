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
import android.widget.TextView;

public class ActivityA extends AppCompatActivity {
    Button backButtonA;
    TextView uri_a_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_activity);

        String url = getIntent().getStringExtra("url");

        uri_a_textView = (TextView) findViewById(R.id.textView_uri_a);
        uri_a_textView.setText("URI: " + url + " in Activity A");

        backButtonA = (Button) findViewById(R.id.button_back_a);
        backButtonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityA.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}