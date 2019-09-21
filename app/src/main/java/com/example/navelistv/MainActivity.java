package com.example.navelistv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements OnItemClickListener {
    ListView lv;
    String[] yabeshet = {"Europe", "America", "Asia", "Africa"};
    String choice;
    int ch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);
        lv.setOnClickListener((OnClickListener) this);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);


        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, yabeshet);
        lv.setAdapter(adp);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast toast;
        toast = Toast.makeText(this, "" + yabeshet[position], Toast.LENGTH_SHORT);
        choice =yabeshet [position];
        ch= position;
        toast.show(); }


    public void neatest(View view) {
        Intent gi;
        gi = new Intent(this,Main2Activity.class);
        Intent intent = gi.putExtra("n:", ch);
        startActivity(gi);
    }
}
