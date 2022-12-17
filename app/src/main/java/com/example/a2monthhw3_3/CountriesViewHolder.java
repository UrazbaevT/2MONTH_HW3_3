package com.example.a2monthhw3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountriesViewHolder extends RecyclerView.ViewHolder {

    private TextView tvCountries;

    public CountriesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCountries = itemView.findViewById(R.id.item_counties);
    }

    public void bind(String countries){
        tvCountries.setText(countries);
    }
}
