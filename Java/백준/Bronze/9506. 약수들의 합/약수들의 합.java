
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		/*
		 * 숫자 n
		 * 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면 완전수
		 * ex) 6 = 1 + 2 + 3
		 * -1 입력시 종료
		 */
		
		
		
		
		
		// while문 무한루프
		while(true) {
			
			int n = sc.nextInt();
			
			// 약수들을 담아줄 list생성
			List<Integer> list = new ArrayList<>();
			
			// -1을 입력하면 종료.
			if(n==-1) {
				
				break;
				
			}
			
			// 약수의 합
			int sum = 0;
			
			// n의 약수를 구하기 위해 가장 먼저 반복문
			for(int i=1;i<n;i++) {
				
				// n을 i로 나눈값이 0이면 약수들의 list에 담아준다.
				if(n%i==0) {
					
					list.add(i);
					
					sum += i;
					
				}
				
			}
			
			// 완전수인 경우
			if(sum==n) {
				
				System.out.print(n + " = ");
				
				// list에 담았던 수를 출력한다.
				for(int j=0;j<list.size();j++) {
					
					System.out.print(list.get(j));
					
					// list의 마지막 수를 제외하고 + 출력
					if(j!=list.size()-1) {
						
						System.out.print(" + ");
						
					}
					
				}
				
				System.out.println();
				
			} else {
				
				System.out.println(n + " is NOT perfect.");
				
			}
			
		}
		
		sc.close();

		
	}

}
