package com.example.java_application_in_class;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    final String message = "Android: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.single_scroll_view);

        // row 1 on click
        final LinearLayout row1 = findViewById(R.id.row1);
        row1.setOnClickListener(this::onClick);
    }


    // on row click
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("message", "row 1 clicked");
        startActivity(intent);
    }

    // on start of the app
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(message, "the app is starting");
        // TODO: add your code here
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d(message, "the app is resuming");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(message, "the app is pausing");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d(message, "the app is stopping");
    }

    // app on destroy
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(message, "the app is destroying");
    }

}