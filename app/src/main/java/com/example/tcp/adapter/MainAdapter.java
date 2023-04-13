package com.example.tcp.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tcp.R;
import com.example.tcp.model.Marvel;
import com.example.tcp.view.DetailActivity;
import com.example.tcp.view.MainActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {
    private Context context;
    private List<Marvel> marvelList;

    public MainAdapter(Context context, List<Marvel> marvelList) {
        this.context = context;
        this.marvelList = marvelList;
    }

    @NonNull
    @Override
    public MainAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.main_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.MyViewHolder holder, int position) {
        Picasso.get().load(marvelList.get(position).getUrlToImage())
                .fit()
                .centerCrop()
                .into(holder.imageView);
        holder.textView.setText(marvelList.get(position).getTitle());

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetailActivity.class);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                }
                context.startActivity(i);

            }
        });

    }

    @Override
    public int getItemCount() {
        return marvelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        ConstraintLayout constraintLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.rowTitMain);
            imageView = itemView.findViewById(R.id.rowImageMain);

            constraintLayout = itemView.findViewById(R.id.layoutMain);
        }
    }
}
