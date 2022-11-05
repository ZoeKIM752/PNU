package pnu.user.service.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	public Boolean selectUsed(String userId) throws Exception {
		return "Y".equals(userDAO.selectUsed(userId));
	}

	@Override
	public Boolean selectPwd(String userId, String password) throws Exception {
		return password.equals(userDAO.selectPwd(userId));
	}

	@Override
	public Boolean setSession(HttpSession httpSession, String userId) throws Exception {
	    UserVO userInfo = userDAO.selectUserInfo(userId);
	    
	    if (userInfo != null) {
	        httpSession.setAttribute("USER", userInfo);
	    }
	    
		return userInfo != null;
	}

	@Override
	public int insertUser(UserVO user) throws Exception {
		return userDAO.insertUser(user);
	}

	@Override
	public int updateUser(UserVO user) throws Exception {
		return userDAO.updateUser(user);
	}

	@Override
	public int deleteUser(String userId) throws Exception {
		return userDAO.deleteUser(userId);
	}
	
}