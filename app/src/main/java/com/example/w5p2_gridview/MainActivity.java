package com.example.w5p2_gridview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    GridView simpleList;
    Country_Manager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (GridView) findViewById(R.id.simpleGridView);
        manager = new Country_Manager();
        MyAdapter myAdapter=new MyAdapter(this,R.layout.grid_view_items,manager.countryList);
        simpleList.setAdapter(myAdapter);
    }


}
