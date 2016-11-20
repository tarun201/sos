package com.example.mims.sos;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/**
 * Created by MIMs on 11/19/2016.
 */

public class Home extends MainActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void mainactivity (View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void call (View view)
    {
            String number = "108";
            Uri call = Uri.parse("tel:" + number);
            Intent surf = new Intent(Intent.ACTION_DIAL, call);
            startActivity(surf);
    }
}
