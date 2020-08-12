package discussion.forum.units.service;

import java.util.ArrayList;

import com.forum.units.Question;
import com.forum.units.Reply;
import com.forum.units.User;
import com.forum.util.Utility;

public class ReplyServiceImpl implements ReplyService {
	// Arraylist to store all the replies
	public static final ArrayList<Reply> replies = new ArrayList<>();

	/**
	 * Adding the reply provided by user to replies arraylist
	 * @param message reply message which has to be added
	 * @param question whose reply has to be added
	 * @param user current user logged in
	 * @return the reply object if successful else null
	 */
	public Reply addReply(String message, Question question, User user) {
		if (Utility.isNotNullAndEmpty(message) && question != null && user != null) {
			Reply reply = getReply(question, message);
			if (reply != null) {
				System.out.println("This reply is already present for this question");
				return reply;
			}
			reply = new Reply();
			reply.setMessage(message);
			reply.setQuestion(question);
			reply.setUser(user);
			reply.autoGenerateId();
			reply.setCreated();
			replies.add(reply);
			return reply;
		}
		System.out.println("Any specified field can't be empty");
		return null;
	}

	/**
	 * This methods return the reply object if question and reply message matches with user provided values
	 * @param question question object selected by user
	 * @param replyMessage reply message provided by user
	 * @return the reply if question and reply message matches else null
	 */
	private Reply getReply(Question question, String replyMessage) {
		for (Reply reply : replies) {
			if ((reply.getQuestion() == question) && reply.getMessage().equals(replyMessage)) {
				return reply;
			}
		}
		return null;
	}

	/**
	 * This method return the reply object of the id provided matches with any reply ids
	 * @param id id of the reply provided
	 * @return the reply id reply id matches else null
	 */
	public Reply getReply(long id) {
		for (Reply reply : replies) {
			if (reply.getId() == id) {
				return reply;
			}
		}
		return null;
	}

	/**
	 * This method will return all the replies of the question selected by user
	 * @param question for which replies has to be provided
	 * @return the reply if question is available else null
	 */
	public ArrayList<Reply> getReplies(Question question) {
		ArrayList<Reply> repliesToQuestion = new ArrayList<>();
		for (Reply reply : replies) {
			if (reply.getQuestion() == question) {
				repliesToQuestion.add(reply);
			}
		}
		return repliesToQuestion;
	}

	/**
	 * This method will delete the reply provided
	 * @param reply selected by user
	 */
	public void deleteReply(Reply reply) {
		replies.remove(reply);
	}
}
