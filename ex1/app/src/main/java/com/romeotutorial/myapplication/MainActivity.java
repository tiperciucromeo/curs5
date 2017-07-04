package com.romeotutorial.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    public static Integer [] MyImages = {R.drawable.par,R.drawable.impar,R.drawable.par,R.drawable.impar,R.drawable.par,R.drawable.impar};
    public static String [] MyTexts = {"Par", "Impar", "Par","Impar", "Par", "Impar"};


        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            MyListAdapter adapter = new MyListAdapter(this,MyTexts,MyImages);
            listView = (ListView)findViewById(R.id.list);

            listView.setAdapter(adapter);
        }
    }