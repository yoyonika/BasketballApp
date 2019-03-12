package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayThreePointsForTeamA(View view){
        int threePoints = 3;
        scoreTeamA = scoreTeamA + threePoints;
        displayForTeamA(scoreTeamA);
    }

    public void displayTwoPointsForTeamA(View view){
        int twoPoints = 2;
        scoreTeamA = scoreTeamA + twoPoints;
        displayForTeamA(scoreTeamA);
    }

    public void displayFreeThrowPointsForTeamA(View view) {
        int onePoint = 1;
        scoreTeamA = scoreTeamA + onePoint;
        displayForTeamA(scoreTeamA);
    }
    public void displayThreePointsForTeamB(View view){
        int threePoints = 3;
        scoreTeamB = scoreTeamB + threePoints;
        displayForTeamB(scoreTeamB);
    }

    public void displayTwoPointsForTeamB(View view){
        int twoPoints = 2;
        scoreTeamB = scoreTeamB + twoPoints;
        displayForTeamB(scoreTeamB);
    }

    public void displayFreeThrowPointsForTeamB(View view) {
        int onePoint = 1;
        scoreTeamB = scoreTeamB + onePoint;
        displayForTeamB(scoreTeamB);
    }

    public void resetScores(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
