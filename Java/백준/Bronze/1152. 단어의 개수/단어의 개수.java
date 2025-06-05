

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 영어 대소문자와 공백으로 이루어진 문자열 str
		 * 단어는 공백 한개로 구분(공백이 연속으로 X)
		 * 문자열은 공백으로 시작하거나 끝날수 있음.
		 */
		
		
		String str = sc.nextLine();
		
		// 공백일때는 0을 출력하기위해 if문 사용
		if(str.trim().isEmpty()) {
			System.out.println(0);
		} else {
			// trim으로 양 끝의 공백을 제거하고 split으로 공백을 기준으로 나누어 배열에 담는다.
			// split에는 " " 하나의 공백이 아니라 정규화표현식 +를 사용해서 하나 이상의 공백을 표현해준다.
			String[] arr = str.trim().split("\\s+");
			
			System.out.println(arr.length);
		}
		

		
		
		sc.close();
		
		
	}

}
