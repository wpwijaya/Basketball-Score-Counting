package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score_a = 0;

    public void ClickThreePointA (View view){
            score_a = score_a + 3;
            displayForTeamA(score_a);
    }

    public void ClickTwoPointA (View view){
        score_a = score_a + 2;
        displayForTeamA(score_a);
    }

    public void ClickFreeThrowA (View view){
        score_a = score_a + 1;
        displayForTeamA(score_a);
    }

    public void displayForTeamA (int score_a) {
        TextView scoreView = (TextView) findViewById(R.id.team_score_a);
        scoreView .setText(String.valueOf(score_a));
    }

    int score_b = 0;

    public void displayForTeamB (int score_b) {
        TextView scoreView = (TextView) findViewById(R.id.team_score_b);
        scoreView .setText(String.valueOf(score_b));
    }

    public void ClickThreePointB (View view){
        score_b = score_b + 3;
        displayForTeamB(score_b);
    }

    public void ClickTwoPointB (View view){
        score_b = score_b + 2;
        displayForTeamB(score_b);
    }

    public void ClickFreeThrowB (View view){
        score_b = score_b + 1;
        displayForTeamB(score_b);
    }

    public void ResetButton (View view){
        score_a = 0;
        score_b = 0;
        displayForTeamA(score_a);
        displayForTeamB(score_b);

    }


}
