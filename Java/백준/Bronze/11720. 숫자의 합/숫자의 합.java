

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 숫자의 갯수 n
		 * 연속된 숫자를 담을 변수 str
		 * str을 int로 변환하여 정수의 합을 구한다.
		 */
		
		int n = sc.nextInt();
		String str = sc.next();
		
		int num = 0;
		int sum = 0;
		
		// 반복문으로 str의 모든 숫자를 char타입으로 바꾸고 아스키코드로 출력되지 않도록 -'0'을 해준다.
		for(int i=0;i<n;i++) {
			
			num = str.charAt(i)-'0';
			
			sum += num;
			
		}
		
		System.out.println(sum);
		
		
		

		
		
		
		
		sc.close();
		
		
	}

}
