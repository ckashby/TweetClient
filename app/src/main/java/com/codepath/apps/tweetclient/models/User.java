package com.codepath.apps.tweetclient.models;


import org.json.JSONException;
import org.json.JSONObject;

public class User {
    private long uid;
    private String name;
    private String screenName;
    private String profileImageUrl;
    private int favoritesCount;

    public static User fromJSON(JSONObject json) {
        User user = new User();
        try {
            user.uid = json.getLong("id");
            user.name = json.getString("name");
            user.screenName = json.getString("screen_name");
            user.profileImageUrl = json.getString("profile_image_url");
            user.favoritesCount = json.getInt("favorites_count");

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return user;
    }

    public long getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public int getFavoritesCount() {
        return favoritesCount;
    }
}
