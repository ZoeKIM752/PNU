package pnu.board.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import pnu.board.dao.BoardDAO;
import pnu.board.vo.BoardVO;

@Repository
public class BoardDAOImpl extends EgovAbstractMapper implements BoardDAO {

	@Override
	public int insertBoard(BoardVO board) throws Exception {
		return insert("Board.insertBoard", board);
	}

	@Override
	public List<BoardVO> selectBoardList() throws Exception {
		return selectList("Board.selectBoardList");
	}

	@Override
	public BoardVO selectBoard(int boardId) throws Exception {
		return selectOne("Board.selectBoard", boardId);
	}

}
