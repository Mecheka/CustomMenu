package com.example.suriya.custommenu.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.suriya.custommenu.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TwoFragment extends Fragment {

    private int someVar;
    private TextView tvTwo;

    public TwoFragment() {
        super();
    }

    public static TwoFragment newInstance(int someVar) {
        TwoFragment twoFragment = new TwoFragment();
        Bundle args = new Bundle();
        args.putInt("someVar", someVar);
        twoFragment.setArguments(args);
        return twoFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        someVar = getArguments().getInt("someVar");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_two, container, false);
        initInstance(rootView);
        return rootView;
    }

    private void initInstance(View rootView) {

        tvTwo = (TextView)rootView.findViewById(R.id.tvTwo);
        tvTwo.setText(String.valueOf(someVar));

    }

}
