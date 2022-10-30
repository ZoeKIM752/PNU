package pnu.user.dao;

import pnu.user.vo.UserVO;

public interface UserDAO {

	public String selectPwd(String id) throws Exception;

	public int insertUser(UserVO user) throws Exception;
	
}
