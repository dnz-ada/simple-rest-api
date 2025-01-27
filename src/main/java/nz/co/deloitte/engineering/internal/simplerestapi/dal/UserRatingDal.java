package nz.co.deloitte.engineering.internal.simplerestapi.dal;

import nz.co.deloitte.engineering.internal.simplerestapi.dal.model.RatingSummaryModel;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Scope("prototype")
public class UserRatingDal {

	// In memory data store. Key is itemId, value is Rating Summary model.
	private static final Map<String, RatingSummaryModel> DATA_STORE = new HashMap<>();

	public RatingSummaryModel getRatingSummary(String itemId) {
		return DATA_STORE.get(itemId);
	}

	public RatingSummaryModel upsertRatingSummary(String itemId, RatingSummaryModel model) {
		return DATA_STORE.put(itemId, model);
	}

}
