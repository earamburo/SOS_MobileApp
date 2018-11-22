package com.example.rambo.sos_mobileapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class Login extends AppCompatActivity {

    private EditText userName;
    private EditText password;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // find the screen element that you need
        userName = (EditText) findViewById(R.id.nameText);
        password = (EditText) findViewById(R.id.nameText2);
        Button login = (Button) findViewById(R.id.button);
        //set the onClick listener for the button
        login.setOnClickListener(new View.OnClickListener()
                                          {
                                              @Override
                                              public void onClick(View v){
                                                  //new getDataFromDatabase().execute();
                                              }//end getDataFromDatabase
                                          }//end OnClickListener
        );//end loadDataButton.setOnClickListener
        Button signUp = (Button) findViewById(R.id.button2);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setContentView(R.layout.activity_login); **change to signUp layout page**
                //new signUp.getDataFromDatabase().execute();
                //startActivity(new Intent(getApplicationContext(), FirstQuery.class));
            }//end getDataFromDatabase

        });//end OnClickListener

    }//end onCreate



}
