package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class HappyMood extends Mood {

    public HappyMood(Date date) {
        super(date);
    }

    public HappyMood() {
        super();
    }

    public String getMood(){
        return "Happy";
    }
}
