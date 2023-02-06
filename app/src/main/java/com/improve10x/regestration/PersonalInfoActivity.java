package com.improve10x.regestration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
           finish();
        });
        EditText userNameTxt = findViewById(R.id.username_txt);
        userNameTxt.setText("cherry.teja");
        EditText firstNameTxt = findViewById(R.id.firstname_txt);
        firstNameTxt.setText("Charan Teja");
        EditText lastNameTxt = findViewById(R.id.lastname_txt);
        lastNameTxt.setText("Gundam");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String userName = userNameTxt.getText().toString();
            String firstName = firstNameTxt.getText().toString();
            String lastName = lastNameTxt.getText().toString();
            Intent addressIntent = new Intent(this, AddressActivity.class);
            addressIntent.putExtras(bundle);
            addressIntent.putExtra("User Name", userName);
            addressIntent.putExtra("First Name", firstName);
            addressIntent.putExtra("Last Name", lastName);
            startActivity(addressIntent);
        });
    }
}