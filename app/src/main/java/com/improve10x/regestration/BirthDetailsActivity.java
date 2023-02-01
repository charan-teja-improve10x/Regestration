package com.improve10x.regestration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BirthDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_details);
        Intent intent = getIntent();
        String email = intent.getStringExtra("Email");
        String userName = intent.getStringExtra("User Name");
        String firstName = intent.getStringExtra("First Name");
        String lastName = intent.getStringExtra("Last Name");
        String houseNo = intent.getStringExtra("House No.");
        String street = intent.getStringExtra("Street");
        String city = intent.getStringExtra("City");
        String state = intent.getStringExtra("State");
        String country = intent.getStringExtra("Country");
        Toast.makeText(this, email + " / " + userName + " / " + firstName + " / " + lastName + " / " + houseNo + " / " + street + " / " + city + " / " + state + " / " + country, Toast.LENGTH_SHORT).show();
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
           finish();
        });
        EditText dateOfBirthTxt = findViewById(R.id.date_of_birth_txt);
        dateOfBirthTxt.setText("04-01-2000");
        EditText placeOfBirthTxt = findViewById(R.id.palce_of_birth_txt);
        placeOfBirthTxt.setText("Mumbai");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String dateOfBirth = dateOfBirthTxt.getText().toString();
            String placeOfBirth = placeOfBirthTxt.getText().toString();
            Intent professionalIntent = new Intent(this, ProfessionalInfoActivity.class);
            professionalIntent.putExtra("Email", email);
            professionalIntent.putExtra("User Name", userName);
            professionalIntent.putExtra("First Name", firstName);
            professionalIntent.putExtra("Last Name", lastName);
            professionalIntent.putExtra("House No.", houseNo);
            professionalIntent.putExtra("Street", street);
            professionalIntent.putExtra("City",city);
            professionalIntent.putExtra("State", state);
            professionalIntent.putExtra("Country", country);
            professionalIntent.putExtra("DOB", dateOfBirth);
            professionalIntent.putExtra("POB", placeOfBirth);
            startActivity(professionalIntent);
        });
    }
}