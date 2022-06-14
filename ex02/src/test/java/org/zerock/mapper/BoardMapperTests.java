package org.zerock.mapper;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
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
    // private final Logger LOGGER = LoggerFactory.getLogger(BoardMapperTests.class.getName());
		private Logger logger = LogManager.getLogger(BoardMapperTests.class);
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	public void testGetList() {
	// log.info("------------------------");
	//	logger.info("로그테스트  "+boardMapper.getList());
		boardMapper.getList();
	}
	
	@Test
	public void testInsert() {
		BoardVO vo = new BoardVO();
		vo.setTitle("test 테스트");
		vo.setContent("content 테스트");
		vo.setWriter("writer테스트");
		
		boardMapper.insert(vo);
		
	//	log.info("------------------------------------");
	//	log.info("alter insert" + vo.getBno());
	}
	
	@Test
	public void testInsertSelectKey() {
		BoardVO vo = new BoardVO();
		vo.setTitle("test 테스트");
		vo.setContent("content 테스트");
		vo.setWriter("writer테스트");
		
		boardMapper.insertSelectKey(vo);
		//log.info("------------------------------------");
	//	log.info("alter insert selectKey  "+ vo.getBno());
	}
	
	@Test
	public void testRead() {
		BoardVO vo  = boardMapper.read(3L);
	//	log.info(vo);
	}
	
	
	@Test
	public void testDelete() {
		int deleteNum = boardMapper.delete(2L);
		//log.info(deleteNum);
	}
	
	@Test
	public void testUpdate() {
		
		BoardVO vo = new BoardVO();
		vo.setBno(2L);
		vo.setTitle("titled");
		vo.setContent("contented");
		vo.setWriter("한글한글");
		logger.info("로그테스트  "+boardMapper.update(vo));
		//System.out.println("update count: " + vo);
		//LOGGER.info("update count: "+vo);
	}
	
	
	
}
