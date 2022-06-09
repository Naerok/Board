package org.zerock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{
	
	private final BoardMapper mapper;
	
	@Override
	public String toString() {
		return "BoardServiceImpl [mapper=" + mapper + "]";
	}

	@Autowired
	public BoardServiceImpl(BoardMapper mapper) {
		super();
		this.mapper = mapper;
	}

}
