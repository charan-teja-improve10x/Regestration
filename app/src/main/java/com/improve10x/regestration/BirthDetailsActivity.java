package com.improve10x.regestration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BirthDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_details);
        Intent intent = getIntent();
        Bundle bundle =  intent.getExtras();
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
           finish();
        });
        EditText dateOfBirthTxt = findViewById(R.id.date_of_birth_txt);
        dateOfBirthTxt.setText("04-01-2000");
        EditText placeOfBirthTxt = findViewById(R.id.palce_of_birth_txt);
        placeOfBirthTxt.setText("Mumbai");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String dateOfBirth = dateOfBirthTxt.getText().toString();
            String placeOfBirth = placeOfBirthTxt.getText().toString();
            Intent professionalIntent = new Intent(this, ProfessionalInfoActivity.class);
            professionalIntent.putExtras(bundle);
            professionalIntent.putExtra("DOB", dateOfBirth);
            professionalIntent.putExtra("POB", placeOfBirth);
            startActivity(professionalIntent);
        });
    }
}