package part4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("spring/context4.xml");
		
		Board board = Factory.getBoardInstance();
		Board board2 = Factory.getBoardInstance();

		System.out.println("board: " + board);
		System.out.println("board2: " + board2);

		board.boardWrite();
	}

}
