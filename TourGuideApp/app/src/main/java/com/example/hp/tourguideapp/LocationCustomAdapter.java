package com.example.hp.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationCustomAdapter extends ArrayAdapter<LocationArrayList> {

    LocationCustomAdapter(Context context, ArrayList<LocationArrayList> locationArrayList) {
        super(context, 0, locationArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        LocationArrayList locationArrayList = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.image1);
        TextView location_name = convertView.findViewById(R.id.text1);
        TextView location = convertView.findViewById(R.id.text2);

        assert locationArrayList != null;
        imageView.setImageResource(locationArrayList.getImage());
        location_name.setText(locationArrayList.getTitle());
        location.setText(locationArrayList.getLocation());
        return convertView;
    }
}
