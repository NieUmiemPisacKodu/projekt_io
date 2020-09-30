package com.pk.billiard_trainer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StatsActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        TextView textScore1 = findViewById(R.id.stextScore1);
        TextView textScore2 = findViewById(R.id.stextScore2);
        TextView textScore3 = findViewById(R.id.stextScore3);
        TextView textScore4 = findViewById(R.id.stextScore4);

        Integer pracCounter = MainActivity.practicesCounter;

        if (pracCounter < 1){
            textScore1.setText("No data");
            textScore2.setText("No data");
            textScore3.setText("No data");
            textScore4.setText("No data");

        } else {
            Integer sum = 0;
            Double average = 0.0;
            Integer move = 0;

            for (int i = 0; i < pracCounter; i++){
                sum += TraningActivity.listScores.get(0 + move);
                move += 4;
            }
            average = (double)sum / (double)pracCounter;
            textScore1.setText(String.valueOf(average) + " / 5");
            sum = 0;
            move = 0;

            for (int i = 0; i < pracCounter; i++){
                sum += TraningActivity.listScores.get(1 + move);
                move += 4;
            }
            average = (double)sum / (double)pracCounter;
            textScore2.setText(String.valueOf(average) + " / 5");
            sum = 0;
            move = 0;

            for (int i = 0; i < pracCounter; i++){
                sum += TraningActivity.listScores.get(2 + move);
                move += 4;
            }
            average = (double)sum / (double)pracCounter;
            textScore3.setText(String.valueOf(average) + " / 5");
            sum = 0;
            move = 0;

            for (int i = 0; i < pracCounter; i++){
                sum += TraningActivity.listScores.get(3 + move);
                move += 4;
            }
            average = (double)sum / (double)pracCounter;
            textScore4.setText(String.valueOf(average) + " / 5");

        }

        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
