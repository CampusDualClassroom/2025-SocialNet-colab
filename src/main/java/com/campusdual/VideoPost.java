package com.campusdual;

import java.util.Date;

public class VideoPost extends Post{
    public VideoPost(String quality, int duration, String title) {
        this.quality = quality;
        this.duration = duration;
        this.title = title;
        this.postDate = new Date();
    }

    private String quality;
    private int duration;
}
