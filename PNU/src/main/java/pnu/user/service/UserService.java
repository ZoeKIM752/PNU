package pnu.user.service;

import pnu.user.vo.UserVO;

public interface UserService {

	public Boolean selectPwd(String userId, String password) throws Exception;

	public int insertUser(UserVO user) throws Exception;
	
}
