package com.example.navelistv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Intent si= getIntent();
    int x= si.getIntExtra("n",1);
    ListView lv2;
    String[] Europe = {"Israel", "Spain", "Italy", "France","Sweden","Germany","England"};
    String[] america = {"Brazil", "USA", "Mexico", "Canada","Argentina","Colombia","Peru"};
    String[] asia = {"Japan", "China", "Thailand", "India","Singapore","Qatar","Lebanon"};
    String[] africa = {"Nigeria", "Zanzibar", "Egypt", "Morocco","Algeria","Senegal","Gabon"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lv2 = (ListView) findViewById(R.id.mylv);
        lv2.setOnClickListener((View.OnClickListener) this);
        lv2.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
