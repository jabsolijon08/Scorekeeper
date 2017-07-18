package tech.hyperdev.scorekeeper.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import tech.hyperdev.scorekeeper.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScoreFragment extends Fragment {

    private TextView mtvTeamName, mtvCount;
    private String teamName;
    private ImageView mBtnAdd, mBtnSubtract;
    private int count=0;
    public ScoreFragment() {
        // Required empty public constructor
    }
    public static ScoreFragment newInstance(String someString){
        ScoreFragment scoreFragment = new ScoreFragment();
        Bundle args = new Bundle();
        args.putString("someString",someString);
        scoreFragment.setArguments(args);

        return scoreFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_score, container, false);
        mtvTeamName = (TextView)view.findViewById(R.id.tvTeamName);
        mBtnAdd = (ImageView)view.findViewById(R.id.btnPlus);
        mBtnSubtract = (ImageView)view.findViewById(R.id.btnMinus);
        mtvCount = (TextView)view.findViewById(R.id.textView2);
        mBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                mtvCount.setText(count+"");
            }
        });
        mBtnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                mtvCount.setText(count+"");
            }
        });
        getBundle(getArguments());

        return view;
    }
    public void getBundle(Bundle bundle){
        if(bundle!=null){
            teamName = bundle.getString("someString");
            mtvTeamName.setText((teamName));
        }
    }
}
