package com.improve10x.regestration;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class IdentityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Identity");
        actionBar.setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

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

            Intent successIntent = new Intent(this, RegistrationSuccessfullActivity.class);
            successIntent.putExtras(bundle);
            successIntent.putExtra("panNo.", panNumber);
            successIntent.putExtra("aadharNo.", aadharNumber);
            startActivity(successIntent);
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            Toast.makeText(this, "pothunnaaaa", Toast.LENGTH_LONG).show();
            finish();
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.identity_menu,menu);
        return true;
    }
}