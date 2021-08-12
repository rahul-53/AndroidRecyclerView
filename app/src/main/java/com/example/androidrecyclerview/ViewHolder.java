package com.example.androidrecyclerview;

import android.media.Image;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvName;
    private TextView mTvAge;
    private ImageView mCloseImg;
    private OnItemClick onItemClick;

    public ViewHolder( View itemView, OnItemClick onItemClick) {
        super(itemView);
        this.onItemClick=onItemClick;
        initView(itemView);


    }

    private void initView(View itemView){
        mTvName=itemView.findViewById(R.id.tvName);

        mCloseImg=itemView.findViewById(R.id.ivCloseImg);


    }

    public void setData(ItemModal itemModal){
        mTvName.setText(itemModal.getName());
        mCloseImg.setImageResource(R.drawable.ic_close_button_svgrepo_com);
        mCloseImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClick.deleteItem(itemModal,getAdapterPosition());
            }
        });


    }

}
