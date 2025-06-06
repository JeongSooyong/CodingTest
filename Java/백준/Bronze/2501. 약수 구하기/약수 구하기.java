
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		/*
		 * 자연수 p와 q가 있을때 p를 q로 나누었을때 나머지가 0이면 q는 p의 약수.
		 * 두 개의 자연수 n과 k
		 * n의 약수들중에서 k번째로 작은 수 출력
		 */
		
		// 자연수 n과 k 입력
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		// 약수를 확인할 변수 num
		int num = 0;
		
		
		// 입력한 수 n의 약수를 구하기 위해 가장 먼저 반복문
		for(int i=1;i<=n;i++) {
			
			// n을 1부터 n까지 나누어서 나머지가 0이면 n의 약수가 된다.
			if(n%i==0) {
				
				// n을 i로 나눈 값이 0이면 num이 1씩 증가.
				num ++;
				
				// 약수가 누적된 num과 k가 같으면 반복문의 i번째수를 출력
				if(num==k) {
					
					System.out.println(i);
					return;
					
				}
				
			}
			
			
		}
		
		// 약수가 k개보다 적을 경우 0출력
		System.out.println(0);
		
		sc.close();

		
	}

}
