

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 소문자로만 이루어진 단어 s
		 * a~z가 입력한 단어에 있다면 처음 등장하는 s의 인덱스를 출력, 입력한 단어에 a~z가 없다면 -1 출력
		 * 
		 * ex) hello 입력시
		 * hello에 a는 없으므로 -1 출력, b도 없으므로 -1 출력, c도 없으므로 -1 출력
		 * -1 -1 -1 .... 이런식으로
		 */
		
		// 단어 입력
		String s = sc.next();
		
		
		
		// a부터 z까지의 반복문
		for(char c='a';c<='z';c++) {

			// 반복문으로 돌린 a~z에서 입력한 단어 s에 a~z가 포함되어있으면 s에서 해당 위치를 출력한다.
			// indexof 메서드는 포함되어있지 않으면 -1을 출력한다.
			System.out.print(s.indexOf(c)+" ");
			
		}
		
		sc.close();
		
		
	}

}
