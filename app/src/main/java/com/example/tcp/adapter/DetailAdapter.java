package com.example.tcp.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.MyDetailAdapter> {
    @NonNull
    @Override
    public DetailAdapter.MyDetailAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DetailAdapter.MyDetailAdapter holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyDetailAdapter extends RecyclerView.ViewHolder {

        public MyDetailAdapter(@NonNull View itemView) {
            super(itemView);
        }
    }
}
