package pnu.board.service.impl;

import java.util.List;

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

	@Override
	public List<BoardVO> selectBoardList() throws Exception {
		return boardDAO.selectBoardList();
	}

	@Override
	public BoardVO selectBoard(int boardId) throws Exception {
		return boardDAO.selectBoard(boardId);
	}

	@Override
	public int updateBoard(BoardVO board) throws Exception {
		return boardDAO.updateBoard(board);
	}

	@Override
	public int deleteBoard(int boardId) throws Exception {
		return boardDAO.deleteBoard(boardId);
	}

}
