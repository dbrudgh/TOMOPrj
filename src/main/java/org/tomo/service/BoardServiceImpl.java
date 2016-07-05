package org.tomo.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tomo.dao.BoardDAO;
import org.tomo.domain.BoardVO;
import org.tomo.domain.SearchCriteria;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	
	@Override
	public void boardAdd(BoardVO vo) throws Exception {
		dao.boardAdd(vo);
		
	}

	@Override
	public void boardModify(BoardVO vo) throws Exception {
		dao.boardModify(vo);
		
	}

	@Override
	public void boardDelete(Integer board_num) throws Exception {
		dao.boardDelete(board_num);
		
	}

	@Override
	public BoardVO boardRead(BoardVO vo) throws Exception {
		return dao.boardRead(vo);
	}

	@Override
	public List<BoardVO> boardAllList(BoardVO vo) throws Exception {
		return dao.boardAllList(vo);
	}

	@Override
	public int countPaging(SearchCriteria cri) throws Exception {
		
		return dao.countPaging(cri);
	}

}
