package com.example.seekers.wheresmystuff;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginScreenActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
    }

    protected void onEnterPressed(View view) {
        String user = username.getText().toString();
        String pass = password.getText().toString();
        if (WelcomeScreenActivity.personList.getPersonList().get(pass) == null) {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setMessage("Incorrect username or password");
            builder1.setCancelable(true);
            AlertDialog alert11 = builder1.create();
            alert11.show();
        } else if (WelcomeScreenActivity.personList.getPersonList().get(pass).getUsername().equals(user)) {
            Intent intent = new Intent(LoginScreenActivity.this, HomeScreenActivity.class);
            startActivity(intent);
            finish();
        } else {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setMessage("Incorrect username or password");
            builder1.setCancelable(true);
            AlertDialog alert11 = builder1.create();
            alert11.show();
        }
    }

    protected void onCancelPressed(View view){
        finish();
    }
}
