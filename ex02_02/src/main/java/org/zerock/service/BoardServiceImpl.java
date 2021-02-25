package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {

	private BoardMapper mapper;
	
	
//	@Setter(onMethod_ = @Autowired)
//	private BoardMapper mapper;

	@Override
	public void register(BoardVO board) {
		// TODO Auto-generated method stub
		log.info("등록주우우우우우우우ㅜ웅" + board);
		mapper.insertSelectKey(board);
	}

	@Override
	public BoardVO get(Long bno) {
		log.info("얻자아아아아아아아" + bno);
		return mapper.read(bno);
		// TODO Auto-generated method stub
	}

	@Override
	public boolean modify(BoardVO board) {
		log.info("modify........" + board);
		return mapper.update(board) == 1;
		// TODO Auto-generated method stub
	}

	@Override
	public boolean remove(Long bno) {
		log.info("지우기........" + bno);
		return mapper.delete(bno) == 1;
	}

	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		return null;
	}
}
