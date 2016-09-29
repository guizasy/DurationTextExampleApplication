package com.gzmachado.durationtextapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DurationTextView durationView1 = (DurationTextView) findViewById(R.id.correndo);
        durationView1.setDuration(25);

        DurationTextView durationView2 = (DurationTextView) findViewById(R.id.caminhando);
        durationView2.setDuration(25);

        DurationTextView durationView3 = (DurationTextView) findViewById(R.id.pedalando);
        durationView3.setDuration(25);
    }
}