# Coding Exercise

## Context
### Technical:
This SpringBoot application runs on Java 21 or above. It is a Maven Java project and a typical SpringBoot dependencies.

### The API
This SpringBoot application is a lightweight User Rating API that individual users can submit rating for a given Item.
Authorised users can get rating summary for a given Item.

For privacy reasons, the application stores only the average rating and who submitted the rating. 
Individual's rating of the item should not be saved.

## Tasks
This coding exercise consist 2 parts, basic coding practice and REST API security.

### Task 1
Complete the development of all 4 methods marked with `TODO` and/or `FIXME`. 
You can fix any obvious error, refactor the code slightly if you want, OR just mark any enhancement opportunities and discuss them in the interview. 

The 4 methods to be implemented are:
- `nz.co.deloitte.engineering.internal.simplerestapi.controller.UserRatingController#getRatingSummary`
- `nz.co.deloitte.engineering.internal.simplerestapi.controller.UserRatingController#submitRating`
- `nz.co.deloitte.engineering.internal.simplerestapi.service.UserRatingService#getRatingSummary`
- `nz.co.deloitte.engineering.internal.simplerestapi.service.UserRatingService#submitUserRating`

### Task 2 
Design and implement an authentication and authorization mechanism WITHIN this springboot application that satisfies the following requirements:
1. Only user (API requester) with `RATING_READER` role can get rating summary information
2. User (API requester) can only submit rating for himself/herself. If an user submits rating for another user, an error must be returned.

The assumption is that the API requester is a fully-featured HTTP client, it can send any standard HTTP request body/header to a standard URI using any supported HTTP request methods, and support all standard HTTP status codes.

### Expectation & Tips
- It is expected to spend 1 - 2 hours on this including the time reading the existing code.
- If it takes longer than 5 hours, please halt and come back to me.
- The goal of this exercise is to NOT test your algorithm knowledge.
- The goal of this exercise is to understand your Java coding experience and SpringBoot knowledge.
- Please do not over-polish the code.
- Please do expect that questions will be asked around the code during interview. 
- A unit test case is created for you to validate the average rating calculation. 
