package com.example.navelistv;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Intent si = getIntent();
    int x = si.getIntExtra("n", 1);
    ListView lv2;
    String[] Europe = {"Israel", "Spain", "Italy", "France", "Sweden", "Germany", "England"};
    String[] america = {"Brazil", "USA", "Mexico", "Canada", "Argentina", "Colombia", "Peru"};
    String[] asia = {"Japan", "China", "Thailand", "India", "Singapore", "Qatar", "Lebanon"};
    String[] africa = {"Nigeria", "Zanzibar", "Egypt", "Morocco", "Algeria", "Senegal", "Gabon"};
    TextView txv1;
    TextView txv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lv2 = (ListView) findViewById(R.id.lv2);
        lv2.setOnClickListener((View.OnClickListener) this);
        lv2.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        txv1 = (TextView) findViewById(R.id.CC);
        txv2 = (TextView) findViewById(R.id.POP);

        if (x == 0) {
            ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, Europe);
            lv2.setAdapter(adp);
        }
        if (x == 1) {
            ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, america);
            lv2.setAdapter(adp);
        }
        if (x == 2) {
            ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, asia);
            lv2.setAdapter(adp);
        }
        if (x == 3) {
            ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, africa);
            lv2.setAdapter(adp);
        }

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int po, long id) {
        if (x == 0) {
            switch (po) {
                case 0:
                    txv1.setText("Jerusalem");
                    txv2.setText("9,036,320");
                    break;
                case 1:
                    txv1.setText("Madrid");
                    txv2.setText("49,331,076");
                    break;
                case 2:
                    txv1.setText("Rome");
                    txv2.setText("62,246,674");
                    break;
                case 3:
                    txv1.setText("Paris");
                    txv2.setText("67,364,357");
                    break;
                case 4:
                    txv1.setText("Stockholm");
                    txv2.setText("10,040,995");
                    break;
                case 5:
                    txv1.setText("Berlin");
                    txv2.setText("80,457,737");
                    break;
                case 6:
                    txv1.setText("London");
                    txv2.setText("53,012,456");
                    break;
            }
        }
        if (x == 1) {
            switch (po) {
                case 0:
                    txv1.setText("Brasilia");
                    txv2.setText("208,846,892");
                    break;
                case 1:
                    txv1.setText("Washington");
                    txv2.setText("329,256,465");
                    break;
                case 2:
                    txv1.setText("Mexico City");
                    txv2.setText("125,959,205");
                    break;
                case 3:
                    txv1.setText("Ottawa");
                    txv2.setText("35,881,659");
                    break;
                case 4:
                    txv1.setText("Buenos Aires");
                    txv2.setText("44,694,198");
                    break;
                case 5:
                    txv1.setText("Bogota");
                    txv2.setText("48,168,996");
                    break;
                case 6:
                    txv1.setText("Lima");
                    txv2.setText("31,331,228");
                    break;
            }
        }
        if (x == 2) {
            switch (po) {
                case 0:
                    txv1.setText("Tokyo");
                    txv2.setText("126,168,156");
                    break;
                case 1:
                    txv1.setText("Beijing");
                    txv2.setText("1,384,690,426");
                    break;
                case 2:
                    txv1.setText("Bangkok");
                    txv2.setText("68,615,858");
                    break;
                case 3:
                    txv1.setText("New Delhi");
                    txv2.setText("1,296,834,042");
                    break;
                case 4:
                    txv1.setText("Singapore");
                    txv2.setText("5,995,991 ");
                    break;
                case 5:
                    txv1.setText("Dohs");
                    txv2.setText("2,363,569");
                    break;
                case 6:
                    txv1.setText("Beyrouth");
                    txv2.setText("6,100,075");
                    break;
            }
        }
        if (x == 3) {
            switch (po) {
                case 0:
                    txv1.setText("Abuja");
                    txv2.setText("203,452,505");
                    break;
                case 1:
                    txv1.setText("Zanzibar City");
                    txv2.setText("1,303,569");
                    break;
                case 2:
                    txv1.setText("Cairo");
                    txv2.setText("99,413,317");
                    break;
                case 3:
                    txv1.setText("Rabat");
                    txv2.setText("34,314,130");
                    break;
                case 4:
                    txv1.setText("Alger");
                    txv2.setText("41,657,488");
                    break;
                case 5:
                    txv1.setText("Dakar");
                    txv2.setText("15,020,945");
                    break;
                case 6:
                    txv1.setText("Libreville");
                    txv2.setText("2,119,036");
                    break;
            }
        }
    }

    public void back(View view) {
    finish();
    }
}

