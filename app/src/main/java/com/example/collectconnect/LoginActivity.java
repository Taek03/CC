package com.example.collectconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogIn, btnRegi, btnFindIdPwPage;
        btnLogIn = findViewById(R.id.btnLogIn);
        btnRegi = findViewById(R.id.btnRegi);
        btnFindIdPwPage = findViewById(R.id.btnFindIdPwPage);
        btnRegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TermsOfUseActivity.class);
                startActivity(intent);
            }
        });
        btnFindIdPwPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Find_IdPw.class);
                startActivity(intent);
            }
        });
    }
}