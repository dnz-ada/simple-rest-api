package nz.co.deloitte.engineering.internal.simplerestapi.controller;

import nz.co.deloitte.engineering.internal.simplerestapi.controller.dto.RatingSummary;
import nz.co.deloitte.engineering.internal.simplerestapi.controller.dto.UserRatingSubmission;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

@RestController
@Scope("prototype")
@RequestMapping("/api/user-ratings")
public class UserRatingController {

	/**
	 * TODO - complete the method below
	 * Requirement:
	 * 	1. Return the latest rating summary for the given itemId to API requester
	 * 	2. Check permission if the API requester has role of RATING_READER
	 * @param itemId the ID of the item being rated
	 * @return the rating summary of the item
	 */
	@GetMapping("/{itemId}")
	public RatingSummary getRatingSummary(@PathVariable String itemId) {
		// FIXME Invoke UserRatingService.getRatingSummary to get the latest summary (average) rating
		return new RatingSummary();
	}

	/**
	 * TODO - complete the method below
	 * Requirement:
	 * 	1. Invoke UserRatingService to calculate and persist new user rating
	 * 	2. User (API requester) is not allowed to submit rating for other users. If an user
	 * 	submits for another user, an error must be returned.
	 * @param submission the user rating submission object which contains userId and rating
	 * @return the rating summary of the item
	 */
	@PostMapping("/{itemId}")
	public RatingSummary submitRating(@RequestBody UserRatingSubmission submission) {
		// FIXME Invoke UserRatingService.submitUserRating to process and persist the submission
		return new RatingSummary();
	}

}
