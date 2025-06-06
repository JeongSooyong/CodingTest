
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		/*
		 * 자연수 m과 n
		 * m이상 n이하의 자연수
		 * 이 사이의 수에서 소수의 총합과 소수들중에서 최소값.
		 * ex) m=60, n=100 이면 이 사이들의 소수들의 총 합과 소수들에서 최소값
		 */
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		// 소수들의 총합을 구하기 위한 변수 sum
		int sum = 0;
		
		// 소수들을 담을 list생성
		List<Integer> list = new ArrayList<>();
	
		// m부터 n까지의 숫자를 회전시킬 반복문
		for(int i=m;i<=n;i++) {
			
			// m부터 n까지 모든 수의 약수를 누적할 변수 a
			int a = 0;
			
			// 숫자 i의 약수를 확인할 반복문
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
					
					a++;
					
				}
				
			}
			
			// 약수가 2개이면 list에 숫자i를 넣는다.
			if(a==2) {
				
				list.add(i);
				
			}
			
		}
		
		// 반복문을 통해 리스트에 담긴 수들을 sum에 누적한다.
		for(int i=0;i<list.size();i++) {
			
			sum += list.get(i);
			
		}
		
		// list가 비어있다면 -1출력
		if(list.isEmpty()) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(Collections.min(list));
		}
		
		
		
		
		
		sc.close();

		
	}

}
