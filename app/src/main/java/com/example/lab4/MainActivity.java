/*

Name: Francisco Ozuna Diaz
Assignment: CS 7455 Lab 4
Lab Date: Due June 21, 2020 at 11:59 PM

 */

package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button triggerIntentButton;
    Intent browserIntent;
    final String url = "http://developer.android.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        triggerIntentButton = (Button) findViewById(R.id.button_triggerIntent);
        triggerIntentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                browserIntent.putExtra("url", url);
                browserIntent.setData(Uri.parse(url));

                if (browserIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(browserIntent);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "No Activity is matched!", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });
    }
}