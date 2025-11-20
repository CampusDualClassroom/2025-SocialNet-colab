package com.campusdual;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Post {

    protected Date postDate;
    protected List<Coments> postComentarios = new ArrayList<>();
    protected String title;
}
