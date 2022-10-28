package pnu.user.dao.impl;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import pnu.user.dao.UserDAO;

@Repository
public class UserDAOImpl extends EgovAbstractMapper implements UserDAO {
	
	@Override
	public String selectPwd(String id) {
		return selectOne("User.selectPwd", id);
	}
	
}
