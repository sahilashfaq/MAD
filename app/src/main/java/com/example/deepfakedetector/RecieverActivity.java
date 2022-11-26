package com.example.deepfakedetector;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class RecieverActivity extends AppCompatActivity {

    TextView username;
    String usernameResult;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciever);
        username = findViewById(R.id.username);
        usernameResult = getIntent().getExtras().getString("value");
        username.setText(usernameResult);
    }
}