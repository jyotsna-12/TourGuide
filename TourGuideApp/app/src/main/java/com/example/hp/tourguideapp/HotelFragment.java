package com.example.hp.tourguideapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
public class HotelFragment extends Fragment {

    public HotelFragment() {
        }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_hotel, container, false);

        ArrayList<LocationArrayList> hotels = new ArrayList<>();
       //I have taken the images from website such as freeimages.com
        hotels.add(new LocationArrayList(R.drawable.piccadily, getString(R.string.hotelPiccadily), getString(R.string.PicadilyLocation)));
        hotels.add(new LocationArrayList(R.drawable.radisson, getString(R.string.radisson), getString(R.string.radissonAddress)));

        ListView listView = rootView.findViewById(R.id.hotel);
        LocationCustomAdapter tourAdapter = new LocationCustomAdapter(rootView.getContext(), hotels);
        listView.setAdapter(tourAdapter);
        return rootView;
    }
}

