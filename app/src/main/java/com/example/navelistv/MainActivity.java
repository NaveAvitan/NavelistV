package com.example.navelistv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
//import android.view.View.OnClickListener;
import android.widget.AdapterView;
//import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Collections;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lv;
    String[] yab;
    String choice;
    int ch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);




        ArrayAdapter<String> adp1= new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, yab);

        lv.setAdapter(adp1);
        lv.setOnItemClickListener(this);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
    }


    public void neatest(View view) {
        Intent gi = new Intent(this,Main2Activity.class);
        gi.putExtra("n:", ch);
        startActivity(gi);
    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast toast;
        toast=Toast.makeText(this, "" + yab[position], Toast.LENGTH_SHORT);
        ch= position;
        toast.show();
    } }

