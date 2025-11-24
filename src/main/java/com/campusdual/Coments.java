package com.campusdual;

import java.util.Date;

public class Coments {
    private String content;
    private Date comentDate;
    private Usuario user;

    public Coments (String content, Usuario user){
        this.content = content;
        this.user = user;
        this.comentDate = new Date();
    }

}
