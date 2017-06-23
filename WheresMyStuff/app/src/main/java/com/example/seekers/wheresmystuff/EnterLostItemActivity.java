package com.example.seekers.wheresmystuff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EnterLostItemActivity extends AppCompatActivity {

    private EditText enterNameOfItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_lost_item);
        enterNameOfItem = (EditText) findViewById(R.id.enterNameOfItem);
    }

    protected void onEnterLostItemButtonClicked(View view) {
        LostItem newLostItem = new LostItem(enterNameOfItem.getText().toString());
        WelcomeScreenActivity.lostItemList.getLostItemList().add(newLostItem);
        finish();
    }

    protected void onCancelEnterItemClicked(View view) {
        finish();
    }
}
