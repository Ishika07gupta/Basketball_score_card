package com.example.basketballcourtscorecard;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display(scoreA);
    }

    public void onclickthree(View view) {
        scoreA = scoreA + 3;
        display(scoreA);
    }

    public void onclicktwo(View view) {
        scoreA = scoreA + 2;
        display(scoreA);
    }

    public void onclickfreethrow(View view) {
        scoreA = scoreA + 1;
        display(scoreA);
    }

    public void onclickthreeB(View view) {
        scoreB = scoreB + 3;
        displayB(scoreB);
    }

    public void onclicktwoB(View view) {
        scoreB = scoreB + 2;
        displayB(scoreB);
    }

    public void onclickfreeThrowB(View view) {
        scoreB = scoreB + 1;
        displayB(scoreB);
    }

    public void display(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.score_text_view);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void displayB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.score_b_text_view);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        display(scoreA);
        displayB(scoreB);
    }
}