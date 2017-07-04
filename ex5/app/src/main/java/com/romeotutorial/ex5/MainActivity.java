package com.romeotutorial.ex5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int res_id = item.getItemId();
        if (res_id == R.id.add) {
            Toast.makeText(getApplicationContext(), "Butonul ADD a fost apasat", Toast.LENGTH_LONG).show();
        } else if(res_id == R.id.exit){
            Toast.makeText(getApplicationContext(), "Butonul EXIT a fost apasat", Toast.LENGTH_LONG).show();
        } else if(res_id == R.id.buton){
    Toast.makeText(getApplicationContext(), "BUTON BUTON BUTON ! ! !", Toast.LENGTH_LONG).show();
        } else if (res_id == R.id.reset) {
            Toast.makeText(getApplicationContext(), "Butonul RESET a fost apasat", Toast.LENGTH_LONG).show();
        }
        return true;
    }

}

