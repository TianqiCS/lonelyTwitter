package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * ImportantTweet is an important Tweet
 */

public class ImportantTweet extends Tweet {
    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet() {
        super();
    }

    public ImportantTweet(String message, Date date) {
        super(message,date);
    }
}
