package com.improve10x.regestration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfessionalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional_info);
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
        String dateOfBirth = intent.getStringExtra("DOB");
        String placeOfBirth = intent.getStringExtra("POB");
        Toast.makeText(this, email + " / " + userName + " / " + firstName + " / " + lastName + " /" + houseNo + " / " + street + " / " + city + " / " + state + " / " + country + " / " + dateOfBirth + " / " + placeOfBirth, Toast.LENGTH_SHORT).show();
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
           finish();
        });
        EditText currentCompanyTxt = findViewById(R.id.current_company_txt);
        currentCompanyTxt.setText("Improve 10X");
        EditText totalExperienceTxt = findViewById(R.id.total_experience_txt);
        totalExperienceTxt.setText("60 days");
        EditText designationTxt = findViewById(R.id.designation_txt);
        designationTxt.setText("Trainer");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String currentCompany = currentCompanyTxt.getText().toString();
            String totalExperience = totalExperienceTxt.getText().toString();
            String designation = designationTxt.getText().toString();
            Intent bankIntent = new Intent(this, BankAccountActivity.class);
            bankIntent.putExtra("Email", email);
            bankIntent.putExtra("User Name", userName);
            bankIntent.putExtra("First Name", firstName);
            bankIntent.putExtra("Last Name", lastName);
            bankIntent.putExtra("House No.", houseNo);
            bankIntent.putExtra("Street", street);
            bankIntent.putExtra("City", city);
            bankIntent.putExtra("State", state);
            bankIntent.putExtra("Country", country);
            bankIntent.putExtra("DOB", dateOfBirth);
            bankIntent.putExtra("POB", placeOfBirth);
            bankIntent.putExtra("Current Company", currentCompany);
            bankIntent.putExtra("Total Experience", totalExperience);
            bankIntent.putExtra("Designation", designation);
            startActivity(bankIntent);
        });
    }
}