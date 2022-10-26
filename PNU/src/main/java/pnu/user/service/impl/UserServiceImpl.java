package pnu.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import pnu.user.dao.UserDAO;
import pnu.user.service.UserService;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public Boolean selectPwd(String id, String password) {
		if(password.equals(userDAO.selectPwd(id))){
			return true;
		} else {
			return false;
		}
	}
	
}