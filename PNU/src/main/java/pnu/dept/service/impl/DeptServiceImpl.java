package pnu.dept.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pnu.dept.dao.DeptDAO;
import pnu.dept.vo.DeptVO;
import pnu.dept.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	private DeptDAO deptDAO;
	
	@Override
	public List<DeptVO> selectDeptList() throws Exception {
		return deptDAO.selectDeptList();
	}

}