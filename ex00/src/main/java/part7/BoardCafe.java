package part7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BoardCafe implements Board{
	@Autowired
	@Qualifier("qnaWrite")
	private Write write;
	
	public void setWrite(Write write) {
		this.write = write;
	}
	
	public void boardWrite() {
		write.doWrite();
	}
}
