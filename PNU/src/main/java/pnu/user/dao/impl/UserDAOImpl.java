package pnu.user.dao.impl;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import pnu.user.dao.UserDAO;

public class UserDAOImpl extends EgovAbstractMapper implements UserDAO {
	
	@Override
	public String selectPwd(String id) {
		return selectOne("User.selectPwd", id);
	}
	
}
