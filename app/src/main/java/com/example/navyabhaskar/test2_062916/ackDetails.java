package com.example.navyabhaskar.test2_062916;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ackDetails extends AppCompatActivity {
    private TextView textView;
    private Button ok;
    private Toast toast;
    private Context context;
    private TextView username;
    private TextView pwd;
    private TextView confpwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ack_details);

        textView = (TextView) findViewById(R.id.textView1);

        Intent i = getIntent();
        String fn = i.getStringExtra("firstName");

        textView.setText("Thank you "+ fn +" , your details are stored successfully. Please give your Username and password.");
        ok = (Button) findViewById(R.id.ok_ack);
        username = (EditText) findViewById(R.id.editText_usernameack);
        pwd = (EditText) findViewById(R.id.editText_passwordack);
        confpwd = (EditText) findViewById(R.id.editText_cfmpasswordack);

        ok.setOnClickListener(new buttonClick());
    }

    public class buttonClick implements View.OnClickListener
    {
        public void onClick(View v)

        {
            String s1 = pwd.getText().toString().trim();
            String s2 = confpwd.getText().toString().trim();
            if(username.getText().toString().trim().equals(""))
            {
                username.setError("UserName Required ");
            }
            else if(pwd.getText().toString().trim().equals(""))
            {
            pwd.setError("Password Required ");
            }
        else if(confpwd.getText().toString().trim().equals(""))
            {
            confpwd.setError("Please enter to password again ");
            }
        else if (s1.equals(s2))
            {
                context = getApplicationContext();
                CharSequence text1 = "Username and Password saved successfully!";
                int duration = Toast.LENGTH_SHORT;

                toast = Toast.makeText(context, text1, duration);
                toast.show();
                Intent i1 = new Intent(ackDetails.this, details.class);
                startActivity(i1);
            }
        else
            {
                pwd.setText("");
                confpwd.setText("");
                context = getApplicationContext();
                CharSequence text2 = "Both passwords should match !";
                int duration = Toast.LENGTH_SHORT;

                toast = Toast.makeText(context, text2, duration);
                toast.show();

            }
        }
    }

}

