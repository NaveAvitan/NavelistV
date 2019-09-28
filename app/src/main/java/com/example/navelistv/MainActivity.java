package com.example.navelistv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;



//import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lv;
    public String[] yab= {"Europe","America","Asia","Africa"};
    int ch=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv333333);
        ArrayAdapter<String> adp1= new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,yab);
        lv.setAdapter(adp1);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lv.setOnItemClickListener(this);
    }





    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast toast;
        toast=Toast.makeText(this, "you picked" + yab[position], Toast.LENGTH_SHORT);
        ch= position;
        toast.show();
    }


    public void next(View view) {
        Intent gi = new Intent(this, Main2Activity.class);
        gi.putExtra("n:", ch);
        startActivity(gi);
    }
}

