package pnu.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/boardListPage.do")
	public ModelAndView boardListPage() throws Exception {
		ModelAndView mav = new ModelAndView("board/boardList.jsp");
		mav.addObject("boardList", boardService.selectBoardList());
		return mav;
	}	
	
	@RequestMapping("/boardInfoPage/{boardId}.do")
	public ModelAndView boardInfoPage(@PathVariable("boardId") int boardId) throws Exception {
		ModelAndView mav = new ModelAndView("board/boardInfo.jsp");
		
		BoardVO board = boardService.selectBoard(boardId);
		mav.addObject("board", board);
		
		return mav;
	}
	
	@RequestMapping("/boardUpdatePage.do")
	public ModelAndView boardUpdatePage(int boardId) throws Exception {
		ModelAndView mav = new ModelAndView("board/boardUpdate.jsp");
		
		BoardVO board = boardService.selectBoard(boardId);
		mav.addObject("board", board);
		
		return mav;
	}
	
	@RequestMapping("/boardUpdate.do")
	public String boardUpdate(@ModelAttribute BoardVO board) throws Exception {
		boardService.updateBoard(board);
		
		return "redirect:/boardInfoPage/"+Integer.toString(board.getBoardId())+".do";
	}
	
}
