package discussion.forum.units.service;

import java.util.ArrayList;

import com.forum.units.Question;
import com.forum.units.User;
import com.forum.util.Utility;

public class QuestionServiceImpl implements QuestionService {
	// Arraylist to store all the questions
	public static final ArrayList<Question> questions = new ArrayList<>();

	/**
	 * This method will create the question with all fields provided by user
	 * @param title title of the question
	 * @param message description of the question
	 * @param user user who is logged in
	 * @return question created if successful else null
	 */
	public Question createQuestion(String title, String message, User user) {
		if (Utility.isNotNullAndEmpty(title) && Utility.isNotNullAndEmpty(message) && user != null) {
			Question question = getQuestionByBody(message);
			if (question != null) {
				System.out.println("Asked question already exists with same body");
				return question;
			}
			question = new Question();
			question.autoGenerateId();
			question.setTitle(title);
			question.setMessage(message);
			question.setUser(user);
			question.setCreated();
			questions.add(question);
			return question;
		}
		System.out.println("Any specified field can't be empty");
		return null;
	}

	/**
	 * This method return the question object whose messages matches with the provided message
	 * @param questionMessage description of the question provided
	 * @return the question is message is same else null
	 */
	private Question getQuestionByBody(String questionMessage) {
		for (Question question : questions) {
			if (question.getMessage().equals(questionMessage)) {
				return question;
			}
		}
		return null;
	}

	/**
	 * This method return the question object whose id matches with the provided id
	 * @param id : id of the question provided
	 * @return the question if id matches else null
	 */
	public Question getQuestionById(long id) {
		for (Question question : questions) {
			if (question.getId() == id) {
				return question;
			}
		}
		return null;
	}

	/**
	 * This method deletes the question provided in parameter
	 * @param question question object which has to be deleted
	 */
	public void deleteQuestion(Question question) {
		questions.remove(question);
	}
}
