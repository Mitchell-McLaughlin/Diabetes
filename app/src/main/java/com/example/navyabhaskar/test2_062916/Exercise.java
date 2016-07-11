package com.example.navyabhaskar.test2_062916;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Calendar;

public class Exercise extends AppCompatActivity {

        private Spinner indoor1;
        private Spinner outdoor1;
        private Spinner gym_exercise;
        private Spinner sports1;
        private ArrayAdapter adap;

        Calendar c;
        EditText edit_time1;
        EditText edit_time2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        indoor1 = (Spinner) findViewById(R.id.spinner_Indoor);
        outdoor1 = (Spinner) findViewById(R.id.spinner_Outdoor);
        gym_exercise = (Spinner) findViewById(R.id.spinner_Gym);
        sports1 = (Spinner) findViewById(R.id.spinner_Sports);

        adap = ArrayAdapter.createFromResource(this,R.array.Indoor, android.R.layout.simple_spinner_item);

        adap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        indoor1.setAdapter(adap);


        adap = ArrayAdapter.createFromResource(this,R.array.Outoor, android.R.layout.simple_spinner_item);

        adap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        outdoor1.setAdapter(adap);


        adap = ArrayAdapter.createFromResource(this,R.array.Gym_Exercises, android.R.layout.simple_spinner_item);

        adap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        gym_exercise.setAdapter(adap);


        adap = ArrayAdapter.createFromResource(this,R.array.Sports, android.R.layout.simple_spinner_item);

        adap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sports1.setAdapter(adap);



        Calendar c = Calendar.getInstance();
        int mHour = c.get(Calendar.HOUR);
        int mMinute = c.get(Calendar.MINUTE);
        int mSeconds = c.get(Calendar.SECOND);
        int mDate = c.get(Calendar.DATE);
        int mMon = c.get(Calendar.MONTH);
        int mYear = c.get(Calendar.YEAR);

        EditText edit_time1=(EditText) findViewById(R.id.editText_timeexec);
        edit_time1.setText(mHour +":"+ mMinute +":"+ mSeconds);

        EditText edit_time2=(EditText) findViewById(R.id.editText_dateexec);
        edit_time2.setText(mMon +"/"+ mDate +"/"+ mYear);



    }
}
