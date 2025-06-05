
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		/*
		 * 9*9 배열
		 * 81개의 자연수 입력
		 * 이들중 가장 큰 값과 그 위치 출력
		 */
		
		// 9*9 배열 선언
		int arr[][] = new int[9][9];
		
		// 9*9 배열만큼 숫자 입력
		for(int i=0;i<9;i++) {
			
			for(int j=0;j<9;j++) {
				
				arr[i][j] = sc.nextInt();
				
			}
			
		}
		
		int max = arr[0][0];
		int maxI = 1;
		int maxJ = 1;
		
		for(int i=0;i<9;i++) {
			
			for(int j=0;j<9;j++) {
				
				if(arr[i][j]>max) {
					
					max = arr[i][j];
					maxI = i+1;
					maxJ = j+1;
					
				}
				
			}
			
		}
		
		System.out.println(max);
		System.out.println(maxI + " " + maxJ);
		
		
		sc.close();

		
	}

}
