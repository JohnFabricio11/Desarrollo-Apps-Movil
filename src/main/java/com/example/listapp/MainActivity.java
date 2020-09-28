package com.example.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.listapp.adapter.listadapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListAdapter listItemAdapter;
    private ArrayList<String> listanombres=new ArrayList<>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.list);

        llenararreglo();
        listItemAdapter = new listadapter(this,listanombres);
            listView.setAdapter(listItemAdapter);
        }
    public void llenararreglo(){
        listanombres.add("hola1");
        listanombres.add("hola2");
        listanombres.add("hola3");
        listanombres.add("hola4");
    }


}