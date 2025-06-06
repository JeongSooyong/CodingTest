

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		/*
		 * 한 변의 길이가 1인 정사각형.
		 * 겹치지않게 규칙적으로 붙여나감.
		 * 정사각형의 개수 n
		 * 정사각형은 1, 3, 5... 의 규칙
		 * 1 입력하면 정사각형 4
		 * 2 입력하면 정사각형 8
		 * 3 입력하면 정사각형 12
		 * 4 입력하면 정사각형 16
		 */
		
		long n = sc.nextLong();
		
		System.out.println(4*n);
		
		sc.close();

		
	}

}
