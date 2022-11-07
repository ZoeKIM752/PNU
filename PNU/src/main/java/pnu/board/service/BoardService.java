package pnu.board.service;

import java.util.List;

import pnu.board.vo.BoardVO;

public interface BoardService {

	public int insertBoard(BoardVO board) throws Exception;
	
	public List<BoardVO> selectBoardList() throws Exception;
	
	public BoardVO selectBoard(int boardId) throws Exception;
	
}
