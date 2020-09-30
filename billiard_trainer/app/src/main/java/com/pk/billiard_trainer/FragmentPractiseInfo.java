package com.pk.billiard_trainer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPractiseInfo extends Fragment {

    public FragmentPractiseInfo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_practise_info, container, false);

        TraningActivity.totalScore = 0;

        Button buttonNext = view.findViewById(R.id.buttonNextPInfo);
        buttonNext.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                TraningActivity.fragmentManager.beginTransaction().replace(R.id.practiseContainer, new FragmentPractise1(), null).commit();
            }
        });
        return view;
    }
}
