

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		/*
		 * n!을 출력
		 * ex) n이 3이라면
		 * 3 * 2 * 1
		 * n * (n-1) * (n-2)
		 */
		
		int n = sc.nextInt();
		
		int sum = 1;
		
		
		for(int i=1;i<=n;i++) {
				
			sum *= i;
				
		}
		
		
		
		System.out.println(sum);
		
		sc.close();

		
	}

}
