package com.campusdual;

import java.util.ArrayList;
import java.util.List;


public class Usuario {
    private String username;
    private List<Usuario> followers = new ArrayList<>();
    private List<Post> post = new ArrayList<>();

    public Usuario(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Post> getPost() {
        return post;
    }

    public void setPost(List<Post> post) {
        this.post = post;
    }

    public List<Usuario> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Usuario> followers) {
        this.followers = followers;
    }

    public void addfollowers(Usuario username) {
        followers.add(username);
    }

    public void listarFollowers() {
        for (int i = 0; i < this.followers.size(); i++) {
            System.out.println(followers.get(i).getUsername());

        }
    }
}
