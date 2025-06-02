

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 주사위 1,2,3의 값
		int dice1 = scanner.nextInt();
		int dice2 = scanner.nextInt();
		int dice3 = scanner.nextInt();
		int reward = 0;

		// 가장 먼저 주사위1,2,3의 값이 전부 같을 경우
		if(dice1==dice2&&dice1==dice3) {
			reward = 10000 + (dice1*1000);
		} else if (dice1==dice2 || dice1==dice3) { // 주사위 1과2가 같거나 1과3이 같을 경우
			reward = 1000 + (dice1*100);
		} else if (dice2==dice3) { // 주사위 2와 3이 같을경우
			reward = 1000 + (dice2*100);
		} else { // 수가 모두 다를경우
			reward = Math.max(dice1, Math.max(dice2, dice3)) * 100;
		}
		
		System.out.println(reward);
		

		scanner.close();

	}

}
