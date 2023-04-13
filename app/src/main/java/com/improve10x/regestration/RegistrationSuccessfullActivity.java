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
        Bundle bundle = intent.getExtras();
        TextView emailTxt = findViewById(R.id.email_txt);
//        emailTxt.setText(email);
//        TextView userNameTxt = findViewById(R.id.username_txt);
//        userNameTxt.setText(userName);
//        TextView firstNameTxt = findViewById(R.id.firstname_txt);
//        firstNameTxt.setText(firstName);
//        TextView lastNameTxt = findViewById(R.id.lastname_txt);
//        lastNameTxt.setText(lastName);
//        TextView houseNoTxt = findViewById(R.id.house_no_txt);
//        houseNoTxt.setText(houseNo);
//        TextView streetTxt = findViewById(R.id.street_txt);
//        streetTxt.setText(street);
//        TextView cityTxt = findViewById(R.id.city_txt);
//        cityTxt.setText(city);
//        TextView stateTxt = findViewById(R.id.state_txt);
//        stateTxt.setText(state);
//        TextView countryTxt = findViewById(R.id.country_txt);
//        countryTxt.setText(country);
//        TextView dateOfBirthTxt = findViewById(R.id.date_of_birth_txt);
//        dateOfBirthTxt.setText(dateOfBirth);
    }
}