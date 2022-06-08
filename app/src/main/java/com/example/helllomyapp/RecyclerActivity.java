package com.example.helllomyapp;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerActivity extends AppCompatActivity {
   // String[] countries = new String[]{"india","saudi","iran","afghanistan","india","saudi","iran","afghanistan","india","saudi","iran","afghanistan"};
    String[] countries = new String[]{"india","saudi","iran","afghanistan","india","saudi","iran","afghanistan","india","saudi","iran","afghanistan",
            "india","saudi","iran","afghanistan","india","saudi","iran","afghanistan","india","saudi","iran","afghanistan",
            "india","saudi","iran","afghanistan","india","saudi","iran","afghanistan","india","saudi","iran","afghanistan"};

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
    }
    @Override
    protected void onStart() {
        super.onStart();
        RecyclerView cRecyclerView = findViewById(R.id.recyclerView);
        CountriesAdapter adapter = new CountriesAdapter(countries);
        cRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        cRecyclerView.setAdapter(adapter);
    }
}
