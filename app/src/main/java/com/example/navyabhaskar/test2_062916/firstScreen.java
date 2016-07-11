package com.example.navyabhaskar.test2_062916;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.content.Intent;


public class firstScreen extends AppCompatActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        button1 = (Button) findViewById(R.id.Button_getStarted);
        button2 = (Button) findViewById(R.id.Button_loginsc1);

        button1.setOnClickListener(new buttonClick());
        button2.setOnClickListener(new buttonClick());
    }

    public class buttonClick implements OnClickListener {
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.Button_getStarted:
                    Intent getStarted = new Intent(firstScreen.this, personal_details.class);
                    startActivity(getStarted);
                    break;
                case R.id.Button_loginsc1:
                    Intent logins1 = new Intent(firstScreen.this, login.class);
                    startActivity(logins1);
                    break;
                default:
                    break;
            }
        }
    }

}

