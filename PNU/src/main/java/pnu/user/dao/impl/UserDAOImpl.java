package pnu.user.dao.impl;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import pnu.user.dao.UserDAO;
import pnu.user.vo.UserVO;

@Repository
public class UserDAOImpl extends EgovAbstractMapper implements UserDAO {

	@Override
	public String selectUsed(String userId) throws Exception {
		return selectOne("User.selectUsed", userId);
	}
	
	@Override
	public String selectPwd(String userId) throws Exception {
		return selectOne("User.selectPwd", userId);
	}

	@Override
	public UserVO selectUserInfo(String userId) throws Exception {
		return selectOne("User.selectUserInfo", userId);
	}
	
	@Override
	public int insertUser(UserVO user) throws Exception {
		return insert("User.insertUser", user);
	}

	@Override
	public int updateUser(UserVO user) throws Exception {
		return update("User.updateUser", user);
	}

	@Override
	public int deleteUser(String userId) throws Exception {
		return update("User.deleteUser", userId);
	}
	
}
