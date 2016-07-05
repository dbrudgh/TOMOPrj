package org.tomo.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.tomo.domain.BoardVO;
import org.tomo.domain.SearchCriteria;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	private SqlSession session;
	
	private static String namespace = "org.tomo.mappers.boardMapper";
	
	@Override
	public void boardAdd(BoardVO vo) throws Exception {
		session.insert(namespace +".boardAdd", vo);
		
	}

	@Override
	public void boardModify(BoardVO vo) throws Exception {
		session.update(namespace +".boardModify", vo);
		
	}

	@Override
	public void boardDelete(Integer board_num) throws Exception {
		session.delete(namespace +".boardDelete", board_num);
		
	}

	@Override
	public BoardVO boardRead(BoardVO vo) throws Exception {
		return (BoardVO) session.selectList(namespace+".boardRead", vo);
		
	}

	@Override
	public List<BoardVO> boardAllList(BoardVO vo) throws Exception {
		return session.selectList(namespace +".boardAllList", vo);
	}

	@Override
	public List<BoardVO> boardSearchList(SearchCriteria cri) throws Exception {
		
		return session.selectList(namespace+".boardSearchList", cri);
	}

	@Override
	public int countPaging(SearchCriteria cri) throws Exception {
	
		return session.selectOne(namespace+".countPaging", cri);
	}

	@Override
	public int boardCount(Integer board_count) throws Exception {
		
		return session.selectOne(namespace+".boardCount", board_count);
	}

	@Override
	public int boardReccount(Integer board_reccount) throws Exception {
		
		return session.selectOne(namespace+".baord_reccount", board_reccount);
	}

}
