package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}
	
	@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setTitle("ÄáÁã¾ß »¡¸®¿ÍºÁ");
		board.setContent("ÄáÁã¾ß Àã´ò¾î ÄáÁã¾ß");
		board.setWriter("µÎ²¨ºñ");
		
		mapper.insert(board);
		log.info(board);
	}
	
	@Test
	public void testInsertSelectKey() {
		BoardVO board = new BoardVO();
		board.setTitle("»õ·Î ÀÛ¼ºÇÑ ±ÛÀÎµ¥ Á¶Á³¾î");
		board.setContent("ÀÌ°Å ¸ø¸·¾Æ ÄáÁã¾ß¤Ğ¤Ğ");
		board.setWriter("µÎ²®ÁÂ");
		
		mapper.insertSelectKey(board);
		log.info(board);
	}
	
	@Test
	public void testRead() {
		BoardVO board = mapper.read(5L);
		log.info(board);
	}
	
	@Test
	public void testDelete() {
		log.info("Áö¿ì´Â°Å Ä«¿îÆ® : " + mapper.delete(3L));
	}
	
	@Test
	public void testUpdate() {
		BoardVO board = new BoardVO();
		board.setBno(10L);
		board.setTitle("ÁÒ½Ã¾ß »¡¸®¿ÍºÁ...");
		board.setContent("ÁÒ½Ã¾ß »ñ´ò¾î....");
		board.setWriter("³²ºØ¾î");
		
		int count = mapper.update(board);
		log.info("¾÷µ¥ÀÌÆ® ½ÃÀÛ! : "  + count);
	}
}
