
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		/*
		 * n개의 수를 입력한다
		 * 두번째줄에 입력하는 숫자 num
		 * 소수의 개수를 출력
		 * num의 약수가 1과 num뿐일때. (약수가 2개)
		 */
		
		
		int n = sc.nextInt();
		
		
		
		// 소수의 개수를 누적할 변수 cnt
		int cnt = 0;
		
		for(int i=0;i<n;i++) {
			
			int num = sc.nextInt();
			
			// 소수가 2개인지 확인하기 위한 변수 a
			int a = 0;
			
			// 입력한 num의 약수의 개수를 확인하기 위한 반복문 
			for(int j=1;j<=num;j++) {
				
				// num을 1부터 num까지 나누어서 0이면 a를 1더해준다. a가 2이면 소수
				if(num%j==0) {
					
					a++;
					
				}
				
			}
			
			// a가 2이면 소수의 개수 누적에 +1
			if(a==2) {
				
				cnt++;
				
			}
			
		}
		
		System.out.println(cnt);
		
		sc.close();

		
	}

}
