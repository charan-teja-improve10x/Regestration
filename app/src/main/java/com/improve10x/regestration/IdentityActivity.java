package com.improve10x.regestration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class IdentityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity);
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
        Toast.makeText(this, email + " / " + userName + " / " + firstName + " / " + lastName + " /" + houseNo + " / " + street + " / " + city + " / " + state + " / " + country + " / " + dateOfBirth + " / " + placeOfBirth + " / " + currentCompany + " / " + totalExperience + " / " + designation + " / " + bankName + " / " + accountHolderName + " / " + accountNumber + " / " + ifscCode + " / " + cardNumber + " / " + cardHolder + " / " + expiry + " / " + cvv, Toast.LENGTH_SHORT).show();
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
           finish();
        });
        EditText panNumberBtn = findViewById(R.id.pan_number_txt);
        panNumberBtn.setText("ABCD12345G");
        EditText aadharNumberTxt = findViewById(R.id.aadhar_number_txt);
        aadharNumberTxt.setText("9846 0329 9538");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String panNumber = panNumberBtn.getText().toString();
            String aadharNumber = aadharNumberTxt.getText().toString();

            Intent successIntent = new Intent(this,RegistrationSuccessfullActivity.class);
            successIntent.putExtra("Email", email);
            successIntent.putExtra("User Name", userName);
            successIntent.putExtra("First Name", firstName);
            successIntent.putExtra("Last Name", lastName);
            successIntent.putExtra("House No.", houseNo);
            successIntent.putExtra("Street", street);
            successIntent.putExtra("City", city);
            successIntent.putExtra("State", state);
            successIntent.putExtra("Country", country);
            successIntent.putExtra("DOB", dateOfBirth);
            successIntent.putExtra("POB", placeOfBirth);
            successIntent.putExtra("Current Company", currentCompany);
            successIntent.putExtra("Total Experience", totalExperience);
            successIntent.putExtra("Designation", designation);
            successIntent.putExtra("Bank Name", bankName);
            successIntent.putExtra("Account Holder Name", accountHolderName);
            successIntent.putExtra("Account Number", accountNumber);
            successIntent.putExtra("IFSC Code", ifscCode);
            successIntent.putExtra("Card Number", cardNumber);
            successIntent.putExtra("Card Holder", cardHolder);
            successIntent.putExtra("Expiry", expiry);
            successIntent.putExtra("CVV", cvv);
            successIntent.putExtra("panNo.", panNumber);
            successIntent.putExtra("aadharNo.", aadharNumber);
            startActivity(successIntent);
        });
    }
}