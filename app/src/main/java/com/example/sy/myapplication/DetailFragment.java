package com.example.sy.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {
int index;

    public DetailFragment() {
        // Required empty public constructor
    }

    public void setSelection(int i) { index = i; }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View rootView = inflater.inflate(R.layout.fragment_detail, container, false);
        TextView text = rootView.findViewById(R.id.text);
        ImageView image = rootView.findViewById(R.id.image);

        text.setText(menu.TITLES[index]);
        image.setImageResource(menu.IMAGES[index]);

        return rootView;
    }

}
