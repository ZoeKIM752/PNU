package pnu.user.service;

import javax.servlet.http.HttpSession;

import pnu.user.vo.UserVO;

public interface UserService {

	public Boolean selectPwd(String userId, String password) throws Exception;
	
	public Boolean setSession(HttpSession httpSession, String userId) throws Exception;

	public int insertUser(UserVO user) throws Exception;

	public int updateUser(UserVO user) throws Exception;
	
}
