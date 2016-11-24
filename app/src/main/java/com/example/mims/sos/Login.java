package com.example.mims.sos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by MIMs on 11/12/2016.
 */

public class Login extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }


    public void Mainactivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
