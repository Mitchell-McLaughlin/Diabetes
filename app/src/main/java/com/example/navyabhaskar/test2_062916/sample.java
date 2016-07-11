package com.example.navyabhaskar.test2_062916;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class sample extends AppCompatActivity {
    Calendar c;
    EditText edt_time1;
    EditText edt_time2;
    EditText edt_time3;

    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        button1 = (Button) findViewById(R.id.button_summarybgl);
        button1.setOnClickListener(new buttonClick());
        Calendar c = Calendar.getInstance();
        int mHour = c.get(Calendar.HOUR);
        int mMinute = c.get(Calendar.MINUTE);
        int mSeconds = c.get(Calendar.SECOND);
        int mDate = c.get(Calendar.DATE);
        int mMon = c.get(Calendar.MONTH);
        int mYear = c.get(Calendar.YEAR);
        EditText edt_time1=(EditText) findViewById(R.id.editText_time);
        edt_time1.setText(mHour +":"+ mMinute +":"+ mSeconds);
        EditText edt_time2=(EditText) findViewById(R.id.editText_date);
        edt_time2.setText(mMon + "/" + mDate + "/" + mYear);
        EditText edt_time3=(EditText) findViewById(R.id.editText_bglip);
        edt_time3.setSelection(0);

    }
    public class buttonClick implements View.OnClickListener
    {
        public void onClick(View v)
        {
            Intent i = new Intent(sample.this, daily_diet.class);
            startActivity(i);
        }
    }
}
