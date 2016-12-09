package com.example.drskm.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<dataprovider> arr=new ArrayList<>();
        arr.add(new dataprovider(R.mipmap.ic_launcher,"RICKY"));
        arr.add(new dataprovider(R.mipmap.ic_launcher,"RONNY"));
        arr.add(new dataprovider(R.mipmap.ic_launcher,"kitty"));
        ladpter adapter = new ladpter(this,arr);
        ListView l=(ListView)findViewById(R.id.list);
        l.setAdapter(adapter);
    }
}
