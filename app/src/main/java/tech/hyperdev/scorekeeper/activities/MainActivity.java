package tech.hyperdev.scorekeeper.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import tech.hyperdev.scorekeeper.R;
import tech.hyperdev.scorekeeper.fragments.ScoreFragment;

public class MainActivity extends AppCompatActivity {

    private Fragment mFragment1, mFragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFragment1 = ScoreFragment.newInstance("Team 1");
        mFragment2 = ScoreFragment.newInstance("Team 2");
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragmentTeam1,mFragment1).replace(R.id.fragmentTeam2,mFragment2).commit();
//        ScoreFragment scoreFragmentTeam1 = (ScoreFragment)getSupportFragmentManager().findFragmentById(R.id.fragmentTeam1);
//        ((TextView)scoreFragmentTeam1.getView().findyViewById(R.id.tvTeamName)).setText(R.string.team1);
//        ScoreFragment scoreFragmentTeam2 = (ScoreFragment)getSupportFragmentManager().findFragmentById(R.id.fragmentTeam2);
//        ((TextView)scoreFragmentTeam2.getView().findViewById(R.id.tvTeamName)).setText(R.string.team2);
    }

}
