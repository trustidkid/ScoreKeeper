package com.example.android.scorekeeper;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int englandScore = 0;
    int nigeriaScore = 0;
    int nigLetCount = 0;
    int nigFoulCount = 0;
    int engLetCount = 0;
    int engFoulCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView score_team_a = findViewById(R.id.england_score);
        score_team_a.setText("0");

        TextView score_team_b = findViewById(R.id.nigeria_score);
        score_team_b.setText("0");
    }

    //add 1 point to the opponent score
    public void foulBallToEngland(View view)
    {
        nigeriaScore=nigeriaScore+1;
        engFoulCount = engFoulCount + 1;
        displayEngFoulCount(engFoulCount);
        displayForNigeria(nigeriaScore);

    }

    //displays number of foul committed by england team
    private void displayEngFoulCount(int engFoulCount) {
        TextView engFoul = findViewById(R.id.england_foul);
        engFoul.setText(String.valueOf(engFoulCount));
    }

    //displays number of Let committed by england team
    private void displayEngLetCount(int engLetCount) {
        TextView engLet = findViewById(R.id.england_let);
        engLet.setText(String.valueOf(engLetCount));
    }

    //add 1 point to the opponent score and display number of let ball
    public void letBallToEngland(View view){
        nigeriaScore = nigeriaScore + 1;
        engLetCount = engLetCount + 1;
        displayEngLetCount(engLetCount);
        displayForNigeria(nigeriaScore);

    }
    //add 1 point to england score
    public void addPointForEngland(View view){
        englandScore = englandScore + 1;
        displayForEngland(englandScore);
    }

    //display england point on the dashboard
    public void displayForEngland(int point){
        TextView scoreView = findViewById(R.id.england_score);
        scoreView.setText(String.valueOf(point));
    }

    //displays number of foul committed by england team
    private void displayNigFoulCount(int nigFoulCount) {
        TextView engFoul = findViewById(R.id.nigeria_foul);
        engFoul.setText(String.valueOf(nigFoulCount));
    }

    //displays number of Let committed by nigeria team
    private void displayNigLetCount(int nigLetCount) {
        TextView engLet = findViewById(R.id.nigeria_let);
        engLet.setText(String.valueOf(nigLetCount));
    }

    //display nigeria point on the dashboard
    public void displayForNigeria(int point){
        TextView scoreView = findViewById(R.id.nigeria_score);
        scoreView.setText(String.valueOf(point));
    }

    //add 1 point to the opponent score
    public void foulBallToNigeria(View view)
    {
        englandScore = englandScore + 1;
        nigFoulCount = nigFoulCount + 1;
        displayNigFoulCount(nigFoulCount);
        displayForEngland(englandScore);

    }

    //add 1 point to the opponent score and display nigeria let count
    public void letBallToNigeria(View view){
        englandScore=englandScore+1;
        nigLetCount = nigLetCount + 1;
        displayNigLetCount(nigLetCount);
        displayForEngland(englandScore);

    }
    //add 1 point to nigeria score
    public void addPointToNigeria(View view){
        nigeriaScore = nigeriaScore + 1;
        displayForNigeria(nigeriaScore);
    }

    //reset both team scores to zero
    public void resetScore(View view){
        englandScore=0;
        nigeriaScore=0;
        nigLetCount = 0;
        nigFoulCount = 0;
        engLetCount = 0;
        engFoulCount = 0;
        displayNigLetCount(nigLetCount);
        displayNigFoulCount(nigFoulCount);
        displayEngLetCount(engLetCount);
        displayEngFoulCount(engFoulCount);
        displayForNigeria(nigeriaScore);
        displayForEngland(englandScore);
    }

}