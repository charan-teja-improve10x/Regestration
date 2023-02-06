package com.improve10x.regestration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        Intent intent = getIntent();
       Bundle bundle = intent.getExtras();
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
           finish();
        });
        EditText houseNoTxt = findViewById(R.id.house_no_txt);
        houseNoTxt.setText("4-36, Ramu Apartments");
        EditText streetTxt = findViewById(R.id.street_txt);
        streetTxt.setText("NGOs Colony");
        EditText cityTxt = findViewById(R.id.city_txt);
        cityTxt.setText("Nandyal");
        EditText stateTxt = findViewById(R.id.state_txt);
        stateTxt.setText("Andhra Pradesh");
        EditText countryTxt = findViewById(R.id.country_txt);
        countryTxt.setText("India");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String houseNumber = houseNoTxt.getText().toString();
            String street = streetTxt.getText().toString();
            String city = cityTxt.getText().toString();
            String state = stateTxt.getText().toString();
            String country = countryTxt.getText().toString();
            Intent birthDetailsIntent = new Intent(this, BirthDetailsActivity.class);
            birthDetailsIntent.putExtras(bundle);
            birthDetailsIntent.putExtra("House No.", houseNumber);
            birthDetailsIntent.putExtra("Street", street);
            birthDetailsIntent.putExtra("City", city);
            birthDetailsIntent.putExtra("State", state);
            birthDetailsIntent.putExtra("Country", country);
            startActivity(birthDetailsIntent);
        });
    }
}