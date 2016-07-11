package com.example.navyabhaskar.test2_062916;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.content.Intent;

public class personal_details extends AppCompatActivity {
    private Button button2;
    private EditText fname;
    private EditText lname;
    private EditText age;
    private EditText email;
    private EditText emer;
    private EditText height;
    private EditText inches;
    private EditText weight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_details);

        fname = (EditText) findViewById(R.id.editText_firstNamepd);
        lname = (EditText) findViewById(R.id.editText_lastnamepd);
        age = (EditText) findViewById(R.id.editext_agepd);
        email = (EditText) findViewById(R.id.editText_emailpd);
        emer = (EditText) findViewById(R.id.editText_econtactpd);
        height = (EditText) findViewById(R.id.editText_feetpd);
        inches = (EditText) findViewById(R.id.editText_inchespd);
        weight = (EditText) findViewById(R.id.editText_weightpd);

        button2 = (Button) findViewById(R.id.button_okpd);
        button2.setOnClickListener(new buttonClick());
    }
    public class buttonClick implements OnClickListener
    {
        public void onClick(View v)
        {
            if(fname.getText().toString().trim().equals(""))
            {
                fname.setError("FirstName Required ");
            }
            else if(lname.getText().toString().trim().equals(""))
            {
                lname.setError("LastName Required ");
            }
            else if(age.getText().toString().trim().equals(""))
            {
                age.setError("Age Required ");
            }
            else if(email.getText().toString().trim().equals(""))
            {
                email.setError("Email Required ");
            }
            else if(emer.getText().toString().trim().equals(""))
            {
                emer.setError("Emer Contact Required ");
            }
            else if(height.getText().toString().trim().equals(""))
            {
                height.setError("Height Required ");
            }
            else if(inches.getText().toString().trim().equals(""))
            {
                inches.setText("0");
            }
            else if(weight.getText().toString().trim().equals(""))
            {
                weight.setError("Weight Required ");
            }
            else
            {
                Intent i = new Intent(personal_details.this, ackDetails.class);
                i.putExtra("firstName", fname.getText().toString());
                startActivity(i);
            }
        }
    }
}
