

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		// while문 안의 코드를 반복
		while(true) {
			
			String[] arg = br.readLine().split(" ");
			
			int a = Integer.parseInt(arg[0]);
			int b = Integer.parseInt(arg[1]);
			
			// 만약에 a와 b가 0이면 반복문을 멈춘다.
			if(a==0&&b==0) {
				break;
			}
			
			// while문안에 입력한 a+b의 값을 계속 출력하도록 한다.
			System.out.println(a+b);
			
		}
		
		
	}

}
