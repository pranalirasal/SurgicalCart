package com.segfault.model;

public class User {
    Long userId;
    String userName;
    String password;
    Integer age;
    ContactDetails contactDetails;

    public User() {
    }

    public User(Long userId, String userName, String password, Integer age, ContactDetails contactDetails) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.contactDetails = contactDetails;
    }

    public User(String userName, String password, Integer age, ContactDetails contactDetails) {
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.contactDetails = contactDetails;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }
}
