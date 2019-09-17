package com.example.hp.tourguideapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class EventFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_event, container, false);
        ArrayList<LocationArrayList> event = new ArrayList<>();
        // images taken from mallsmarket.com
        event.add(new LocationArrayList(R.drawable.christmas_,getString(R.string.event),getString(R.string.date)));
        ListView listView = rootView.findViewById(R.id.event);
        LocationCustomAdapter tourAdapter = new LocationCustomAdapter(rootView.getContext(), event);
        listView.setAdapter(tourAdapter);

        return rootView;
    }
}

