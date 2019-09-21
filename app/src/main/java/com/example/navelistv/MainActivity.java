package com.example.navelistv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {
    ListView lv;
    String[] yabeshet = {"Europe", "America", "Asia", "Africa"};
    String choice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.mylv);
        lv.setOnClickListener((OnClickListener) this);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);


        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, yabeshet);
        lv.setAdapter(adp);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast toast = Toast.makeText(this,""+yabeshet[position],Toast.LENGTH_SHORT);
        choice = yabeshet[position];
        toast.show();
    }

    public void nextact(View view) {
        Intent gi= new Intent(this,Main2Activity.class);
        gi.putExtra("n:", choice);
        startActivity(gi);
    }
}

