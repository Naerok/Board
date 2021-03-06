package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardService {
	
	  public void register(BoardVO board);
	  public BoardVO get(Long bno); 
	  public int modify(BoardVO board);
	  public int remove(Long bno);
	  public List<BoardVO> getList(); // 전체목록을 가지고옴
	
}
