package pnu.user.service;

import javax.servlet.http.HttpServletRequest;

import pnu.user.vo.UserVO;

public interface UserService {

	public Boolean selectPwd(String userId, String password) throws Exception;
	
	public Boolean loginProcess(HttpServletRequest request, UserVO user) throws Exception;

	public int insertUser(UserVO user) throws Exception;
	
}
