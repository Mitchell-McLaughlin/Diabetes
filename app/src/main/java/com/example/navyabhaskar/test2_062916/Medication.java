package com.example.navyabhaskar.test2_062916;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Calendar;

public class Medication extends AppCompatActivity {
    private Spinner medication1;
    private ArrayAdapter adapt;

    Calendar c;
    EditText edit_time11;
    EditText edit_time21;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medication);

        medication1 = (Spinner) findViewById(R.id.spinner_Medicine);
        adapt = ArrayAdapter.createFromResource(this,R.array.Medication, android.R.layout.simple_spinner_item);
        adapt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        medication1.setAdapter(adapt);


        Calendar c = Calendar.getInstance();
        int mHour = c.get(Calendar.HOUR);
        int mMinute = c.get(Calendar.MINUTE);
        int mSeconds = c.get(Calendar.SECOND);
        int mDate = c.get(Calendar.DATE);
        int mMon = c.get(Calendar.MONTH);
        int mYear = c.get(Calendar.YEAR);
        edit_time11=(EditText) findViewById(R.id.editText2_timemed);
        edit_time11.setText(mHour +":"+ mMinute +":"+ mSeconds);

        edit_time21=(EditText) findViewById(R.id.editText_Datemed);
        edit_time21.setText(mMon +"/"+ mDate +"/"+ mYear);


    }
}
