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
	public Boolean selectPwd(String userId, String password) throws Exception {
		if(password.equals(userDAO.selectPwd(userId))){
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Boolean loginProcess(HttpServletRequest request, UserVO user) throws Exception {
		setSession(request, user);
		return true;
	}
	
	public void setSession(HttpServletRequest request, UserVO user) throws Exception {
	    UserVO userInfo = userDAO.selectUserInfo(user.getUserId());
	    
	    if (userInfo != null) {
	        HttpSession httpSession = request.getSession(true);
	        httpSession.setAttribute("USER", userInfo);
	    } 
	}

	@Override
	public int insertUser(UserVO user) throws Exception {
		return userDAO.insertUser(user);
	}
	
}