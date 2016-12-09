package com.example.drskm.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ladpter extends BaseAdapter {

    private Context context;
    private ArrayList<dataprovider> countries;
    private LayoutInflater inflater;
    public ladpter(Context context, ArrayList<dataprovider> arr) {

        this.context = context;
        this.countries = arr;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return countries.size();
    }

    @Override
    public Object getItem(int position) {
        return countries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return countries.get(position).getId();
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View adp = null;
        if(convertView == null)
        {
            if(position%2==0)
            {
                adp = inflater.inflate(R.layout.list, null, false);
            }
            else
                adp=inflater.inflate(R.layout.list2,null,false);
        }
        else adp = convertView;

        ((ImageView)adp.findViewById(R.id.imageFlag)).setImageResource(countries.get(position).getImage());;

        ((TextView)adp.findViewById(R.id.textCountryName)).setText(countries.get(position).getName());
        return adp;
    }
}
