

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 입력값 n, 1부터 n까지의 합 sum
		int n = scanner.nextInt();
		int sum = 0;
		
		// 1부터 n까지의 합을 계산하는 코드
		for(int i=0;i<=n;i++) {
			sum += i;
		}
		System.out.println(sum);

		scanner.close();

	}

}
