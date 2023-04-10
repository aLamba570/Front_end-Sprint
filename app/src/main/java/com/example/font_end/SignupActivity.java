package com.example.font_end;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {

    EditText name, lname, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        name = findViewById(R.id.fname);
        lname = findViewById(R.id.Lname);
        email = findViewById(R.id.email);
        password = findViewById(R.id.passwordd);
    }
}