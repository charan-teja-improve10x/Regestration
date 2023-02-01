package com.improve10x.regestration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreditCardDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card_details);
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
        Toast.makeText(this, email + " / " + userName + " / " + firstName + " / " + lastName + " /" + houseNo + " / " + street + " / " + city + " / " + state + " / " + country + " / " + dateOfBirth + " / " + placeOfBirth + " / " + currentCompany + " / " + totalExperience + " / " + designation + " / " + bankName + " / " + accountHolderName + " / " + accountNumber + " / " + ifscCode, Toast.LENGTH_SHORT).show();
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
        EditText cardNumberTxt = findViewById(R.id.card_number_txt);
        cardNumberTxt.setText("6074 3101 9868 6108");
        EditText cardHolderTxt = findViewById(R.id.card_holder_txt);
        cardHolderTxt.setText("GUNDAM CHARAN TEJA");
        EditText expairyTxt = findViewById(R.id.expairy_txt);
        expairyTxt.setText("08/2024");
        EditText cvvTxt = findViewById(R.id.cvv_txt);
        cvvTxt.setText("231");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String cardNumber = cardNumberTxt.getText().toString();
            String cardHolder = cardHolderTxt.getText().toString();
            String expiry = expairyTxt.getText().toString();
            String cvv = cvvTxt.getText().toString();
            Intent identityIntent = new Intent(this, IdentityActivity.class);
            identityIntent.putExtra("Email", email);
            identityIntent.putExtra("User Name", userName);
            identityIntent.putExtra("First Name", firstName);
            identityIntent.putExtra("Last Name", lastName);
            identityIntent.putExtra("House No.", houseNo);
            identityIntent.putExtra("Street", street);
            identityIntent.putExtra("City", city);
            identityIntent.putExtra("State", state);
            identityIntent.putExtra("Country", country);
            identityIntent.putExtra("DOB", dateOfBirth);
            identityIntent.putExtra("POB", placeOfBirth);
            identityIntent.putExtra("Current Company", currentCompany);
            identityIntent.putExtra("Total Experience", totalExperience);
            identityIntent.putExtra("Designation", designation);
            identityIntent.putExtra("Bank Name", bankName);
            identityIntent.putExtra("Account Holder Name", accountHolderName);
            identityIntent.putExtra("Account Number", accountNumber);
            identityIntent.putExtra("IFSC Code", ifscCode);
            identityIntent.putExtra("Card Number", cardNumber);
            identityIntent.putExtra("Card Holder", cardHolder);
            identityIntent.putExtra("Expiry", expiry);
            identityIntent.putExtra("CVV", cvv);
            startActivity(identityIntent);
        });
    }
}