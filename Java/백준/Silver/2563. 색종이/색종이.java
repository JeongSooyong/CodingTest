
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		/*
		 * 첫번째 줄에 색종이의 개수 n
		 * 색종이의 크기 10*10 배열
		 * 도화지의 크기 100*100 배열
		 * 도화지에 색종이가 덮힌 부분의 크기(배열)
		 */
		
		int n = sc.nextInt();
		
		int x = 0;
		int y = 0;
		
		int area = 0;
		
		// 도화지 크기 배열
		int arr[][] = new int[100][100];
		
		for(int i=0;i<n;i++) {
			
			x = sc.nextInt();
			y = sc.nextInt();
			
			// 도화지를 입력한 벽에서의 거리만큼 10*10으로 채운다
			for(int j=x;j<x+10;j++) {
				
				for(int k=y;k<y+10;k++) {
					
					arr[j][k] = 1;
					
				}
				
			}
			
		}
		
		
		
		
		// 도화지가 1인 곳을 확인한다.
		for(int i=0;i<100;i++) {
			
			for(int j=0;j<100;j++) {
				
				if(arr[i][j]==1) {
					
					area += 1;
					
				}
				
			}
			
		}
		
		System.out.println(area);
		
		
		
		
		
		
		sc.close();

		
	}

}
