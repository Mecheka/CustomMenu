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
public class TreeFragment extends Fragment {

    private int someVar;
    private TextView tvSomeVar;

    public TreeFragment() {
        // Required empty public constructor
        super();
    }

    public static TreeFragment newInstance(int someVar){
        TreeFragment treeFragment = new TreeFragment();
        Bundle args = new Bundle();
        args.putInt("someVar", someVar);
        treeFragment.setArguments(args);
        return treeFragment;
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
        View rootView = inflater.inflate(R.layout.fragment_tree, container, false);
        initInstance(rootView);
        return rootView;
    }

    private void initInstance(View rootView) {

        tvSomeVar = (TextView) rootView.findViewById(R.id.tvTree);
        tvSomeVar.setText(String.valueOf(someVar));

    }

}
