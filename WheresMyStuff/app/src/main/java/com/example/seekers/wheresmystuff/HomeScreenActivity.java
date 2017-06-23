package com.example.seekers.wheresmystuff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    protected void onLostClicked(View view) {
        Intent intent = new Intent(HomeScreenActivity.this, EnterLostItemActivity.class);
        startActivity(intent);
    }

    protected void onViewLostItemsClicked(View view) {
        Intent intent = new Intent(HomeScreenActivity.this, LostItemsListActivity.class);
        startActivity(intent);
    }

    protected void onLogoutPressed(View view){
        finish();
    }
}
