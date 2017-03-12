package com.example.codept.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class login extends AppCompatActivity {

    private EditText uname;
    private EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login();
        signup();
    }

    public void login()
    {
        uname = (EditText)findViewById(R.id.editText);
        pass = (EditText)findViewById(R.id.editText2);

        Button btn;
        btn = (Button)findViewById(R.id.button3);
        btn.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        if(uname.getText().toString().equals("admin"))
                        {
                            Toast.makeText(getApplicationContext(), "Username is Valid", Toast.LENGTH_SHORT).show();

                            if(pass.getText().toString().equals("root"))
                            {
                                Toast.makeText(getApplicationContext(), "Password is Valid", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                Toast.makeText(getApplicationContext(),"Password is Invalid", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"Uasername is Invalid", Toast.LENGTH_SHORT).show();
                        }

                    }
                }
        );

    }

    public void signup()
    {
        Button btn;
        btn = (Button)findViewById(R.id.button4);
        btn.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent("com.example.codept.app1.signup");
                        startActivity(intent);
                    }
                }
        );
    }
}
