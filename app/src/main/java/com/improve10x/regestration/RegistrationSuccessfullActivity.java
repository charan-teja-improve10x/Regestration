package com.improve10x.regestration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RegistrationSuccessfullActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_successfull);
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
        String currentCompany = intent.getStringExtra("Current Company");
        String totalExperience = intent.getStringExtra("Total Experience");
        String designation = intent.getStringExtra("Designation");
        String bankName = intent.getStringExtra("Bank Name");
        String accountHolderName = intent.getStringExtra("Account Holder Name");
        String accountNumber = intent.getStringExtra("Account Number");
        String ifscCode = intent.getStringExtra("IFSC Code");
        String cardNumber = intent.getStringExtra("Card Number");
        String cardHolder = intent.getStringExtra("Card Holder");
        String expiry = intent.getStringExtra("Expiry");
        String cvv = intent.getStringExtra("CVV");
        String panNo = intent.getStringExtra("panNo.");
        String aadharNo = intent.getStringExtra("aadharNo.");
        TextView emailTxt = findViewById(R.id.email_txt);
        emailTxt.setText(email);
        TextView userNameTxt = findViewById(R.id.username_txt);
        userNameTxt.setText(userName);
        TextView firstNameTxt = findViewById(R.id.firstname_txt);
        firstNameTxt.setText(firstName);
        TextView lastNameTxt = findViewById(R.id.lastname_txt);
        lastNameTxt.setText(lastName);
        TextView houseNoTxt = findViewById(R.id.house_no_txt);
        houseNoTxt.setText(houseNo);
        TextView streetTxt = findViewById(R.id.street_txt);
        streetTxt.setText(street);
        TextView cityTxt = findViewById(R.id.city_txt);
        cityTxt.setText(city);
        TextView stateTxt = findViewById(R.id.state_txt);
        stateTxt.setText(state);
        TextView countryTxt = findViewById(R.id.country_txt);
        countryTxt.setText(country);
    }
}