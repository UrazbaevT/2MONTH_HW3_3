package com.example.a2monthhw3_3;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesViewHolder> {

    private ArrayList<String> countriesList;

    public CountriesAdapter(ArrayList<String> countriesList) {
        this.countriesList = countriesList;
    }

    @SuppressLint("ResourceType")
    @NonNull
    @Override
    public CountriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountriesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_countries, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountriesViewHolder holder, int position) {
        holder.bind(countriesList.get(position));
    }

    @Override
    public int getItemCount() {
        return countriesList.size();
    }
}
