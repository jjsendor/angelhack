package flanr.tour;

import java.util.Date;

/**
 * @author kkowalski
 */
public class Tour {
    private final long id;
    private final String name;
    private final int duration;
    private final int length;
    private final Date meetingTime;
    private final String imageURL;

    private final Guide guide;

    public Tour(long id, String name, int duration, int length, Date meetingTime, String imageURL, Guide guide) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.length = length;
        this.meetingTime = meetingTime;
        this.imageURL = imageURL;
        this.guide = guide;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public int getLength() {
        return length;
    }

    public Date getMeetingTime() {
        return meetingTime;
    }

    public String getImageURL() {
        return imageURL;
    }

    public Guide getGuide() {
        return guide;
    }

}
