package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	public void testGetList() {
		log.info("------------------------");
		boardMapper.getList();
	}
	
	@Test
	public void testInsert() {
		BoardVO vo = new BoardVO();
		vo.setTitle("test 테스트");
		vo.setContent("content 테스트");
		vo.setWriter("writer테스트");
		
		boardMapper.insert(vo);
		
		log.info("------------------------------------");
		log.info("alter insert" + vo.getBno());
	}
	
	@Test
	public void testInsertSelectKey() {
		BoardVO vo = new BoardVO();
		vo.setTitle("test 테스트");
		vo.setContent("content 테스트");
		vo.setWriter("writer테스트");
		
		boardMapper.insertSelectKey(vo);
		log.info("------------------------------------");
		log.info("alter insert selectKey  "+ vo.getBno());
	}
	
	@Test
	public void testRead() {
		BoardVO vo  = boardMapper.read(3L);
		log.info(vo);
	}
	
	
	@Test
	public void testDelete() {
		int deleteNum = boardMapper.delete(1L);
		log.info(deleteNum);
	}
	
	@Test
	public void testUpdate() {
		
		BoardVO vo = new BoardVO();
		vo.setTitle("titled");
		vo.setContent("contented");
		vo.setWriter("한글한글");
		
		log.info("update count: " + vo);
		
	}
	
	
	
}
