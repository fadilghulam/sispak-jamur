package com.example.jamurtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("AJIB - Apakah Jamur Ini Beracun");

        findViewById(R.id.buttonHome).setOnClickListener(
                view -> startActivity(new Intent(MainActivity.this, HomeActivity.class))
        );
    }
}