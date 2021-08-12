package com.example.androidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClick{

    RecyclerView recyclerView;
    ArrayList<ItemModal> arrayList =new ArrayList<>();
    Button addBtn;
    Button removeBtn;
    Adapter adapter =new Adapter(arrayList, this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildData();
        setRecyclerView();
    }
    private void initView(){
        recyclerView=findViewById(R.id.recyclerView);
        addBtn=findViewById(R.id.tvAddBtn);
    }

    private void buildData(){
        ItemModal itemModal1= new ItemModal("rahul",R.drawable.ic_close_button_svgrepo_com);
        ItemModal itemModal2= new ItemModal("rohit",R.drawable.ic_close_button_svgrepo_com);
        ItemModal itemModal3= new ItemModal("ritik",R.drawable.ic_close_button_svgrepo_com);
        ItemModal itemModal4= new ItemModal("mohit",R.drawable.ic_close_button_svgrepo_com);
        arrayList.add(itemModal1);
        arrayList.add(itemModal2);
        arrayList.add(itemModal3);
        arrayList.add(itemModal4);

    }

    public void setRecyclerView(){

        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void deleteItem(ItemModal itemModal, int position) {
        arrayList.remove(position);
        adapter.notifyItemRemoved(position);
    }
}