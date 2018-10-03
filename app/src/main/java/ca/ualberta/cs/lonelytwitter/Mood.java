package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * a base class for Mood
 */

public abstract class Mood {
    private Date date;

    // constructors
    public Mood(Date date) {
        this.date = date;
    }

    public Mood() {
        this.date = new Date();
    }

    // getters and setters
    public abstract String getMood();


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
