package pnu.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pnu.dept.service.DeptService;
import pnu.dept.vo.DeptVO;
import pnu.user.service.UserService;
import pnu.user.vo.UserVO;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("/signUpPage.do")
	public ModelAndView signUpPage() throws Exception {
		ModelAndView mav = new ModelAndView("user/signUp.jsp");
		List<DeptVO> dept = deptService.selectDeptList();
		mav.addObject("dept", dept);
		
		return mav;
	}
	
	@RequestMapping("/signUp.do")
	public String signUp(@ModelAttribute UserVO user) throws Exception {
		userService.insertUser(user);
		
		return "redirect:/loginPage.do";
	}
	
}
