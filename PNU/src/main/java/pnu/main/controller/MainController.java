package pnu.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pnu.user.service.UserService;
import pnu.user.vo.UserVO;

@Controller
public class MainController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/login.do", method = RequestMethod.POST)
	public String mainPage(@ModelAttribute UserVO user) {
		if(userService.selectPwd(user.getUserId(), user.getPwd())){
			return "main.jsp";
		} else {
			return "login.jsp";
		}
	}
	
	@RequestMapping("/loginPage.do")
	public String loginPage() {
		return "login.jsp";
	}
}
