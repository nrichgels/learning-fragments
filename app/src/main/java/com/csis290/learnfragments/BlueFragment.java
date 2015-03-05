package com.csis290.learnfragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BlueFragment extends Fragment {



    TextView tvBlue;
    int f = 0;

    public BlueFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blue, container, false);
    }



    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvBlue = (TextView) view.findViewById(R.id.blue_fragment_declaration);

        tvBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f == 0) {
                    tvBlue.setText(getArguments().getString("key"));
                    f =f +1;
                }
                else if(f==1)
                {
                    tvBlue.setText(getArguments().getString("key2"));
                    f = f+1;
                }
                else if (f==2)
                {
                    tvBlue.setText("This wasn't sent from the activity, which is naughty. Let's get drunk.");
                }
            }
        });

    }
}
