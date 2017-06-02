package com.example.mims.sos;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/**
 * Created by MIMs on 11/12/2016.
 */

public class Login extends MainActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void mainactivity (View view)
    {
        String number = "9900236246";
        Uri call = Uri.parse("tel:" + number);
        Intent surf = new Intent(Intent.ACTION_DIAL, call);
        startActivity(surf);
    }
}
