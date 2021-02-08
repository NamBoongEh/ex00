package part3;

public class MainApp {

	public static void main(String[] args) {
		Board board = Factory.getBoardInstance();
		board.boardWrite();
	}

}
