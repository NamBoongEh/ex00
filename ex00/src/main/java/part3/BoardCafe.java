package part3;

public class BoardCafe implements Board{
	private Write write;
	
	public void setWrite(Write write) {
		this.write = write;
	}
	
	public BoardCafe() {
		this.setWrite(Factory.getWriteInstance());
	}
	
	public void boardWrite() {
		write.doWrite();
	}
}
