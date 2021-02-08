package part8;

public class QnABoardWrite implements Write {

	private String sBoardName;
	
	public QnABoardWrite() {
		init();
	}
	
	public void init() {
		this.setsBoardName("Q&A Board");
	}
	
	public void setsBoardName(String sBoardName) {
		this.sBoardName = sBoardName;
	}
	
	public String getsBoardName() {
		return sBoardName;
	}
	
	public void doWrite() {
		System.out.println(this.getsBoardName() + "Write down!!");
	}
}
