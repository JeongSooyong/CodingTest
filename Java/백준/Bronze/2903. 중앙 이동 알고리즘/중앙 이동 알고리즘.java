

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		/*
		 * 첫째줄에 과정의 횟수 n
		 * 초기값은 4, 1입력시 9, 2입력시 25
		 * 초기값 = 2의 제곱
		 * (n+1)(n+1)
		 */
		
		int n = sc.nextInt();
		
		int cnt = 1;
		
		for(int i=1;i<=n;i++) {
			
			cnt *= 2;
			
		}
		
		System.out.println((cnt+1)*(cnt+1));
		
		
		
		
		
		sc.close();

		
	}

}
