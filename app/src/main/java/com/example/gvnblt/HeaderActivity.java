package com.example.gvnblt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HeaderActivity extends AppCompatActivity {
Button submitbutton;
EditText customername,customercontact,registration,chasis,make,model,email,company;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.header);
        customername= (EditText) findViewById(R.id.customername);
        customercontact=(EditText) findViewById(R.id.customercontact);
        registration= (EditText) findViewById(R.id.registration);
        chasis=(EditText) findViewById(R.id.chasis);
        make=(EditText) findViewById(R.id.make);
        model=(EditText) findViewById(R.id.model);
        email=(EditText) findViewById(R.id.email);
        company=(EditText) findViewById(R.id.company);
        submitbutton=(Button) findViewById(R.id.submitbutton);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code goes here
            }
        });
    }
}