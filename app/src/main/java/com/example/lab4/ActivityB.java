package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {
    Button backButtonB;
    TextView uri_b_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_activity);

        String url = getIntent().getStringExtra("url");

        uri_b_textView = (TextView) findViewById(R.id.textView_uri_b);
        uri_b_textView.setText("URI: " + url + " in Activity B");

        backButtonB = (Button) findViewById(R.id.button_back_b);
        backButtonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityB.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}