package com.campusdual;

import java.util.Date;

public class TextPost extends Post {
    public TextPost(String comennt, String title) {
        this.comennt = comennt;
        this.title = title;
        this.postDate = new Date();
    }

    private String comennt;


}
