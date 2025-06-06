
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		/*
		 * 점의 개수 n
		 * 좌표평면을 그려놓고 봤을때
		 * n개의 점을 둘러싸는 최소 크기의 직사각형의 넓이
		 * 입력한 x의 최대값 - x의 최소값 
		 * 입력한 y의 최대값 - y의 최소값
		 * 두개를 곱한다.
		 * 점이 하나라면 0을 출력
		 */
		
		// 점의 개수 n 입력
		int n = sc.nextInt();
		
		// 모든 x축과 y축의 값을 담아줄 list 2개
		List<Integer> listX = new ArrayList<>();
		List<Integer> listY = new ArrayList<>();
		
		// n만큼 입력 반복
		for(int i=1;i<=n;i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			// 점의 갯수가 1개라면 0을 출력하고 반복문을 멈춘다.
			if(n==1) {
				
				System.out.println(0);
				
				return;
				
			}
			
			listX.add(x);
			listY.add(y);
			
		}
		
		System.out.println((Collections.max(listX)-Collections.min(listX))*(Collections.max(listY)-Collections.min(listY)));
		
		sc.close();

		
	}

}
