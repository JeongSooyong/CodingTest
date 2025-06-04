

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		
		/*
		 * 바구니의 개수 n, 바꿀 횟수 m
		 * 가장 왼쪽바구니를 1번째 바구니, 그다음을 2번째 바구니...
		 */
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		List<Integer> list = new ArrayList<>();
		/*
		 * List의 특징
		 * 기존에 배열과 다르게 ArrayList안에 값이 추가되면 계속해서 그에 맞게 크기가 늘어남.
		 * 인덱스로 접근 가능
		 * 메서드로 정렬, 원하는 인덱스에 값 추가, 삭제, 변경 가능
		 */
		
		
		// ArrayList의 각 인덱스에 순차적으로 x+1값을 넣어서 1~n까지의 값을 넣어준다.
		for(int x=0;x<n;x++) {
			
			list.add(x+1);
			
		}
		
		// m회만큼 바구니의 값을 바꾸어준다.
		for(int y=0;y<m;y++) {
			
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			Collections.reverse(list.subList(i-1, j));
			
		}
		
		for(int num : list) {
			System.out.print(num + " ");
		}
		
		
		sc.close();
		
		
	}

}
