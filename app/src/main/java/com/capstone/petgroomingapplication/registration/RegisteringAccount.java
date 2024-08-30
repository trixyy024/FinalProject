package com.capstone.petgroomingapplication.registration;


import com.capstone.petgroomingapplication.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class RegisteringAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registering_account);

        Button regAccount = findViewById(R.id.btnContinueReg);

        regAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisteringAccount.this, OTP_Verification.class);
                startActivity(intent);

            }
        });

    }
}