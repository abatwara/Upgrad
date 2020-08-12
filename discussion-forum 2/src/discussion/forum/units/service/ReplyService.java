package discussion.forum.units.service;

import java.util.ArrayList;

import com.forum.units.Question;
import com.forum.units.Reply;
import com.forum.units.User;

public interface ReplyService {
	// method to add a reply to the question for logged in user
	Reply addReply(String message, Question question, User user);
	// method to return the reply of the id provided
	Reply getReply(long id);
	// method to return all the replies of a question
	ArrayList<Reply> getReplies(Question question);
	// method to delete the provided reply
	void deleteReply(Reply reply);
}
