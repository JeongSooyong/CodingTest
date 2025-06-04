
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 알파벳 소문자, 대문자, 숫자0-9중 하나를 입력했을때
		 * 해당 글자의 아스키 코드값을 출력
		 */
		
		
		// 단어 입력
		char ch = sc.next().charAt(0);
		
		int n = (int)ch;
		
		System.out.println(n);
		
		

		
		
		
		
		sc.close();
		
		
	}

}
