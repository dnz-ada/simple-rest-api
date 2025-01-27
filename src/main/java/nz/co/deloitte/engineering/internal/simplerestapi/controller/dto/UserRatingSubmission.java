package nz.co.deloitte.engineering.internal.simplerestapi.controller.dto;

public class UserRatingSubmission {

    private String userId;
    private Integer rating;
    public UserRatingSubmission() {

    }

    public UserRatingSubmission(String userId, Integer rating) {
        this.userId = userId;
        this.rating = rating;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
