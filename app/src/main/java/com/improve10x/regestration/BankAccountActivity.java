package com.improve10x.regestration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BankAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_account);
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
        Toast.makeText(this, email + " / " + userName + " / " + firstName + " / " + lastName + " /" + houseNo + " / " + street + " / " + city + " / " + state + " / " + country + " / " + dateOfBirth + " / " + placeOfBirth + " / " + currentCompany + " / " + totalExperience + " / " + designation, Toast.LENGTH_SHORT).show();
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
           finish();
        });
        EditText bankNameTxt = findViewById(R.id.bank_name_txt);
        bankNameTxt.setText("SBI Bank");
        EditText accountHolderNameTxt = findViewById(R.id.account_holder_name_txt);
        accountHolderNameTxt.setText("Charan Teja Gundam");
        EditText accountNumberTxt = findViewById(R.id.account_number_txt);
        accountNumberTxt.setText("34439217855");
        EditText ifscCodeTxt = findViewById(R.id.ifsc_code_txt);
        ifscCodeTxt.setText("SBIN0014379");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String bankName = bankNameTxt.getText().toString();
            String accountHolderName = accountHolderNameTxt.getText().toString();
            String accountNumber = accountNumberTxt.getText().toString();
            String ifscCode = ifscCodeTxt.getText().toString();
            Intent creditIntent = new Intent(this, CreditCardDetailsActivity.class);
            creditIntent.putExtra("Email", email);
            creditIntent.putExtra("User Name", userName);
            creditIntent.putExtra("First Name", firstName);
            creditIntent.putExtra("Last Name", lastName);
            creditIntent.putExtra("House No.", houseNo);
            creditIntent.putExtra("Street", street);
            creditIntent.putExtra("City", city);
            creditIntent.putExtra("State", state);
            creditIntent.putExtra("Country", country);
            creditIntent.putExtra("DOB", dateOfBirth);
            creditIntent.putExtra("POB", placeOfBirth);
            creditIntent.putExtra("Current Company", currentCompany);
            creditIntent.putExtra("Total Experience", totalExperience);
            creditIntent.putExtra("Designation", designation);
            creditIntent.putExtra("Bank Name", bankName);
            creditIntent.putExtra("Account Holder Name", accountHolderName);
            creditIntent.putExtra("Account Number", accountNumber);
            creditIntent.putExtra("IFSC Code", ifscCode);
            startActivity(creditIntent);
        });
    }
}