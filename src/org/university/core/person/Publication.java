package org.university.core.person;

import java.util.Calendar;

public class Publication {
    private String title;
    private Calendar publishTime;

    public Publication(String title, Calendar publishTime) {
        this.title = title;
        this.publishTime = publishTime;
    }

    public String getTitle() {
        return title;
    }

    public Calendar getPublishTime() {
        return publishTime;
    }
}
