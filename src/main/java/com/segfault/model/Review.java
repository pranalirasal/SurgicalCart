package com.segfault.model;

public class Review {
    Long reviewId;
    User user;
    Double stars;
    String comments;

    public Review() {
    }

    public Review(User user, Double stars, String comments) {
        this.user = user;
        this.stars = stars;
        this.comments = comments;
    }

    public Review(Long reviewId, User user, Double stars, String comments) {
        this.reviewId = reviewId;
        this.user = user;
        this.stars = stars;
        this.comments = comments;
    }

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getStars() {
        return stars;
    }

    public void setStars(Double stars) {
        this.stars = stars;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
