package com.frabbi.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adapter extends ArrayAdapter<PlaceInfo> {
    private Context context;
    List<PlaceInfo> list;


    public Adapter(@NonNull Context context, int resource, @NonNull List<PlaceInfo> list) {
        super(context, resource, list);
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Nullable
    @Override
    public PlaceInfo getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public int getPosition(@Nullable PlaceInfo item) {
        return super.getPosition(item);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
           /* LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_view,null,false);*/
            /*or*/
         convertView = LayoutInflater.from(context).inflate(R.layout.list_view,parent,false);
        }
        PlaceInfo placeInfo = getItem(position);
        TextView textView = convertView.findViewById(R.id.textViewLId);
        ImageView imageView = convertView.findViewById(R.id.imageId);
        TextView id = convertView.findViewById(R.id.Id);
        textView.setText(placeInfo.getpName());
        imageView.setImageResource(placeInfo.getpImg());
        id.setText(placeInfo.getId()+" .");
        return convertView;
    }
}