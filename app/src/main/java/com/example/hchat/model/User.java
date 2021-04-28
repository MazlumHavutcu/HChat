package com.example.hchat.model;

public class User {

    private String userName;
    private String Id;
    private String profileImageURL;
    private String status;

    public User() {
    }

    public User(String userName, String id, String profileImageURL, String status) {
        this.userName = userName;
        Id = id;
        this.profileImageURL = profileImageURL;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getProfileImageURL() {
        return profileImageURL;
    }

    public void setProfileImageURL(String profileImageURL) {
        this.profileImageURL = profileImageURL;
    }
}
