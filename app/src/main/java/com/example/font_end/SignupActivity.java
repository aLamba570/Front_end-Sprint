package com.example.font_end;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class SignupActivity extends AppCompatActivity {

    EditText name, lname, email, password;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        name = findViewById(R.id.fname);
        lname = findViewById(R.id.Lname);
        email = findViewById(R.id.email);
        password = findViewById(R.id.passwordd);
        img = findViewById(R.id.signupbtn);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignupActivity.this, HomeActivity.class));
            }
        });
    }
}