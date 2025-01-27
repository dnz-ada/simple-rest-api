package nz.co.deloitte.engineering.internal.simplerestapi.service;

import nz.co.deloitte.engineering.internal.simplerestapi.controller.dto.RatingSummary;
import nz.co.deloitte.engineering.internal.simplerestapi.controller.dto.UserRatingSubmission;
import nz.co.deloitte.engineering.internal.simplerestapi.dal.UserRatingDal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


@Service
@Scope("prototype")
public class UserRatingService {

	UserRatingDal userRatingDal;

	/**
	 * TODO - complete submitUserRating method below.
	 * Requirement: Fetch the rating summary for the given itemId from UserRatingDal.
	 * @param itemId the ID of item the rating was queried
	 * @return the rating summary of the item
	 */
	public RatingSummary getRatingSummary(String itemId) {
		// FIXME invoke userRatingDal.getRatingSummary to get summary rating for a given itemId
		return new RatingSummary();
	}

	/**
	 * TODO - complete submitUserRating method below.
	 * Requirement: Calculate the new average rating and persist the new average rating
	 * alongside the User ID.
 	 * @param itemId the ID of item being rated
	 * @param dto the object contains the ID of User who submitted the rating and the
	 *               rating of the item
	 * @return the new rating summary of the item being rated
	 */
	public RatingSummary submitUserRating(String itemId, UserRatingSubmission dto) {
		// FIXME invoke userRatingDal.upsertRatingSummary to save average rating
		return new RatingSummary();
	}

}
