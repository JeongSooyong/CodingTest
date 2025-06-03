

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 가장 먼저 입력받는 정수의 개수 n과 숫자를 입력한 횟수만큼 값을 담아줄 배열 arr
		int n = Integer.parseInt(br.readLine());

		

		// 숫자 n을 입력한 후에 띄어쓰기마다 숫자를 쪼개는 코드
		String[] arg = br.readLine().split(" ");
		
		// 일치하는 숫자를 찾기위해 마지막에 입력하는 값 v
		int v = Integer.parseInt(br.readLine());

		// 일치하는 숫자의 횟수를 담는 변수 count
		int count = 0;

		// arg[0]부터 숫자를 확인하는 반복문. 일치하면 count가 ++된다.
		for (int i=0;i<n;i++) {
			if (Integer.parseInt(arg[i]) == v) {
				count++;
			}
		}
		System.out.println(count);

	}

}
