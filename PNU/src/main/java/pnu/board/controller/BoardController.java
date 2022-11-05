package pnu.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import pnu.board.service.BoardService;
import pnu.board.vo.BoardVO;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@RequestMapping("/boardInsertPage.do")
	public String boardInsertPage() throws Exception {
		return "board/boardInsert.jsp";
	}
	
	@RequestMapping("/boardInsert.do")
	public String signUboardInsertp(@ModelAttribute BoardVO board) throws Exception {
		boardService.insertBoard(board);
		return "main.jsp";
	}
	
}
