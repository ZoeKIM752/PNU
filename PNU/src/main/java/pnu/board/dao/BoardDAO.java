package pnu.board.dao;

import java.util.List;

import pnu.board.vo.BoardVO;

public interface BoardDAO {
	public List<BoardVO> selectBoardList();
	public int insertBoard(BoardVO board);
}
