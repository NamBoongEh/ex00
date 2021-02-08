package part9;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;


@Component("board")
public class BoardCafe implements Board{
	@Resource(name="qnaWrite")
	private Write write;
	
	public void boardWrite() {
		write.doWrite();
	}
}
