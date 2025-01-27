package nz.co.deloitte.engineering.internal.simplerestapi.service;

import nz.co.deloitte.engineering.internal.simplerestapi.controller.dto.RatingSummary;
import nz.co.deloitte.engineering.internal.simplerestapi.controller.dto.UserRatingSubmission;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserRatingServiceTest {

	@Autowired UserRatingService userRatingService;

	@Test
	void checkAverageCalculation() {
		String itemId = "one";
		UserRatingSubmission s1 = new UserRatingSubmission("u1", 4);
		UserRatingSubmission s2 = new UserRatingSubmission("u2", 2);
		UserRatingSubmission s3 = new UserRatingSubmission("u3", 3);
		UserRatingSubmission s4 = new UserRatingSubmission("u4", 1);
		userRatingService.submitUserRating(itemId, s1);
		userRatingService.submitUserRating(itemId, s2);
		userRatingService.submitUserRating(itemId, s3);
		userRatingService.submitUserRating(itemId, s4);
		RatingSummary summary = userRatingService.getRatingSummary(itemId);
		assertEquals(2.5, summary.getAverageRating());
	}

}
