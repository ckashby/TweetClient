package com.codepath.apps.tweetclient.models;

import org.json.JSONException;
import org.json.JSONObject;

// Parse the json and store the data, encapsulate state logic or dispaly logic
public class Tweet {
    // List attributes
    private String body;
    private long tid;
    private User user;  // Store an embedded user object
    private String createdAt;
    // private int favoriteCount;

    // Deserialize the JSON
    // Tweet.fromJSON(...) => Tweet
    public static Tweet fromJSON(JSONObject jsonObject) {
        Tweet tweet = new Tweet();
        // Extract the values from the JSON. Store them and return a Tweet object
        try {
            tweet.body = jsonObject.getString("text");
            tweet.tid = jsonObject.getLong("id");
            tweet.createdAt = jsonObject.getString("created_at");
            // tweet.favoriteCount = jsonObject.getInt("favorite_count");
            tweet.user = User.fromJSON(jsonObject.getJSONObject("user"));

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return tweet;
    }

    public String getBody() {
        return body;
    }

    public long getTid() {
        return tid;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public User getUser() {
        return user;
    }
}
