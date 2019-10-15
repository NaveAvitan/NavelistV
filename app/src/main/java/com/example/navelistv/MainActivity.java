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

/**
 * at this activity the user pick his yab and the choosen yab send to the next activity
 */
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lv;
    public String[] yab = {"Europe", "America", "Asia", "Africa"};
    int ch = -1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv333333);

        ArrayAdapter<String> adp1 = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, yab);
        lv.setAdapter(adp1);

        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lv.setOnItemClickListener(this);
    }


    @Override
    /**
     * this act  return toast with the  yab that the user picked.
     * at this act are "toast" and "ch"- the toast responsible  to show to the user what he picked and ch job is to save the chosen yab
     */
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast toast;
        toast = Toast.makeText(this, "you picked" + yab[position], Toast.LENGTH_SHORT);
        ch = position;
        toast.show();
    }


    /**
     * this act send to the countrypickandinfo activity the yab that the user picked and if he didnt picked he will get toast that ask him to pick
     * @param view
     */
    public void next(View view) {
        if (ch == -1) {
            Toast toast1;
            toast1 = Toast.makeText(this, "pls choose", Toast.LENGTH_SHORT);
            toast1.show();
        } else {
            Intent gi = new Intent(this, Main2Activity.class);
            gi.putExtra("n", ch);
            startActivity(gi);
        }
    }
}

