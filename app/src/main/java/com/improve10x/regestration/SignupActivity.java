package com.improve10x.regestration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        EditText emailTxt = findViewById(R.id.email_txt);
        emailTxt.setText("charan.t@improve10x.com");
        Button nextbtn = findViewById(R.id.next_btn);
        nextbtn.setOnClickListener(v -> {
            String email = emailTxt.getText().toString();
            EditText passwordTxt = findViewById(R.id.pasword_txt);
            String password = passwordTxt.getText().toString();
            EditText confirmPasswordTxt = findViewById(R.id.confirm_password_txt);
            String confirmPassword = confirmPasswordTxt.getText().toString();
            Intent personalIntent = new Intent(this, PersonalInfoActivity.class);
            personalIntent.putExtra("Email", email);
            startActivity(personalIntent);
        });
    }
}