package discussion.forum.units.service;

import com.forum.units.Question;
import com.forum.units.User;

public interface QuestionService {
	// method to create a question using title message for logged in user
	Question createQuestion(String title, String message, User user);
	// method to return the question of the id provided
	Question getQuestionById(long id);
	// method to delete the question provided
	void deleteQuestion(Question question);
}
