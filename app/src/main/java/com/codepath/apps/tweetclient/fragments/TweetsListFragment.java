package com.codepath.apps.tweetclient.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codepath.apps.tweetclient.R;

public class TweetsListFragment extends Fragment {
    // Inflation logic

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tweets_list, parent, false);
        return view;
    }


    // Creation lifecycle event

    @Override
    public void onCreate(Bundle savedInstanceState) {

    }
}
