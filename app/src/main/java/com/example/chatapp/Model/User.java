package com.example.chatapp.Model;

public class User {

    private String id;
    private String username;
    private String imageURL;
    private String status;
    private String search;



    public User(String id, String username, String imageUrl, String search) {
        this.id=id;
        this.username=username;
        this.imageURL=imageUrl;
        this.search = search;
        this.status = status;
    }

    public User() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageUrl() {
        return imageURL;
    }

    public void setImageUrl(String imageUrl) { this.imageURL = imageUrl; }

    public String getStatus() {
        return status;
    }

    public void setStatue(String status) { this.status = status; }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) { this.search = search; }



}
