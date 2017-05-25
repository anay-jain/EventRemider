package com.example.anaypresent.eventremider;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by anaypresent on 25/5/17.
 */

public class Settings extends AppCompatActivity {
    private RecyclerView settings_recyclerView;
    private RecyclerView.LayoutManager settings_layoutManager;
    private RecyclerView.Adapter settings_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        settings_recyclerView = (RecyclerView) findViewById(R.id.settings_recycler_view);
        // in content do not change the layout size of the recycler view
        settings_recyclerView.setHasFixedSize(true);
        // using a linear layout manager
        settings_layoutManager = new LinearLayoutManager(this);
        settings_recyclerView.setLayoutManager(settings_layoutManager);
        //specify an adapter
        // TODO settings_adapter = new MyAdapter(data)
            settings_recyclerView.setAdapter(settings_adapter);

    }

}

