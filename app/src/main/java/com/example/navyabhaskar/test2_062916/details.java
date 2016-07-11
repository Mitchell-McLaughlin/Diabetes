package com.example.navyabhaskar.test2_062916;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class details extends AppCompatActivity {
    private ImageButton glucose;
    private ImageButton calories;
    private ImageButton exercise;
    private ImageButton medication;
    private ImageButton regimen;
    private ImageButton stats;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        glucose = (ImageButton) findViewById(R.id.imageButton_blooddropImage);
        calories = (ImageButton) findViewById(R.id.imageButton_caloriesImage);
        exercise = (ImageButton) findViewById(R.id.imageButton_exerciseImage);
        medication = (ImageButton) findViewById(R.id.imageButton_medicationImage);
        regimen = (ImageButton) findViewById(R.id.imageButton_presRegimenImage);
        stats = (ImageButton) findViewById(R.id.imageButton_DiabetesInfoImage);

        glucose.setOnClickListener(new buttonClick());
        calories.setOnClickListener(new buttonClick());
        exercise.setOnClickListener(new buttonClick());
        medication.setOnClickListener(new buttonClick());
        regimen.setOnClickListener(new buttonClick());
        stats.setOnClickListener(new buttonClick());
    }

    public class buttonClick implements View.OnClickListener {
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.imageButton_blooddropImage:
                    Intent blooddrop = new Intent(details.this, Glucose_Measure.class);
                    startActivity(blooddrop);
                    break;
                case R.id.imageButton_caloriesImage:
                    Intent calories = new Intent(details.this, daily_diet.class);
                    startActivity(calories);
                    break;
                case R.id.imageButton_exerciseImage:
                    Intent exercise = new Intent(details.this, Exercise.class);
                    startActivity(exercise);
                    break;
                case R.id.imageButton_medicationImage:
                    Intent Medication = new Intent(details.this, Medication.class);
                    startActivity(Medication);
                    break;
                case R.id.imageButton_presRegimenImage:
                    Intent regimen = new Intent(details.this, regimen.class);
                    startActivity(regimen);
                    break;
                case R.id.imageButton_DiabetesInfoImage:
                    Intent stats = new Intent(details.this, Stats.class);
                    startActivity(stats);
                    break;
                default:
                    break;
            }
        }
    }
}
