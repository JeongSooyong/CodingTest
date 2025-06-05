

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 상수 a, b
		 * 숫자 a와 b를 역순으로 하고 비교했을때 큰 수를 출력
		 */
		
		// 정수를 list에 담기위해서 String으로 입력
		String a = sc.next();
		String b = sc.next();
		
		// 입력한 a와 b를 list에 넣기위해 list 두개 생성
		List<Character> list1 = new ArrayList<>();
		List<Character> list2 = new ArrayList<>();
		
		
		// 입력했던 문자열을 문자
		for(int i=0;i<3;i++) {
			
			list1.add(a.charAt(i));
			list2.add(b.charAt(i));
			
		}
		
		// list1,2를 거꾸로 한다.
		Collections.reverse(list1);
		Collections.reverse(list2);
		
		// 리스트를 문자열로 바꾸기 위해 StringBuilder 객체 생성
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		
		// 반복문으로 list의 각 문자를 StringBuilder에 담아 문자열로 바꾸어준다.
		for(int i=0;i<3;i++) {
			
			sb1.append(list1.get(i));
			sb2.append(list2.get(i));
			
		}
		
		// 숫자 a와 b를 비교하기위해 int타입으로 바꾸어준다.
		int numA = Integer.parseInt(sb1.toString());
		int numB = Integer.parseInt(sb2.toString());
		

		// numA와 numB중 큰값 출력
		System.out.println(Math.max(numA, numB));

		
		
		sc.close();
		
		
	}

}
