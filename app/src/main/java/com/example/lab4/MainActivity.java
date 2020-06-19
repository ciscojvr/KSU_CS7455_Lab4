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
    Intent intent;
    final String url = "http://developer.android.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        triggerIntentButton = (Button) findViewById(R.id.button_triggerIntent);
        triggerIntentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                startActivity(intent);
                intent = new Intent();
                intent.setAction("myAction");
                intent.addCategory("myCategory");
                intent.putExtra("url", url);
                intent.setData(Uri.parse(url));

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "No Activtiy is matched!", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });
    }
}