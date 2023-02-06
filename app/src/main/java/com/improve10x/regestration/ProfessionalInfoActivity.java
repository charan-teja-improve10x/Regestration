package com.improve10x.regestration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ProfessionalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional_info);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
           finish();
        });
        EditText currentCompanyTxt = findViewById(R.id.current_company_txt);
        currentCompanyTxt.setText("Improve 10X");
        EditText totalExperienceTxt = findViewById(R.id.total_experience_txt);
        totalExperienceTxt.setText("60 days");
        EditText designationTxt = findViewById(R.id.designation_txt);
        designationTxt.setText("Trainer");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String currentCompany = currentCompanyTxt.getText().toString();
            String totalExperience = totalExperienceTxt.getText().toString();
            String designation = designationTxt.getText().toString();
            Intent bankIntent = new Intent(this, BankAccountActivity.class);
            bankIntent.putExtras(bundle);
            bankIntent.putExtra("Current Company", currentCompany);
            bankIntent.putExtra("Total Experience", totalExperience);
            bankIntent.putExtra("Designation", designation);
            startActivity(bankIntent);
        });
    }
}