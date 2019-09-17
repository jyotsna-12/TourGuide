package com.example.hp.tourguideapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Market extends Fragment {
    public Market() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_market, container, false);

        ArrayList<LocationArrayList> market = new ArrayList<>();

        market.add(new LocationArrayList(R.drawable.palikamarket, getString(R.string.palika), getString(R.string.palikaLocation)));
        market.add(new LocationArrayList(R.drawable.saroj, getString(R.string.saroj), getString(R.string.sarojLocation)));

        ListView listView = rootView.findViewById(R.id.market);
        LocationCustomAdapter tourAdapter = new LocationCustomAdapter(rootView.getContext(), market);
        listView.setAdapter(tourAdapter);

        return rootView;
    }
}
