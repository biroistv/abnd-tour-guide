package com.example.biro.udacitygdcsabnd_tourguideapp.ListAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.biro.udacitygdcsabnd_tourguideapp.R;
import com.example.biro.udacitygdcsabnd_tourguideapp.Utils.Place;

import java.util.ArrayList;

public class PlacesListAdapter extends ArrayAdapter<Place> {

    public PlacesListAdapter(@NonNull Context context, ArrayList<Place> resource) {
        super(context, 0, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listOfView = convertView;

        if (listOfView == null)
            listOfView = LayoutInflater.from(getContext()).inflate(R.layout.places_item, parent, false);

        Place place = getItem(position);

        assert place != null;
        ((TextView) listOfView.findViewById(R.id.place_name)).setText(place.getPlaceName());
        ((TextView) listOfView.findViewById(R.id.place_address)).setText(place.getPlaceAdress());
        ((ImageView) listOfView.findViewById(R.id.place_image)).setImageResource(place.getPlacePictureID());

        return listOfView;
    }
}
