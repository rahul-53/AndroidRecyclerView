package com.example.androidrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    ArrayList<ItemModal> arrayList;
    OnItemClick onItemClick;



    public Adapter(ArrayList<ItemModal>arrayList, OnItemClick onItemClick){
        this.arrayList=arrayList;
        this.onItemClick=onItemClick;
    }
    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view,onItemClick);
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        ItemModal itemModal=arrayList.get(position);
        holder.setData(itemModal);

    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }


}
