package com.improve10x.regestration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BankAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_account);
        Intent intent = getIntent();
       Bundle bundle = intent.getExtras();
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
            creditIntent.putExtras(bundle);
            creditIntent.putExtra("Bank Name", bankName);
            creditIntent.putExtra("Account Holder Name", accountHolderName);
            creditIntent.putExtra("Account Number", accountNumber);
            creditIntent.putExtra("IFSC Code", ifscCode);
            startActivity(creditIntent);
        });
    }
}