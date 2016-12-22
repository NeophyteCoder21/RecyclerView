package com.neophytecoder.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


/**
 * Created by Neophyte Coder on 15/12/16.
 */
public class FruitsHolder extends RecyclerView.ViewHolder {

    TextView textView;
    public FruitsHolder(View itemView) {
        super(itemView);

        textView = (TextView)itemView.findViewById(R.id.tv_fruits);
    }

    public void populate(String s) {
        textView.setText(s);
    }
}
