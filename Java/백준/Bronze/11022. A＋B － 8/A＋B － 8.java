

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		

		// 테스트케이스 개수 t
		int t = Integer.parseInt(br.readLine());
		
		// 변수 t만큼 반복할 연산
		for(int i=0;i<t;i++) {
			
			// sum이라는 배열에 두개의 수를 넣고 split을 통해서 " "를 기준으로 나누어준다.
			String[] arg = br.readLine().split(" ");
			
			// sum이라는 배열의 0번째 인덱스와 1번째 인덱스를 a와 b에 담아준다.
			int a = Integer.parseInt(arg[0]);
			int b = Integer.parseInt(arg[1]);
			
			sb.append("Case #").append(i+1).append(": ").append(a).append(" + ")
			.append(b).append(" = ").append(a+b).append("\n");
			
			
			
		}
		
		System.out.print(sb);
		

	}

}
