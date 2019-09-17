package com.example.hp.tourguideapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HistoricLocationFragment2 extends Fragment {

    public HistoricLocationFragment2() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_historic_location, container, false);

        ArrayList<LocationArrayList> historicLocation = new ArrayList<>();
//images are taken from sites such as livemint.com , freegittyimages.com
        historicLocation.add(new LocationArrayList(R.drawable.india_gate, getString(R.string.IndiaGate), getString(R.string.indiaLocation)));
        historicLocation.add(new LocationArrayList(R.drawable.jantar, getString(R.string.jantarmantar), getString(R.string.jantarLocation)));
        historicLocation.add(new LocationArrayList(R.drawable.redfort, getString(R.string.redfort), getString(R.string.redFortLocation)));

        ListView listView = rootView.findViewById(R.id.historic_location);
        LocationCustomAdapter tourAdapter = new LocationCustomAdapter(rootView.getContext(), historicLocation);
        listView.setAdapter(tourAdapter);

        return rootView;
    }


}
