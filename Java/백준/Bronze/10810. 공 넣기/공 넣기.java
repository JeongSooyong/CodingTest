

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		// 1번바구니부터 2번바구니까지 3번공
		// 3번바구니부터 4번바구니까지 4번공
		// 1번바구니부터 4번바구니까지 1번공
		// 2번바구니에만 2번공
		
		// n = 바구니의 개수, m = 공을 넣는 횟수
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		// 마지막에 출력될 바구니별로 남은 공의 번호
		int[] arr = new int[n];
		
		for(int x=0;x<m;x++) {
			
			// 시작하는 바구니 번호 i, 마지막 바구니 번호 j, 담을 공 번호 k
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			// i번바구니부터 j번바구니까지 공을 담아준다.
			for(int y=i-1;y<=j-1;y++) {
				arr[y] = k;
			}
			
			
		}
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
		

		

		sc.close();
		
		
	}

}
