

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		/*
		 * 테스트 케이스 개수 t
		 * 각 테스트 케이스는 거스름돈 c를 나타내는 정수 하나
		 * c = 100이면 100센트
		 * 쿼터=25, 다임=10, 니켈=5, 페니=1
		 */
		
		
		int t = sc.nextInt();
		
		// 쿼터, 다임, 니켈, 페니 변수 초기화
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		
		// t만큼 반복문을 통해 c 입력
		for(int i=0;i<t;i++) {
			
			int c = sc.nextInt();
			
			// 거슬러줘야하는 동전들의 개수
			quarter = c/25;
			dime = c%25/10;
			nickel = c%25%10/5;
			penny = c%25%10%5/1;
		
			System.out.print(quarter + " ");
			System.out.print(dime + " ");
			System.out.print(nickel + " ");
			System.out.println(penny);
			
			
		}
		
		
		
		sc.close();

		
	}

}
