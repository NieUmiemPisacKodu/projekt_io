package com.pk.billiard_trainer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class TraningActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;
    public static List<Integer> listScores = new ArrayList<Integer>();
    public static Integer totalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traning);

        fragmentManager = getSupportFragmentManager();

        if(findViewById(R.id.practiseContainer) != null){
            if(savedInstanceState != null){
                return;
            }

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            FragmentPractiseInfo fragmentPractiseInfo = new FragmentPractiseInfo();

            fragmentTransaction.add(R.id.practiseContainer, fragmentPractiseInfo, null);
            fragmentTransaction.commit();
        }
    }
}
