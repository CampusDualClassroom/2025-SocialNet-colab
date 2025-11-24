package com.campusdual;

import java.util.Date;

public class ImagenPost extends Post {

    private int dimensions;

    public ImagenPost(int dimensions, String title) {
        this.dimensions = dimensions;
        this.title = title;
        this.postDate = new Date();
    }
}
