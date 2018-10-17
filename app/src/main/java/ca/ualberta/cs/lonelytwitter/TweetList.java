package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Create by Tianqi on Wed Oct 17 2018
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet) {
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet) {
        return  tweets.contains(tweet);
    }

    public void deleteTweet(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }
}
