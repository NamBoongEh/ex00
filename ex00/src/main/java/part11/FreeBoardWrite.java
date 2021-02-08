package part11;

public class FreeBoardWrite implements Write{
	private String sBoardName;
	/* 생성자 초기화 작업을 대체하는지 확인하기 위해서 생성자를 주석처리
	public FreeBoardWrite() {
		init();
	}
	*/
	
	@PostConstruct
	public void init() {
		this.setsBoardName("Free Board");
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
