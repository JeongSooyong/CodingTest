
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 단어를 입력하면 그 길이 출력
		 * ex) hello를 입력하면 5출력
		 */
		
		String word = sc.next();

		
		
		System.out.println(word.length());
		
		
		
		sc.close();
		
		
	}

}
