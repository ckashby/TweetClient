package com.codepath.apps.tweetclient;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.codepath.apps.tweetclient.models.Tweet;

import java.util.List;

public class TweetsArrayAdapter extends ArrayAdapter<Tweet> {

    public TweetsArrayAdapter(Context context, List<Tweet> tweets) {
        super(context, android.R.layout.simple_list_item_1, tweets);
    }


}
