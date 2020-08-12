package discussion.forum.units.service;

import com.forum.units.User;
import com.forum.units.UserRole;

public interface UserService {
	// method to create the user
	User createUser(String username, String password, String email, UserRole userRole);
	// method to return the user if username and password are correct
	User getUser(String username, String password);
}
