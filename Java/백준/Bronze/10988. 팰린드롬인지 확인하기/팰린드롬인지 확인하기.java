

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		/*
		 * 문자열 str
		 * str를 거꾸로해도 같으면 1출력 아니면 0출력
		 * ex) level은 거꾸로 해도 똑같기때문에 1출력
		 */
		
		
		// 문자열 입력
		String str = sc.next();
		
		// char타입 변수 ch 생성
		char ch = ' ';
		
		// list 생성
		List<Character> list = new ArrayList<>();
		
		// list를 뒤집을 list2 생성
		List<Character> list2 = new ArrayList<>();
		
		// str의 문자열을 반복문을 통해 ch에 할당
		for(int i=0;i<str.length();i++) {
			
			ch = str.charAt(i);
			
			// 리스트에 ch를 넣는다.
			list.add(ch);
			list2.add(ch);
			
		}
		
		// list2만 뒤집는다.
		Collections.reverse(list2);
		
		if(list.equals(list2)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		
		
		
		
		sc.close();

		
		
	}

}
