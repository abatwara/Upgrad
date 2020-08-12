package discussion.forum.units.service;

import java.util.ArrayList;

import com.forum.units.Question;
import com.forum.units.Reply;
import com.forum.units.Upvote;
import com.forum.units.User;

public class UpvoteServiceImpl implements UpvoteService {
	// Arraylist to store all the upvotes
	public static final ArrayList<Upvote> upvotes = new ArrayList<>();

	/**
	 * Adding the upvote provided by user to the question selected by user
	 * @param question which has to be upvoted
	 * @param user current logged in user
	 * @return the upvote if successful else null
	 */
	public Upvote addUpvote(Question question, User user) {
		if (question != null && user != null) {
			Upvote upvote = getUpvote(user, question, null);
			if (upvote != null) {
				System.out.println("You have already upvoted");
				return upvote;
			}
			upvote = addUpvote(user, question, null);
			question.increaseUpvoteCount();
			return upvote;
		}
		System.out.println("Any specified field can't be empty");
		return null;
	}

	/**
	 * This method will count the number of upvotes on a reply
	 * @param reply on which upvotes has to be counted
	 * @return the number of upvotes for provided reply
	 */
	public long upvoteCount(Reply reply) {
		int count = 0;
		for (Upvote upvote : upvotes) {
			if (upvote != null && (upvote.getReply() == reply)) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Adding the upvote provided by user to the reply selected by user
	 * @param reply on which upvote has to be added
	 * @param user current logged in user
	 * @return the upvote if successful else null
	 */
	public Upvote addUpvote(Reply reply, User user) {
		if (reply != null && user != null) {
			Upvote upvote = getUpvote(user, null, reply);
			if (upvote != null) {
				System.out.println("You have already upvoted");
				return upvote;
			}
			upvote = addUpvote(user, null, reply);
			return upvote;
		}
		System.out.println("Any specified field can't be empty");
		return null;
	}

	/**
	 * This method will return the upvote on a question or reply  if already present else null
	 * @param user the current logged in user
	 * @param question question on which upvote has to be checked
	 * @param reply reply on which upvote has to be checked
	 * @return the upvote id already available else null
	 */
	private Upvote getUpvote(User user, Question question, Reply reply) {
		for (Upvote upvote : upvotes) {

			/*
			  Change the below if condition such that user can not upvote the same question or same reply twice,
			  but can upvote multiple questions and replies
			*/
			if (upvote.getUser() == user && upvote.getReply() == reply && question==null) {
				return upvote;
			}
			else if(upvote.getUser() == user && upvote.getQuestion() == question && reply==null) {
				return upvote;
			}
		}
		return null;
	}

	/**
	 * Adding the upvote for a question or reply
	 * @param user the current logged in user
	 * @param question the question on which upvote has to be added
	 * @param reply the reply on which upvote has to be added
	 * @return the upvote if added else null
	 */
	private Upvote addUpvote(User user, Question question, Reply reply) {
		Upvote upvote = new Upvote();
		upvote.setQuestion(question);
		upvote.setReply(reply);
		upvote.setUser(user);
		upvote.autoGenerateId();
		upvote.setCreated();
		upvotes.add(upvote);
		return upvote;
	}
}
