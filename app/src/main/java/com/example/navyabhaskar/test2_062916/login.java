package com.example.navyabhaskar.test2_062916;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class login extends AppCompatActivity {
    private Button login;
    private Context context;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.button_signin);

        login.setOnClickListener(new buttonClick());
    }

    public class buttonClick implements View.OnClickListener
    {
        public void onClick(View v)

        {
            context = getApplicationContext();
            CharSequence text1 = "Login Successful :)";
            int duration = Toast.LENGTH_SHORT;

            toast = Toast.makeText(context, text1, duration);
            toast.show();Intent i1 = new Intent(login.this, details.class);
            startActivity(i1);
        }
    }
}
