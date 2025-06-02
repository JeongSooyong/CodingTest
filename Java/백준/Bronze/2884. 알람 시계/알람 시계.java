

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int h = scanner.nextInt(); // 시
		int m = scanner.nextInt(); // 분

		// 입력한 분에서 -45분 해주기
		m -= 45;

		if (m < 0) { // 입력한 분에서 45를 빼고 0보다 작을 경우
			m += 60;
			h -= 1;
			if (h < 0) { // h가 자정일때 입력한 h값에서 -1을 했을때 음수가 됐을 경우
				h = 23;
			}
			
		}
		System.out.println(h + " " + m);

		scanner.close();

	}

}
