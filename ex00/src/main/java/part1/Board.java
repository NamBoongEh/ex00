package part1;

public class Board {

	private Write write;
	
	public void setWrite(Write write) {
		this.write = write;
	}
	public Board() {
		this.setWrite(new Write());
	}
	public void boardWrite() {
		write.doWrite();
	}

}
