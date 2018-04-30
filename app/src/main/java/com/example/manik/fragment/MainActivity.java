package com.example.manik.fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = (Button) findViewById(R.id.but1);
        b2 = (Button) findViewById(R.id.but2);
        b3 =(Button) findViewById(R.id.but3);

    }


    public void dothis(View v)
    {
        int k = v.getId();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft =  fm.beginTransaction();
        if(k== b1.getId())
        {

            ft.add(R.id.frag, new Fragment1(),"First");
        }

        else if(k == b2.getId())
        {
            ft.add(R.id.frag, new Fragment2(), "Second");

        }
        else if(k == b3.getId())
        {
            Fragment f1 = getSupportFragmentManager().findFragmentByTag("First");
            if(f1!=null)
                ft.remove(f1);

        }
        // ft.addToBackStack("hello");
        ft.commit();


    }

}
