package part8;

import javax.annotation.Resource;

public class BoardCafe implements Board{
	@Resource(name="qnaWrite")
	private Write write;
	
	public void boardWrite() {
		write.doWrite();
	}
}
