package pnu.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pnu.user.dao.UserDAO;
import pnu.user.service.UserService;
import pnu.user.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public Boolean selectPwd(String userId, String password) throws Exception {
		if(password.equals(userDAO.selectPwd(userId))){
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int insertUser(UserVO user) throws Exception {
		return userDAO.insertUser(user);
	}
	
}