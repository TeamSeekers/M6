package com.example.seekers.wheresmystuff;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.ContactsContract;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 * This class represents the controller for the Login Screen
 * to handle the scenarios for a successful and unsuccessful login.
 *
 */
public class LoginScreenActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button enter;
    private Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        enter = (Button) findViewById(R.id.enterLogin);
        cancel = (Button) findViewById(R.id.cancelLogin);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = username.getText().toString();
                String pass = password.getText().toString();

                if (WelcomeScreenActivity.personList.getPersonList().get(pass) == null) {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(LoginScreenActivity.this);
                    builder1.setMessage("Incorrect username or password");
                    builder1.setCancelable(true);
                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                } else if (WelcomeScreenActivity.personList.getPersonList().get(pass).getUsername().equals(user)) {
                    Intent intent = new Intent(LoginScreenActivity.this, HomeScreenActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(LoginScreenActivity.this);
                    builder1.setMessage("Incorrect username or password");
                    builder1.setCancelable(true);
                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
