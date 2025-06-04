
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 문자열의 갯수 t
		 * 입력한 문자열 s
		 * 반복 횟수 r
		 * ex) t=1
		 * 3 ABC
		 * 입력시 ABCABCABC
		 */
		
		int t = sc.nextInt();
		
		// 가장 먼저 t만큼 반복문
		for(int i=0;i<t;i++) {
			
			// 각 문자(char)를 반복할 횟수
			int r = sc.nextInt();
			// t만큼 문자열 입력
			String s = sc.next();
			
			
			// 문자열 s의 각 문자를 반복해주기 위해 반복문을 통해 j를 변수 ch에 문자로 할당한다.
			for(int j=0;j<s.length();j++) {
				
				char ch = s.charAt(j);
				
				// 문자열 s의 각 문자를 담은 변수 ch를 위의 변수 r만큼 반복한다.
				for(int k=0;k<r;k++) {
					
					System.out.print(ch);
					
				}
				
			}
			System.out.println();
			
			
		}
		
		
		
		sc.close();
		
		
	}

}
