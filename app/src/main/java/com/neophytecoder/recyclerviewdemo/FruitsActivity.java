package com.neophytecoder.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class FruitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        String[] array = getResources().getStringArray(R.array.fruits);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rcv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        DividerItemDecoration itemDecoration = new DividerItemDecoration(this, layoutManager.getOrientation());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(itemDecoration);

        recyclerView.setAdapter(new FruitsAdapter(array));
    }
}
