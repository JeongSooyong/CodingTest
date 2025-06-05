

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		/*
		 * 10진법 수 n
		 * n을 b진법으로 바꿔 출력
		 */
		
		int n = sc.nextInt();
		int b = sc.nextInt();
		
		String str = Integer.toString(n, b).toUpperCase();
		
		System.out.println(str);
		
		
		

		
		sc.close();

		
	}

}
