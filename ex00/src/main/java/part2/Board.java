package part2;

public class Board {

	private FreeBoardWrite write;
	
	public void setWrite(FreeBoardWrite write) {
		this.write = write;
	}
	public Board() {
		this.setWrite(new FreeBoardWrite());
	}
	public void boardWrite() {
		write.doWrite();
	}

}
