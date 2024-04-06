package com.github.piyushpatel2005.adapter.users.domain;

public class UserFromNewAcquisition {
    private int userId;
    private String givenName;
    private String lastName;
    private String email;

    public UserFromNewAcquisition(int userId, String givenName, String lastName, String email) {
        this.userId = userId;
        this.givenName = givenName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserFromNewAcquisition{" +
                "userId=" + userId +
                ", givenName='" + givenName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
