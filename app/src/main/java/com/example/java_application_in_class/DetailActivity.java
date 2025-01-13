package com.example.java_application_in_class;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Get the data from the intent
        String message = getIntent().getStringExtra("message");

        // Set the text view to display the data
        TextView textViewDetails = findViewById(R.id.textViewDetails);
        textViewDetails.setText(message);
    }
}
