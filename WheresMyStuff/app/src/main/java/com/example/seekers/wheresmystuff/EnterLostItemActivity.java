package com.example.seekers.wheresmystuff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnterLostItemActivity extends AppCompatActivity {

    private EditText enterNameOfItem;
    private EditText enterColorOfItem;
    private EditText enterDescriptionOfItem;
    private Button cancelEnter;
    private Button enterFoundItem;
    private static int lostItemCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_lost_item);
        enterNameOfItem = (EditText) findViewById(R.id.enterNameOfItem);
        enterColorOfItem = (EditText) findViewById(R.id.enterLostColor);
        enterDescriptionOfItem = (EditText) findViewById(R.id.enterLostItemDescription);
        cancelEnter = (Button) findViewById(R.id.cancelEnterItem);
        enterFoundItem = (Button) findViewById(R.id.enterLostItemButton);

        cancelEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        enterFoundItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = enterNameOfItem.getText().toString();
                String color = enterColorOfItem.getText().toString();
                String description = enterDescriptionOfItem.getText().toString();
                LostItem newLostItem = new LostItem(name, color, description);
                WelcomeScreenActivity.lostItemList.getLostItemList().add(newLostItem);
                WelcomeScreenActivity.myRef.child("LostItem" + lostItemCount).setValue(newLostItem);
                lostItemCount++;
                finish();
            }
        });
    }
}
