package pnu.user.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

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
	
	@RequestMapping("/pwdConfirmPage.do")
	public String pwdConfirmPage() {
		return "user/pwdConfirm.jsp";
	}
	
	@RequestMapping("/userUpdatePage.do")
	public ModelAndView userUpdatePage(@ModelAttribute UserVO user) throws Exception {
		if(userService.selectPwd(user.getUserId(), user.getPwd())){
			ModelAndView mav = new ModelAndView("user/userUpdate.jsp");
			
			List<DeptVO> dept = deptService.selectDeptList();
			mav.addObject("dept", dept);
				
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("main.jsp");

			return mav;
		}
	}
	
	@RequestMapping("/userUpdate.do")
	public String userUpdate(HttpSession httpSession, @ModelAttribute UserVO user) throws Exception {
		userService.updateUser(user);
		userService.setSession(httpSession, user.getUserId());
		
		return "main.jsp";
	}

	@RequestMapping("/userDelete.do")
	public String userDelete(HttpSession session) throws Exception {
		UserVO user = (UserVO) session.getAttribute("USER");
		session.removeAttribute("USER");
		
		userService.deleteUser(user.getUserId());
		
		return "redirect:/loginPage.do";
	}
	
}
