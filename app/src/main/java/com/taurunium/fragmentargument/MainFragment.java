package com.taurunium.fragmentargument;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainFragment extends Fragment {

    //Initialize variable
    private TextView tvCount;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        //assign variable
        tvCount = view.findViewById(R.id.tvCount);

        //check condition
        if(getArguments()!=null){
            String sCount = getArguments().getString("count");
            tvCount.setText(sCount);
        }

        return view;
    }
}