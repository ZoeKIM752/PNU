package pnu.board.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pnu.board.dao.BoardDAO;
import pnu.board.service.BoardService;
import pnu.board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO boardDAO;
	
	@Override
	public int insertBoard(BoardVO board) throws Exception {
		return boardDAO.insertBoard(board);
	}

}
