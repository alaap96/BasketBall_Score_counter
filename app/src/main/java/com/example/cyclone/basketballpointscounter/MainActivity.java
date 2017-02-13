package com.example.cyclone.basketballpointscounter;

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

    int ScoreTeamA = 0;
    int ScoreTeamB = 0;

    public void Three_pointer_A(View v) {
        ScoreTeamA += 3;
        Show_Score_Team_A(ScoreTeamA);
    }

    public void Two_pointer_A(View v) {
        ScoreTeamA += 2;
        Show_Score_Team_A(ScoreTeamA);
    }

    public void Free_Throw_A(View v) {
        ScoreTeamA += 1;
        Show_Score_Team_A(ScoreTeamA);
    }

    public void Show_Score_Team_A(int Score) {
        TextView ScoreView = (TextView) findViewById(R.id.Score_A);
        ScoreView.setText(String.valueOf(Score));
    }

    public void Three_pointer_B(View v) {
        ScoreTeamB += 3;
        Show_Score_Team_B(ScoreTeamB);
    }

    public void Two_pointer_B(View v) {
        ScoreTeamB += 2;
        Show_Score_Team_B(ScoreTeamB);
    }

    public void Free_Throw_B(View v) {
        ScoreTeamB += 1;
        Show_Score_Team_B(ScoreTeamB);
    }

    public void Show_Score_Team_B(int Score) {
        TextView ScoreView = (TextView) findViewById(R.id.Score_B);
        ScoreView.setText(String.valueOf(Score));
    }

}
