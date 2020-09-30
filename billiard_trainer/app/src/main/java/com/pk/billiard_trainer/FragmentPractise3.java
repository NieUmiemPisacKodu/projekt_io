package com.pk.billiard_trainer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPractise3 extends Fragment {

    public FragmentPractise3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_practise3, container, false);

        final Spinner spinner = view.findViewById(R.id.spinnerP3);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(spinner.getContext(), R.array.points, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        //spinner.setOnItemClickListener((AdapterView.OnItemClickListener) this);

        Button buttonNext = view.findViewById(R.id.buttonNextP3);
        buttonNext.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String valueString = spinner.getSelectedItem().toString();
                int value = Integer.parseInt(valueString);
                TraningActivity.totalScore += value;
                TraningActivity.listScores.add(value);
                MainActivity.itemsCounter++;

                TraningActivity.fragmentManager.beginTransaction().replace(R.id.practiseContainer, new FragmentPractise4(), null).commit();
            }
        });
        return view;
    }
}
