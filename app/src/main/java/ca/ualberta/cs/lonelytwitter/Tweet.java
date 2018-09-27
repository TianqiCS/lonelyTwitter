package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.List;

public abstract class Tweet {
    private String message;
    private Date date;
    private List<Mood> moods;


    // constructor
    public Tweet(String message,Date date) {
        this.message = message;
        this.date = date;
    }
    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Tweet() {
        this.message = "";
        this.date = new Date();
    }

    //methods
    public void addMood(Mood mood) {
        moods.add(mood);
    }

    public void delMood(Mood mood) {
        moods.remove(mood);
    }

    public String listMood() {
        StringBuilder str = new StringBuilder();
        for (Mood i:this.moods) {
            str.append(i.getMood());
            str.append(" ");
        }
        return str.toString();

    }

    @Override
    public String toString() {
        return this.date.toString() + " | "+this.message;
    }

    // getters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TooLongTweetException {
        if (message.length()>140)
            throw new TooLongTweetException();
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
