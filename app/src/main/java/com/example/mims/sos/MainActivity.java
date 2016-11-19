package com.example.mims.sos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Spinner spinner;
    ArrayAdapter <CharSequence> adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void contacts (View view)
    {
        Intent intent = new Intent(this,Contacts.class);
        startActivity(intent);
    }


    public void login (View view)
    {
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
    }



}

