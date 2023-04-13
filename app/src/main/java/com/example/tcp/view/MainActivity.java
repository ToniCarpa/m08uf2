package com.example.tcp.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tcp.R;
import com.example.tcp.adapter.MainAdapter;

public class MainActivity extends AppCompatActivity {
    MainAdapter mainAdapter;
    RecyclerView recyclerView;


    private static String URL = "https://run.mocky.io/v3/7123907d-cc8a-4d2c-a8cd-134d6d16ef78";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getMarvel();
    }
    private void getMarvel(){

    }

}