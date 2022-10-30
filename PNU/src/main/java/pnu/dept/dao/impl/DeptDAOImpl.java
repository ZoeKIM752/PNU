package pnu.dept.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import pnu.dept.dao.DeptDAO;
import pnu.dept.vo.DeptVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository
public class DeptDAOImpl extends EgovAbstractMapper implements DeptDAO {

	@Override
	public List<DeptVO> selectDeptList() throws Exception {
		return selectList("Dept.selectDeptList");
	}

}