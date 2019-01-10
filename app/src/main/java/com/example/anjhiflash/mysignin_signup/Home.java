package com.example.anjhiflash.mysignin_signup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.AdapterView;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    GridView grid;
    String[] web = {
            "Menu 1",
            "Menu 2",
            "Menu 3",
            "Menu 4",
            "Menu 5",
            "Menu 6",
            "Menu 7",
            "Menu 8",
            "Menu 9",
    };
    int [] imageId = {
            R.drawable.and,
            R.drawable.and,
            R.drawable.and,
            R.drawable.and,
            R.drawable.and,
            R.drawable.and,
            R.drawable.and,
            R.drawable.and,
            R.drawable.and,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        CustomGrid adapter = new CustomGrid(Home.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Home.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}
