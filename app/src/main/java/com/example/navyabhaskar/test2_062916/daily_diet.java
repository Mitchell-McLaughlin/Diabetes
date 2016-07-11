package com.example.navyabhaskar.test2_062916;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Calendar;

public class daily_diet extends AppCompatActivity {
    private Spinner spinner_lunchDinner;
    private ArrayAdapter adapter;
    private Spinner spinner_Breakfast;
    private Spinner spinner_Type;
    private Spinner spinner_Quantity;
    private Spinner spinner_snacks;
    private Spinner spinner_alchohol;
    private Spinner spinner_nonalchohol;

    Calendar c;
    EditText edt_time1;
    EditText edt_time2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_diet);

        Calendar c = Calendar.getInstance();
        int mHour = c.get(Calendar.HOUR);
        int mMinute = c.get(Calendar.MINUTE);
        int mSeconds = c.get(Calendar.SECOND);
        int mDate = c.get(Calendar.DATE);
        int mMon = c.get(Calendar.MONTH);
        int mYear = c.get(Calendar.YEAR);
        EditText edt_time1=(EditText) findViewById(R.id.editText_timediet);
        edt_time1.setText(mHour +":"+ mMinute +":"+ mSeconds);
        EditText edt_time2=(EditText) findViewById(R.id.editText_datediet);
        edt_time2.setText(mMon + "/" + mDate + "/" + mYear);



        spinner_Type = (Spinner) findViewById(R.id.spinnertype);
        adapter = ArrayAdapter.createFromResource(this,
                R.array.type, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Type.setAdapter(adapter);

        spinner_Quantity = (Spinner) findViewById(R.id.spinnerquantity);
        adapter = ArrayAdapter.createFromResource(this,
                R.array.quantity, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Quantity.setAdapter(adapter);

        spinner_lunchDinner = (Spinner) findViewById(R.id.spinnerLunchDinner);
        adapter = ArrayAdapter.createFromResource(this,
                R.array.LunchDinner, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_lunchDinner.setAdapter(adapter);

        spinner_Breakfast = (Spinner) findViewById(R.id.spinnerBreakfast);
        adapter = ArrayAdapter.createFromResource(this,
                R.array.BreakFast, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Breakfast.setAdapter(adapter);

        spinner_snacks = (Spinner) findViewById(R.id.spinnerSnacks);
        adapter = ArrayAdapter.createFromResource(this,
                R.array.Snacks, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_snacks.setAdapter(adapter);

        spinner_alchohol = (Spinner) findViewById(R.id.spinnerAlchohol);
        adapter = ArrayAdapter.createFromResource(this,
                R.array.alchohol, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_alchohol.setAdapter(adapter);

        spinner_nonalchohol = (Spinner) findViewById(R.id.spinnerNonAlchohol);
        adapter = ArrayAdapter.createFromResource(this,
                R.array.nonalchohol, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_nonalchohol.setAdapter(adapter);
    }
}
