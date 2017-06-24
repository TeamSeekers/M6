package com.example.seekers.wheresmystuff;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.text.Layout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import org.w3c.dom.Text;

import java.util.List;

public class FoundItemsListActivity extends AppCompatActivity {

    private ListView itemsList;
    private ArrayAdapter adapter;
    private Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost_items_list);
        itemsList = (ListView) findViewById(R.id.itemsList);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, WelcomeScreenActivity.foundItemList.getFoundItemList());
        itemsList.setAdapter(adapter);
        home = (Button) findViewById(R.id.backToHome);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
