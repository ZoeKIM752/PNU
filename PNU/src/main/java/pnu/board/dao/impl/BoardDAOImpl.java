package pnu.board.dao.impl;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import pnu.board.dao.BoardDAO;
import pnu.board.vo.BoardVO;

@Repository
public class BoardDAOImpl extends EgovAbstractMapper implements BoardDAO {

	@Override
	public int insertBoard(BoardVO board) {
		return insert("Board.insertBoard", board);
	}

}
