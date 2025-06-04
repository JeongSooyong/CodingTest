


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		
		// 전체 학생수 30명 배열
		int[] arr = new int[30];
		
		// 1부터 30까지를 arr에 할당
		for(int i=0;i<30;i++) {
			
			arr[i] = i+1;
			
		}
		
		
		
		// 과제를 제출한 28명 입력
		for(int j=0;j<28;j++) {
			
			int n = sc.nextInt();
			
			
			// 제출한 사람은 0으로 바꾸어준다.
			arr[n-1] = 0;
			
		}
		
		// arr배열에서 0이 아닌 인덱스를 출력
		for(int i=0;i<30;i++) {
			
			if(arr[i]!=0) {
				System.out.println(arr[i]);
			}
			
		}
		
		
		
		
		

		

		sc.close();
		
		
	}

}
