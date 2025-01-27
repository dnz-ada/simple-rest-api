package nz.co.deloitte.engineering.internal.simplerestapi.dal.model;

import java.util.List;

public class RatingSummaryModel {

	private double averageRating;
	private List<String> submittedUsers;

	public RatingSummaryModel() {

	}

	public double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}

	public List<String> getSubmittedUsers() {
		return submittedUsers;
	}

	public void setSubmittedUsers(List<String> submittedUsers) {
		this.submittedUsers = submittedUsers;
	}
}
