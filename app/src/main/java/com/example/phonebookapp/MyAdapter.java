package com.example.phonebookapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.phonebookapp.databinding.ItemCardBinding;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.userViewHolder> {

    private Context context;

    public MyAdapter(Context context, ArrayList<User> userArrayList) {
        this.context = context;
        this.userArrayList = userArrayList;
    }

    private ArrayList<User> userArrayList;

    @NonNull
    @Override
    public userViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemCardBinding binding = DataBindingUtil
                .inflate(
                        LayoutInflater.from(parent.getContext())
                        ,R.layout.item_card,
                        parent,false);
        return new userViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull userViewHolder holder, int position) {
        User currentUser = userArrayList.get(position);
        holder.itemCardBinding.setUser(currentUser);

    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }


    public class userViewHolder extends RecyclerView.ViewHolder {
        private ItemCardBinding itemCardBinding;
        public userViewHolder(ItemCardBinding itemCardBinding) {
            super(itemCardBinding.getRoot());
            this.itemCardBinding = itemCardBinding;

            itemCardBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                }
            });



        }
    }

}
