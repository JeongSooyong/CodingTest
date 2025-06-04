
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 첫줄에 입력할 문자열의 갯수 t
		 * 각 문자열의 첫번째 글자와 마지막 글자 출력
		 */
		
		int t = sc.nextInt();

		
		// 정수 t만큼 문자열 입력
		for(int i=0;i<t;i++) {
			
			// 단어 입력
			String word = sc.next();
			
			// 각 단어의 첫번째 글자와 마지막 글자를 first와 last에 담는다.
			char first = word.charAt(0);
			char last = word.charAt(word.length()-1);
			
			System.out.println(first + "" + last);
			
		}

		
		
		
		
		sc.close();
		
		
	}

}
