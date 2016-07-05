package org.tomo.dao;

import java.util.List;

import org.tomo.domain.BoardVO;
import org.tomo.domain.SearchCriteria;


public interface BoardDAO {

	//게시글 등록
	public void boardAdd(BoardVO vo)throws Exception;
	
	public void boardModify(BoardVO vo)throws Exception;
	
	public void boardDelete(Integer board_num)throws Exception;
	
	public BoardVO boardRead(BoardVO vo)throws Exception;
	
	public List<BoardVO> boardAllList(BoardVO vo)throws Exception;
	
	public List<BoardVO> boardSearchList(SearchCriteria cri)throws Exception;
	
	public int countPaging(SearchCriteria cri) throws Exception;
	
	public int boardCount(Integer board_count)throws Exception;
	
	public int boardReccount(Integer board_reccount)throws Exception;
}
