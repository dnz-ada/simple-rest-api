package nz.co.deloitte.engineering.internal.simplerestapi.controller.dto;

public class RatingSummary {

    private String itemId;
    private double averageRating;
    public RatingSummary() {

    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }
}
