package tech.hyperdev.scorekeeper.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import tech.hyperdev.scorekeeper.R;
import tech.hyperdev.scorekeeper.fragments.ScoreFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScoreFragment scoreFragmentTeam1 = (ScoreFragment)getSupportFragmentManager().findFragmentById(R.id.fragmentTeam1);
        ((TextView)scoreFragmentTeam1.getView().findViewById(R.id.tvTeamName)).setText(R.string.team1);
        ScoreFragment scoreFragmentTeam2 = (ScoreFragment)getSupportFragmentManager().findFragmentById(R.id.fragmentTeam2);
        ((TextView)scoreFragmentTeam2.getView().findViewById(R.id.tvTeamName)).setText(R.string.team2);
    }
}
