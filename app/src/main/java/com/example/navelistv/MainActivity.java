package com.example.navelistv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ListView lv;
    String [] yabeshet= {"Europe","America","Asia","Africa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv= (ListView) findViewById(R.id.mylv);
        lv.setOnClickListener(this);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);


        ArrayAdapter<String> adp= new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,yabeshet);
        lv.setAdapter(adp);
    }




    @Override
    public void  {

    }
}
