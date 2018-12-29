package com.example.android.soccerscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //creating the variables for team A
    int scoreTeamA = 0;
    int cornersTeamA = 0;
    int offsidesTeamA = 0;
    int foulsTeamA = 0;

    //creating the variables for team B
    int scoreTeamB = 0;
    int cornersTeamB = 0;
    int offsidesTeamB = 0;
    int foulsTeamB = 0;

    //adding a goal for team A and displaying it
    public void goalForTeamA(View v){
        scoreTeamA = scoreTeamA + 1;
        displayGoalsForTeamA(scoreTeamA);
    }
    public void displayGoalsForTeamA(int x){
        TextView scoreView = (TextView) findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(x));
    }


    //adding a corner for team A and displaying it
    public void cornerForTeamA(View v){
        cornersTeamA = cornersTeamA + 1;
        displayCornersForTeamA(cornersTeamA);
    }
    public void displayCornersForTeamA(int x){
        TextView scoreView = (TextView) findViewById(R.id.corners_team_a);
        scoreView.setText(String.valueOf(x));;
    }

    //adding an offside against team a and displaying it
    public void offsideAgainstTeamA(View v){
        offsidesTeamA = offsidesTeamA + 1;
        displayOffsidesAgainstTeamA(offsidesTeamA);
    }

    public void displayOffsidesAgainstTeamA(int x){
        TextView scoreView = (TextView) findViewById(R.id.offsides_team_a);
        scoreView.setText(String.valueOf(x));
    }


    //adding an foul against team a and displaying it
    public void foulAgainstTeamA(View v){
        foulsTeamA = foulsTeamA + 1;
        displayFoulsAgainstTeamA(foulsTeamA);
    }
    public void displayFoulsAgainstTeamA(int x){
        TextView scoreView = (TextView) findViewById(R.id.fouls_team_a);
        scoreView.setText(String.valueOf(x));
    }

    //adding a goal for team B and displaying it
    public void goalForTeamB(View v){
        scoreTeamB = scoreTeamB + 1;
        displayGoalsForTeamB(scoreTeamB);
    }
    public void displayGoalsForTeamB(int x){
        TextView scoreView = (TextView) findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(x));
    }


    //adding a corner for team B and displaying it
    public void cornerForTeamB(View v){
        cornersTeamB = cornersTeamB + 1;
        displayCornersForTeamB(cornersTeamB);
    }
    public void displayCornersForTeamB(int x){
        TextView scoreView = (TextView) findViewById(R.id.corners_team_b);
        scoreView.setText(String.valueOf(x));;
    }

    //adding an offside against team B and displaying it
    public void offsideAgainstTeamB(View v){
        offsidesTeamB = offsidesTeamB + 1;
        displayOffsidesAgainstTeamB(offsidesTeamB);
    }

    public void displayOffsidesAgainstTeamB(int x){
        TextView scoreView = (TextView) findViewById(R.id.offsides_team_b);
        scoreView.setText(String.valueOf(x));
    }


    //adding an foul against team B and displaying it
    public void foulAgainstTeamB(View v){
        foulsTeamB = foulsTeamB + 1;
        displayFoulsAgainstTeamB(foulsTeamB);
    }
    public void displayFoulsAgainstTeamB(int x){
        TextView scoreView = (TextView) findViewById(R.id.fouls_team_b);
        scoreView.setText(String.valueOf(x));
    }

    //resetting
    public void resetEverything(View v){
        scoreTeamA = 0;
        displayGoalsForTeamA(scoreTeamA);

        cornersTeamA = 0;
        displayCornersForTeamA(cornersTeamA);

        offsidesTeamA = 0;
        displayOffsidesAgainstTeamA(offsidesTeamA);

        foulsTeamA = 0;
        displayFoulsAgainstTeamA(foulsTeamA);

        scoreTeamB = 0;
        displayGoalsForTeamB(scoreTeamB);

        cornersTeamB = 0;
        displayCornersForTeamB(cornersTeamB);

        offsidesTeamB = 0;
        displayOffsidesAgainstTeamB(offsidesTeamB);

        foulsTeamB = 0;
        displayFoulsAgainstTeamB(foulsTeamB);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
