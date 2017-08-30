package com.example.vii_mook.stanalonetoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Welcome !");
        toolbar.setSubtitle("Folks !");


        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String msg = "";


                switch (item.getItemId()) {

                    case R.id.discard:
                        msg = "Delete";
                        break;

                    case R.id.search:
                        msg = "Search";
                        break;

                    case R.id.edit:
                        msg = "Edit";
                        break;

                    case R.id.settings:
                        msg = "Settings";
                        break;

                    case R.id.exit:
                        msg = "Exit";
                        break;
                }
                Toast.makeText(MainActivity.this,msg + "Clicked ! ",Toast.LENGTH_SHORT).show();
                return false;
            }
        });


    }
}
