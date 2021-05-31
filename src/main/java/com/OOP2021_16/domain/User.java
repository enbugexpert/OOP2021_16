package com.OOP2021_16.domain;

public class User {

    private int id;
    private String username;
    private String password;
    private String email;
    private String profilePhoto;
    private double balance;

    public User() {
    }

    public User(String username, String password, String email, String profilePhoto, double balance) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.profilePhoto = profilePhoto;
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", profilePhoto='" + profilePhoto + '\'' +
                ", balance=" + balance +
                '}';
    }
}
