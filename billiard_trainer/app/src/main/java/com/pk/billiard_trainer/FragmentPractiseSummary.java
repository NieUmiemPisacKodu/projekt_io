package com.pk.billiard_trainer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPractiseSummary extends Fragment {

    public FragmentPractiseSummary() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_practise_summary, container, false);

        MainActivity.practicesCounter++;
        Integer itemsCounter = MainActivity.itemsCounter;

        TextView textScore1 = view.findViewById(R.id.textScore1);
        TextView textScore2 = view.findViewById(R.id.textScore2);
        TextView textScore3 = view.findViewById(R.id.textScore3);
        TextView textScore4 = view.findViewById(R.id.textScore4);
        TextView textScoreTotal = view.findViewById(R.id.textScoreTotal);

        Integer value1 = TraningActivity.listScores.get(itemsCounter - 4);
        textScore1.setText(String.valueOf(value1) + " / 5");

        Integer value2 = TraningActivity.listScores.get(itemsCounter - 3);
        textScore2.setText(String.valueOf(value2) + " / 5");

        Integer value3 = TraningActivity.listScores.get(itemsCounter - 2);
        textScore3.setText(String.valueOf(value3) + " / 5");

        Integer value4 = TraningActivity.listScores.get(itemsCounter - 1);
        textScore4.setText(String.valueOf(value4) + " / 5");

        Integer totalScore = TraningActivity.totalScore;
        textScoreTotal.setText("Your total score: " + String.valueOf(totalScore) + " / 20");

        Button buttonSummary = view.findViewById(R.id.buttonSummary);
        buttonSummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });


        return view;
    }
}
