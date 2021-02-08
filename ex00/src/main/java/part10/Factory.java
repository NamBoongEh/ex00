package part10;

public class Factory {
	public static Write getWriteInstance() {
		return new FreeBoardWrite();
	}
	public static Board getBoardInstance() {
		return new BoardCafe();
	}
}
