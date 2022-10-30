package pnu.user.dao;

import pnu.user.vo.UserVO;

public interface UserDAO {

	public String selectPwd(String userId) throws Exception;

	public UserVO selectUserInfo(String userId) throws Exception;

	public int insertUser(UserVO user) throws Exception;
	
}
