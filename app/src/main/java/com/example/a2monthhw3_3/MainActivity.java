package com.example.a2monthhw3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView countriesRecyclerView;
    private ArrayList<String> countriesList = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countriesRecyclerView = findViewById(R.id.recycler_view);
        loadData();
        CountriesAdapter adapter = new CountriesAdapter(countriesList);
        countriesRecyclerView.setAdapter(adapter);
    }

    private void loadData() {
        countriesList.add("Дания");
        countriesList.add("Норвегия");
        countriesList.add("Щвейцария");
        countriesList.add("Финляндия");
        countriesList.add("Нидерланды");
        countriesList.add("Люксембург");
        countriesList.add("Новая Зеландия");
        countriesList.add("Германия");
        countriesList.add("Исландия");
        countriesList.add("Австрия");
        countriesList.add("Ирландия");
        countriesList.add("Великобритатния");
        countriesList.add("Сингапур");
    }
}