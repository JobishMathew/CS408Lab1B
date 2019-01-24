
//JObish Mathew Lab 1B

package com.example.user.assignment1b;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.*;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class MainActivity extends AppCompatActivity {



    //Main ArrayList that contains all the string Fragments
    private final String[] stringMessages = {"you get knocked out", "you go somewhere else", "you find a dead man", "you find a dead woman", "you meet a buxom blonde", "someone has searched the place", "a crooked cop warns you", "you are arrested", "you find a gun", "you find a knife", "you find a frayed rope", "a bullet whizzes past your ear!", "you are almost run over", "you are being followed", "you smell familiar perfume", "the telephone rings", "there is a knock at the door", "you hear footsteps behind you ...", "you hear a gunshot!", "you hear a scream!", "you are not alone ...", "... forget this story, it stinks!"};
    //Available string messages to be displayed
    private ArrayList<String> stringList = new ArrayList<String>(Arrays.asList(stringMessages));
    Random randomGenerator = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    //Created by Jobish on 1/23 as part of Assignment 1B

    public void getHelpButtonClicked(View v) {

        if (!stringList.isEmpty()) {
            int randIndex = randomGenerator.nextInt(stringList.size());
            TextView stringFragment = (TextView) findViewById(R.id.outputLabel);
            stringFragment.setText(stringList.get(randIndex));
            stringList.remove(randIndex);
        }
        else{
            stringList = new ArrayList<>(Arrays.asList(stringMessages));
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
