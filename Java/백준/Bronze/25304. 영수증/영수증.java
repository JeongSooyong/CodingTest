

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 영수증에 적힌 총 금액 x, 영수증에 적힌 구매한 물건 종류의 수 n
		int x = scanner.nextInt();
		int n = scanner.nextInt();

		// 입력한 x와 값이 같을지 비교하기 위해 물건의 가격과 개수로 계산할 총금액의 값을 담아줄 변수 sum
		int sum = 0;
		
		// 구매한 물건의 종류의 수 n 만큼의 반복문
		for(int i=1;i<=n;i++) {
			
			// 각 물건의 가격 a와 개수 b
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			// 각 물건의 가격 a와 개수 b를 곱하여 변수 c에 담아준다.
			int c = a*b;
			
			// 변수c를 sum에 누적시킨다.
			sum += c;
			
			
			
		}
		
		// 입력했던 x와 sum을 비교하여 일치하면 Yes, 일치하지 않으면 No를 출력
		if(x==sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		

		scanner.close();

	}

}
