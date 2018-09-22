package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class SadMood extends Mood {
    public SadMood(Date date) {
        super(date);
    }

    public SadMood() {
        super();
    }

    public String getMood(){
        return "Sad";
    }
}
