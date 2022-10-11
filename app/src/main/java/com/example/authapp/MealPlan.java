package com.example.authapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

public class MealPlan extends AppCompatActivity {

    private FrameLayout Day_1, Day_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_plan);

        Day_1 = (FrameLayout) findViewById(R.id.Day_1);
        Day_2 = (FrameLayout) findViewById(R.id.Day_2);

        Day_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MealPlan.this, MealList.class));
            }
        });

        Day_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MealPlan.this, MealList.class));
            }
        });
    }
}
