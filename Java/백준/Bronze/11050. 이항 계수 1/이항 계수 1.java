

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		/*
		 * 자연수 n과 정수 k
		 * 이항 계수
		 */
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int sum1 = 1;
		int sum2 = 1;
		int sum3 = 1;
		

		int result = 0;
		
		for(int i=1;i<=n;i++) {
		
			sum1 *= i;
			
		}
		
		for(int i=1;i<=k;i++) {
			
			sum2 *= i;
			
		}
		
		for(int i=1;i<=n-k;i++) {
			
			sum3 *= i;
			
		}
		
		result = sum1 / (sum2 * sum3);
		
		System.out.println(result);
		
		sc.close();

		
	}

}
