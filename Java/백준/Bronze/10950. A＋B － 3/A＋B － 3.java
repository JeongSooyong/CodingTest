

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// a+b 수식을 할 횟수를 변수 t로 지정
		int t = scanner.nextInt();
		
		for(int i=1;i<=t;i++) {
			
			// t 횟수만큼 입력한 a와 b를 더해준다
			
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			System.out.println(a+b);
			
		}

		scanner.close();

	}

}
