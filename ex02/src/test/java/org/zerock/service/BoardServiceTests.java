package org.zerock.service;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;
import org.zerock.mapper.BoardMapperTests;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTests {
	
	private Logger logger = LogManager.getLogger(BoardServiceTests.class);
	
	
	@Autowired
	private BoardService service;
	
	@Test
	public void testPrint() {
		logger.info("serviceLogger " + service);
	}
	
	@Test
	public void testGetList() {
		service.getList().forEach(board -> logger.info(board));
	}
	
	@Test
	public void testRegister() {
		BoardVO vo = new BoardVO();
		vo.setTitle("test 테스트");
		vo.setContent("content 테스트");
		vo.setWriter("writer테스트");
		
		long bno= service.register(vo);
		
		logger.info("bno test  :  " +bno);
		
		
	}
	

}
