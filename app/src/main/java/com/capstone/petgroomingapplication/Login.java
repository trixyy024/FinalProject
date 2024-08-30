package com.capstone.petgroomingapplication;



import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.capstone.petgroomingapplication.customer.Dashboard;
import com.capstone.petgroomingapplication.groomer.Groomer_Dashboard;
import com.capstone.petgroomingapplication.registration.Registration;
import com.hbb20.CountryCodePicker;


public class Login extends AppCompatActivity {

    CountryCodePicker countryCodePicker;
    EditText phoneInputNumber;
    Button continueMobileNo;
    Spinner userSpinner;
    Button googleContinue;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView btnReg = findViewById(R.id.btnRegister);
        //progressBar = findViewById(R.id.progressBar);
        userSpinner = findViewById(R.id.userSpinner);
        continueMobileNo = findViewById(R.id.continue_MobileNo);
        googleContinue = findViewById(R.id.continue_google);
        phoneInputNumber = findViewById(R.id.phoneNumber);
        countryCodePicker = findViewById(R.id.countryCodePick);

        countryCodePicker.registerCarrierNumberEditText(phoneInputNumber);

        continueMobileNo.setOnClickListener(v -> {

            Intent intent = new Intent(Login.this, com.capstone.petgroomingapplication.conTry.class);
          startActivity(intent);
            /**
            String selectedUserType = userSpinner.getSelectedItem().toString();

            switch (selectedUserType) {
                case "Admin": {
                   // if(!countryCodePicker.isValidFullNumber()){
                   //     phoneInputNumber.setError("Phone number not valid");
                     //   return;
                   // }
                    Intent intent = new Intent(Login.this, com.capstone.petgroomingapplication.admin.Dashboard.class);
                    //intent.putExtra("phone", countryCodePicker.getFullNumberWithPlus());
                    startActivity(intent);
                    break;
                }

                case "Groomer": {
                    Intent intent = new Intent(Login.this, Groomer_Dashboard.class);
                    startActivity(intent);

                    break;
                }
                case "Customer": {
                    Intent intent = new Intent(Login.this, Dashboard.class);
                    startActivity(intent);
                    break;
                }
            }
**/
        });
        googleContinue.setOnClickListener(v -> {
            //google button
        });

        btnReg.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, Registration.class);
            startActivity(intent);
        });



    }
}