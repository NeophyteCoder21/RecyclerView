package com.neophytecoder.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Neophyte Coder on 15/12/16.
 */
public class FruitsAdapter extends RecyclerView.Adapter<FruitsHolder> {
    private String[] mArray;

    public FruitsAdapter(String[] array) {
        mArray = array;
    }

    @Override
    public FruitsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.iems_fruits, parent, false);
        return new FruitsHolder(view);
    }

    @Override
    public void onBindViewHolder(FruitsHolder holder, int position) {
                holder.populate(mArray[position]);
    }

    @Override
    public int getItemCount() {
        return mArray.length;
    }
}
