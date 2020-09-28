package com.example.listapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.listapp.R;

import java.util.ArrayList;

public class listadapter extends ArrayAdapter <String> {
    private Context context;
    private ArrayList<String>list ;

    public listadapter(Context context, ArrayList<String>list) {
        super(context, R.layout.content_list);
        this.context=context;
       this.list=list;
    }
    @Override
    public int getCount(){
        return list.size();
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
    View view;
     final ViewHolder  viewHolder;
     if( convertView==null||convertView.getTag()==null){
         viewHolder=new ViewHolder();
         view= LayoutInflater.from(context).inflate(R.layout.content_list,parent,false);
         viewHolder.vItNAME=(TextView) view .findViewById(R.id.texList);


     }else{
         viewHolder=(ViewHolder)convertView.getTag();
         view= convertView;
     }

     viewHolder.vItNAME.setText((list.get(position)));


     return view;
    }
    static class ViewHolder{
        protected TextView vItNAME;
    }
}
