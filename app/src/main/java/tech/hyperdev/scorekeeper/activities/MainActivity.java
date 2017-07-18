package tech.hyperdev.scorekeeper.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import tech.hyperdev.scorekeeper.R;
import tech.hyperdev.scorekeeper.Utils;
import tech.hyperdev.scorekeeper.fragments.ScoreFragment;

public class MainActivity extends AppCompatActivity {

    private Fragment mFragment1, mFragment2;
    private Menu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);

        mFragment1 = ScoreFragment.newInstance("Team 1");
        mFragment2 = ScoreFragment.newInstance("Team 2");
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragmentTeam1,mFragment1).replace(R.id.fragmentTeam2,mFragment2).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.nightMode:
                Utils.changeToTheme(MainActivity.this, 1);
                break;
            case R.id.dayMode:
                Utils.changeToTheme(MainActivity.this,0);
                break;
        }
        return false;
    }
}
