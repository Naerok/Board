package org.zerock.mapper;

import java.util.List;
import org.zerock.domain.BoardVO;

public interface BoardMapper {
	
	List<BoardVO> getList();
	
	void insert(BoardVO board);
	
	void insertSelectKey(BoardVO board);
	
	BoardVO read(Long bno);
	
	// 수정과 삭제는 int 타입을 사용하여 몇번째가 삭제되었는지 확인하는것이 바람직하다.
	int update(BoardVO board);
	
	int delete(Long bno);
	
	
}
