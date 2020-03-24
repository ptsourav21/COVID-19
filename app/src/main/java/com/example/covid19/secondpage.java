package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class secondpage extends AppCompatActivity implements View.OnClickListener {

    ImageView nextButton;
    EditText name, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);

        name=(EditText)findViewById(R.id.ageId);
        age=(EditText)findViewById(R.id.nameId);
        nextButton=(ImageView) findViewById(R.id.nextButtonId);
        nextButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        try
        {
            String n,a;
            int e;
            Intent loginIntent2 = new Intent(secondpage.this, testyourself.class);
            n=name.getText().toString();
            a=age.getText().toString();
            loginIntent2.putExtra("n",n);
            loginIntent2.putExtra("a",a);


            if(n.isEmpty()||a.isEmpty())
            {
                Toast.makeText(secondpage.this,"Enter Information", Toast.LENGTH_SHORT).show();
                e=0/100;
            }

            else {
                Intent loginIntent = new Intent(secondpage.this, mainmenu.class);
                startActivity(loginIntent);

            }
        }catch (Exception e)
        {

        }


    }
}
