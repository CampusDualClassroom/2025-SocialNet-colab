package com.campusdual;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String userName;
    private List<Usuario> followers = new ArrayList<>();
    private List<Post> post = new ArrayList<>();

    public Usuario(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Usuario> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Usuario> followers) {
        this.followers = followers;
    }

    public List<Post> getPost() {
        return post;
    }

    public void setPost(List<Post> post) {
        this.post = post;
    }
}
