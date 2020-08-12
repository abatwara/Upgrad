package com.forum.main;

import java.io.IOException;

import com.forum.units.Question;
import com.forum.units.User;
import com.forum.units.UserRole;
import com.forum.util.Utility;

import discusion.forum.activiy.UserActivity;

public class DiscussionForum {
	/**
	 * Program execution starts from here, it will give prompt to provide the username and password
	 * default username and password is admin admin
	 * @param args : arguments for the main method
	 * @throws IOException : will be thrown for IO issue
	 */
	public static void main(String args[]) throws IOException {
		User user;
		UserActivity userActivity = new UserActivity();
		userActivity.userService.createUser("admin", "admin", "admin", UserRole.ADMIN);
		while (true) {
			user = userActivity.loginActivity();
			if (user == null)
				continue;
			System.out.println("Welcome " + user.getUsername());
			menu(user, userActivity);
		}
	}

	/**
	 * it will give the fist menu after user logs in successfully
	 * @param user : the current logged in user
	 * @param userActivity : the user's activity history
	 * @throws NumberFormatException  : will be thrown if number is not provided as user input
	 * @throws IOException : will be thrown for IO issue
	 */
	public static void menu(User user, UserActivity userActivity) throws NumberFormatException, IOException {
		while (true) {
			int menuIndex = 0;
			if (user.getUserRole() == UserRole.ADMIN) {
				System.out.println(++menuIndex + " Create new user");
			}
			System.out.println(++menuIndex + " Ask a question");
			System.out.println(++menuIndex + " See all questions");
			System.out.println(++menuIndex + " Log Out");
			System.out.println("\n Enter your choice");
			if (!classifyMenuChoice(Integer.parseInt(Utility.inputFromUser()), userActivity, user))
				break;
			
		}
	}

	/**
	 * it will provide the further actions based on user selection from previous menu
	 * @param choice : choice selected by user
	 * @param userActivity : the user's activity history
	 * @param user : the current logged in user
	 * @return true if user want to remain in same menu and chooses the option from that menu
	 * @throws IOException : will be thrown for IO issue
	 */
	public static boolean classifyMenuChoice(int choice, UserActivity userActivity, User user) throws IOException {
		if (UserRole.ADMIN != user.getUserRole()) {
			choice++;
		}
		while (true) {
			switch (choice) {
				case 1:
					userActivity.createNewUser();
					return true;
				case 2:
					userActivity.postNewQuestion(user);
					return true;
				case 3:
					userActivity.seeAllQuestions(userActivity, user);
					return true;
				case 4:
					return false;
				default:
					System.out.println("Wrong choice. Try again");
			}
			System.out.println("\n Enter your choice");
			choice = Integer.parseInt(Utility.inputFromUser());
		}
	}

	/**
	 * it will ask the user role from user and return the userrole selected by user
	 * @return UserRole if correct option is selected else dispaly wrong choice message
	 * @throws NumberFormatException : will be thrown if number is not provided as user input
	 * @throws IOException : will be thrown for IO issue
	 */
	public static UserRole roleFromMenu() throws NumberFormatException, IOException {
		int menuIndex = 0;
		System.out.println(++menuIndex + UserRole.ADMIN.toString());
		System.out.println(++menuIndex + UserRole.MODERATOR.toString());
		System.out.println(++menuIndex + UserRole.USER.toString());
		while (true) {
			System.out.println("\n Enter your choice");
			int choice = Integer.parseInt(Utility.inputFromUser());
			switch (choice) {
				case 1:
					return UserRole.ADMIN;
				case 2:
					return UserRole.MODERATOR;
				case 3:
					return UserRole.USER;
				default:
					System.out.println("Wrong choice. Try again");
			}
		}
	}

	/**
	 * It will provide the menu related to operations performed on questions
	 * @param userActivity : the user's activity history
	 * @param user : current logged in user
	 * @throws NumberFormatException : will be thrown if number is not provided as user input
	 * @throws IOException : will be thrown for IO issue
	 */
	public static void questionMenu(UserActivity userActivity, User user) throws NumberFormatException, IOException {
		while (true) {
			int menuIndex = 0;
			System.out.println(++menuIndex + " Upvote a question");
			System.out.println(++menuIndex + " Reply to a question");
			System.out.println(++menuIndex + " See replies for a question");
			System.out.println(++menuIndex + " Delete a question");
			System.out.println(++menuIndex + " Return to main menu");
			System.out.println("\n Enter your choice");
			if (!processQuestionChoice(Integer.parseInt(Utility.inputFromUser()), userActivity, user)) {
				break;
			}
		}
	}

	/**
	 * It will process the question choice provided by the user and perfrom the actions elected by user
	 * @param choice : choice selected by user
	 * @param userActivity : the user's activity history
	 * @param user : current logged in user
	 * @return true if user want to remain in same menu and chosses the option from that menu
	 * @throws NumberFormatException : will be thrown if number is not provided as input
	 * @throws IOException : will be thrown for IO issue
	 */
	public static boolean processQuestionChoice(int choice, UserActivity userActivity, User user) throws NumberFormatException, IOException {
		while (true) {
			switch (choice) {
				case 1:
					userActivity.upvoteQuestion(user);
					return true;
				case 2:
					userActivity.replyToQuestion(user);
					return true;
				case 3:
					userActivity.seeAllReplies(userActivity, user);
					return true;
				case 4:
					userActivity.deleteQuestion(userActivity, user);
					return true;
				case 5:
					return false;
				default:
					System.out.println("Wrong choice. Try again");
			}
			System.out.println("Enter your choice");
			choice = Integer.parseInt(Utility.inputFromUser());
		}
	}

	/**
	 * It will provide the menu related to operations performed on replies
	 * @param userActivity : the user's activity history
	 * @param user : current logged in user
	 * @param question : question selected by user
	 * @throws NumberFormatException : exception will b thrown if number is not provided as user input
	 * @throws IOException : exception will be thrown if error in input and output
	 */
	public static void replyMenu(UserActivity userActivity, User user, Question question) throws NumberFormatException, IOException {
		while (true) {
			int menuIndex = 0;
			System.out.println(++menuIndex + " Upvote a reply");
			System.out.println(++menuIndex + " Delete a reply");
			System.out.println(++menuIndex + " Return to question menu");
			System.out.println("\n Enter your choice");
			if (!processReplyChoice(Integer.parseInt(Utility.inputFromUser()), userActivity, user, question)) {
				break;
			}
		}
	}

	/**
	 * It will process the reply choice provided by the user and perfrom the actions selected by user
	 * @param choice : choice selected by user
	 * @param userActivity : the user's activity history
	 * @param user : current logged in user
	 * @param question : question selected by user
	 * @return true if user wants to remain in the same menu and select option 1 and 2
	 * @throws NumberFormatException : exception will be thrown if number is not provided as input from user
	 * @throws IOException : exception will thrown for IO
	 */
	public static boolean processReplyChoice(int choice, UserActivity userActivity, User user, Question question) throws NumberFormatException, IOException {
		while (true) {
			switch (choice) {
				case 1:
					userActivity.upvoteReply(user);
					return true;
				case 2:
					userActivity.deleteReply(question, userActivity, user);
					return true;
				case 3:
					return false;
				default:
					System.out.println("Wrong choice. Try again");
			}
		}
	}
}
