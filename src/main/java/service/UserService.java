package service;

import dao.UserDAO;

public class UserService {

	UserDAO userDAO = new UserDAO();
	
	public String getUserId(String userName) {
	return userDAO.getUserId(userName);	
	}
	
	public boolean userExist(String userName) {
		return userDAO.userExist(userName);
	}
}
