package com.forum.units;

public class Upvote extends AbstractEntity {
	//question for which user has upvoted
	private Question question;
	//reply for which user has upvoted
	private Reply reply;
	//user who has upvoted for either of question xor answer
	private User user;
	//id for the last upvote on discussion forum
	private static Long lastEntry = 0L;
	/**
	 * it will generate the Id of the question and set to the question
	 */
	public void autoGenerateId() {
		lastEntry = lastEntry + 1L;
		super.setId(lastEntry);
	}

	/**
	 * This method will return the question associated with the upvote
	 * @return question chosen by user
	 */
	public Question getQuestion() {
		return question;
	}

	/**
	 * This method will set the question to that upvote
	 * @param question to be assigned to upvote
	 */
	public void setQuestion(Question question) {
		this.question = question;
	}
	/**
	 * This method will return the reply associated with the upvote
	 * @return reply chosen by user
	 */
	public Reply getReply() {
		return reply;
	}
	/**
	 * This method will set the reply to that upvote
	 * @param reply to be assigned to upvote
	 */
	public void setReply(Reply reply) {
		this.reply = reply;
	}

	/**
	 * This method will return the user associated with the upvote
	 * @return the current logged in user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * This method will set the user to that upvote
	 * @param  user be assigned to upvote
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
}
