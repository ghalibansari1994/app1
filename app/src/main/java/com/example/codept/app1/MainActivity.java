package com.example.codept.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
        signup();
    }

    public void login()
    {
        Button btn;
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent("com.example.codept.app1.login");
                        startActivity(intent);
                    }
                }
        );

    }

    public void signup()
    {
        Button btn;
        btn = (Button)findViewById(R.id.button2);
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
