package org.zerock.service;

import static org.junit.Assert.assertNotNull;

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
public class BoardServiceTests {

	@Setter(onMethod_ = {@Autowired})
	private BoardService service;
	
	@Test
	public void testExist() {
		log.info(service);
		assertNotNull(service);
	}
	
	@Test
	public void testRegister() {
		BoardVO board = new BoardVO();
		board.setTitle("또 작성해 콩쥐야...");
		board.setContent("내용은 다른거지롱 속았지?");
		board.setWriter("두껍뉴비");
		
		service.register(board);
		log.info("생성된 게시물의 번호 : " + board.getBno());
	}
	
	@Test
	public void testGet() {
		log.info(service.get(10L));
	}
	
	@Test
	public void testDelete() {
		log.info("지운 결과아아아아 : " + service.remove(2L));
	}
	
	@Test
	public void testUpdate() {
		BoardVO board = service.get(6L);
		
		if(board==null)
			return;
		
		board.setTitle("제목 수정할게요ㅠㅠ");
		log.info("modify 결과 : " + service.modify(board));
	}
}
