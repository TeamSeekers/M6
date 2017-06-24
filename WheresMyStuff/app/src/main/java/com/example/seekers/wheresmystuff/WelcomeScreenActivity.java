package com.example.seekers.wheresmystuff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;

public class WelcomeScreenActivity extends AppCompatActivity {

    private Button login;
    private Button registration;
    public static PersonList personList;
    public static LostItemList lostItemList;
    public static FoundItemList foundItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        login = (Button) findViewById(R.id.login);
        registration = (Button) findViewById(R.id.registration);
        personList = new PersonList();
        lostItemList = new LostItemList();
        foundItemList = new FoundItemList();
        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeScreenActivity.this, RegistrationScreenActivity.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeScreenActivity.this, LoginScreenActivity.class);
                startActivity(intent);
            }
        });
    }
}
