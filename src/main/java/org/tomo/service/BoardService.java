package org.tomo.service;

import java.util.List;

import org.tomo.domain.BoardVO;
import org.tomo.domain.SearchCriteria;


public interface BoardService {

	//게시글 등록
	public void boardAdd(BoardVO vo)throws Exception;
	
	public void boardModify(BoardVO vo)throws Exception;
	
	public void boardDelete(Integer board_num)throws Exception;
	
	public BoardVO boardRead(BoardVO vo)throws Exception;
	
	public List<BoardVO> boardAllList(BoardVO vo)throws Exception;
	
	public int countPaging(SearchCriteria cri) throws Exception;
}
