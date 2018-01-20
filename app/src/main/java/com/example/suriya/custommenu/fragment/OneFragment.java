package com.example.suriya.custommenu.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.suriya.custommenu.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment {

    private int someVar;
    private TextView tvOne;

    public OneFragment() {
        super();
    }

    public static OneFragment newInstance(int someVar) {
        OneFragment oneFragment = new OneFragment();
        Bundle args = new Bundle();
        args.putInt("someVar", someVar);
        oneFragment.setArguments(args);
        return oneFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        someVar = getArguments().getInt("someVar");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);
        initInstance(rootView);
        return rootView;
    }

    private void initInstance(View rootView) {

        tvOne = (TextView)rootView.findViewById(R.id.tvOne);
        tvOne.setText(String.valueOf(someVar));

    }

}
