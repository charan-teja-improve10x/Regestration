package com.improve10x.regestration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CreditCardDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card_details);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
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
            identityIntent.putExtras(bundle);
            identityIntent.putExtra("Card Number", cardNumber);
            identityIntent.putExtra("Card Holder", cardHolder);
            identityIntent.putExtra("Expiry", expiry);
            identityIntent.putExtra("CVV", cvv);
            startActivity(identityIntent);
        });
    }
}