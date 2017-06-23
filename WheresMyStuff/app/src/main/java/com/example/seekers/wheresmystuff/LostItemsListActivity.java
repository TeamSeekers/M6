package com.example.seekers.wheresmystuff;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import org.w3c.dom.Text;

import java.util.List;

public class LostItemsListActivity extends AppCompatActivity {

    private ListView itemsList;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost_items_list);
        itemsList = (ListView) findViewById(R.id.itemsList);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, WelcomeScreenActivity.lostItemList.getLostItemList());
        itemsList.setAdapter(adapter);
    }

    protected void onBackToHomeClicked(View view) {
        finish();
    }
}
