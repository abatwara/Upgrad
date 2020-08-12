package discussion.forum.units.service;

import com.forum.units.Question;
import com.forum.units.Reply;
import com.forum.units.Upvote;
import com.forum.units.User;

public interface UpvoteService {
	// method to add upvote to a question for logged in user
	Upvote addUpvote(Question question, User user);
	// method to add upvote to a reply for logged in user
	Upvote addUpvote(Reply reply, User user);
	// method to return the upvote count for a reply
	long upvoteCount(Reply reply);
}
