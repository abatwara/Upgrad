package com.forum.units;

public class User extends AbstractEntity {
	
	//unique name of user
	private String username;
	//password needed for login
	private String password;
	//unique emailid for user
	private String email;
	//role of user in discussion forum
	private UserRole userRole;
	//id of the last registered user
	private static Long lastEntry = 0L;

	/**
	 * it will generate the Id of the question and set to the question
	 */
	public void autoGenerateId() {
		lastEntry = lastEntry + 1L;
		super.setId(lastEntry);
	}

	/**
	 * This method will return the username
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method will set the username
	 * @param username to be assigned
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method will return the password
	 * @return password for the user
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method will set the password for the user
	 * @param password to be assigned to user
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method will return the email of the user
	 * @return email of the user
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method will set the email to the user
	 * @param email to be assigned to user
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method will return the userrole of the user
	 * @return user role of the user
	 */
	public UserRole getUserRole() {
		return userRole;
	}

	/**
	 * This method will set the user role to the user
	 * @param userRole to be assigned to user
	 */
	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}
	
}
