package com.example.deepfakedetector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button submit;
    String usernameResult,passwordResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        submit = findViewById(R.id.submitBtn);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RecieverActivity.class);
                usernameResult = username.getText().toString();
                intent.putExtra("value",usernameResult);
                startActivity(intent);
                finish();
            }
        });
    }
}