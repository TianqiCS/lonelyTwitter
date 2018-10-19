package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);

    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testDeleteTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
        tweets.deleteTweet(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testHasTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
        Tweet tweet2 = new NormalTweet("Tweet2");
        assertFalse(tweets.hasTweet(tweet2));

    }

    public void testGetTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);

        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);

        ArrayList<Tweet> ts = tweets.getTweets();
        assertEquals(ts.get(0), tweet);


    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        assertEquals(tweets.getCount(),1);
    }
}
