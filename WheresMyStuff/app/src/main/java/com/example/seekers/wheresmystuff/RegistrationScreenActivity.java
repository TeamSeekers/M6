package com.example.seekers.wheresmystuff;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ThemedSpinnerAdapter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.EventListener;

public class RegistrationScreenActivity extends AppCompatActivity {

    private EditText enterName;
    private EditText enterUsername;
    private EditText enterPassword;
    private Button registrationEnter;
    private RadioButton userAccountType;
    private RadioButton adminAccountType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_screen);

        enterName = (EditText) findViewById(R.id.enterName);
        enterUsername = (EditText) findViewById(R.id.enterUsername);
        enterPassword = (EditText) findViewById(R.id.enterPassword);
        registrationEnter = (Button) findViewById(R.id.registrationEnter);
        userAccountType = (RadioButton) findViewById(R.id.userAccountType);
        adminAccountType = (RadioButton) findViewById(R.id.adminAccountType);
    }

    protected void onRegistrationEnterPressed(View view) {
        String account = "";
        String newUserName = enterUsername.getText().toString();
        String newPassword = enterPassword.getText().toString();
        if (userAccountType.isChecked()) {
            account = "User";
            User newUser = new User(enterName.getText().toString(),
                    newUserName, newPassword, account);
            WelcomeScreenActivity.personList.getPersonList().put(newUser.getPassword(), newUser);
        } else {
            account = "Admin";
            Admin newAdmin = new Admin(enterName.getText().toString(),
                    newUserName, newPassword, account);
            WelcomeScreenActivity.personList.getPersonList().put(newAdmin.getPassword(), newAdmin);
        }
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Registration Successful");
        builder1.setCancelable(true);
        AlertDialog alert11 = builder1.create();
        alert11.show();
        finish();
    }

    protected void onRegistrationCancelPressed(View view) {
        finish();
    }

}
