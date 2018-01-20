package com.example.suriya.custommenu.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.suriya.custommenu.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FortFragment extends Fragment {


    public FortFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fort, container, false);
    }

}
