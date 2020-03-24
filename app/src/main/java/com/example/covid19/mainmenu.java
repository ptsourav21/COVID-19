package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class mainmenu extends AppCompatActivity implements View.OnClickListener {
    ImageView whatiscovid;
    ImageView symptoms , prevention, treatments, exit, testyourself;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        whatiscovid=(ImageView)findViewById(R.id.whatiscovidId);
        symptoms=(ImageView)findViewById(R.id.symptomsId);
        prevention=(ImageView)findViewById(R.id.preventionId);
        treatments=(ImageView)findViewById(R.id.treatmentsId);
        exit=(ImageView)findViewById(R.id.exitId);
        testyourself=(ImageView)findViewById(R.id.testyourselfId);
        testyourself.setOnClickListener(this);
        exit.setOnClickListener(this);
        treatments.setOnClickListener(this);
        prevention.setOnClickListener(this);
        symptoms.setOnClickListener(this);
        whatiscovid.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.whatiscovidId)
        {
            Intent loginIntent = new Intent(mainmenu.this, whatiscovid.class);
            startActivity(loginIntent);
        }
        else if(v.getId()==R.id.symptomsId)
        {
            Intent loginIntent = new Intent(mainmenu.this, symptoms.class);
            startActivity(loginIntent);
        }
        else if(v.getId()==R.id.preventionId)
        {
            Intent loginIntent = new Intent(mainmenu.this, prevention.class);
            startActivity(loginIntent);
        }
        else if(v.getId()==R.id.treatmentsId)
        {
            Intent loginIntent = new Intent(mainmenu.this, treatments.class);
            startActivity(loginIntent);
        }
        else if(v.getId()==R.id.testyourselfId)
        {
            Intent loginIntent = new Intent(mainmenu.this, testyourself.class);
            startActivity(loginIntent);
        }
        else if(v.getId()==R.id.exitId)
        {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }

    }
}
