

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		// 정수 n개
		int n = Integer.parseInt(br.readLine());
		
		// 입력받은 정수들을 담을 배열 arr
		String[] arr = br.readLine().split(" ");
		
		
		// 최대값과 최소값
		int max = Integer.parseInt(arr[0]);
		int min = Integer.parseInt(arr[0]);
		
		
		// 배열 arr의 인덱스를 처음부터 끝까지 변수 num에 담아 max,min값과 비교하여 계속해서 값을 갱신해준다.
		for(int i=0;i<n;i++) {
			
			int num = Integer.parseInt(arr[i]);
			
			if(num>max) {
				max = num;
			}
			if(num<min) {
				min = num;
			}
			
		}
		
		sb.append(min).append(" ").append(max);
		
		System.out.println(sb);
		
		
		
		
		
		

	}

}
