package com.pollub.app81;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.pollub.app81.R;

import java.util.ArrayList;
import java.util.List;

public class ActorAdapter extends ArrayAdapter<Actor> {
    private Context myContext;
    private List<Actor> countriesList;
    public ActorAdapter(Context context, ArrayList<Actor> list) {
        super(context, 0, list);
        myContext = context;
        countriesList = list;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(myContext).
                    inflate(R.layout.list_item,parent,false);
        Actor currentCountry = countriesList.get(position);
        ImageView iv = listItem.findViewById(R.id.imageView);
        iv.setImageResource(currentCountry.getFlag());
        TextView tv1 = listItem.findViewById(R.id.textView);
        tv1.setText(currentCountry.getCountry());
        TextView tv2 = listItem.findViewById(R.id.textView2);
        tv2.setText(currentCountry.getCapital());
        TextView tv3 = listItem.findViewById(R.id.textView3);
        tv3.setText(currentCountry.getName());
        return listItem;
    }
}