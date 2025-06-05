
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		/*
		 * 숫자를 입력한다. 
		 * 그 숫자에 맞는 다이아몬드형태의 별이 찍힌다.
		 * ex) 3
		 *     *		공백 n-1, n-2 ... 
		 *    ***		별 갯수 1, 3, 5 ...
		 *   *****
		 *    ***
		 *     * 
		 * 3을 입력했으면 3번째줄까지 *이 1부터 2씩 늘어나고 그뒤에는 2씩 줄어듬.
		 */
		
		int n = sc.nextInt();
		int space = 0;
		int star = 0;
		
		// 줄의 갯수
		for(int i=0;i<(2*n-1);i++) {
			
			// 공백이 입력한 수까지는 1씩 감소. 입력한 수가 넘어갔을때부터 1씩 증가
			if(i<n) { // n이 5일때 첫째줄에는 공백4개. 둘째줄에는 공백3개... 
				space = n-1-i;
			} else { // 0,1,2,3,4,5.. 이런식
				space = i-(n-1);
			}
			
			// 별의 갯수. 5를 입력했을 경우 i=0에서 1, i=1에서 3, i=2에서 5...
			// star(1) = i(0),n(5)  .  star(3) = i(1),n(5) 
			if(i<n) {
				star = 2*i+1; // i가 0일때 1, i가 1일때 3...
			} else { // i가 5일때(6번째줄부터) 
				// i가 5일때 star은 7, i가 6일때 star은 5, i가 7일때 star은 3
				star = 2*(2*n-1-i)-1;
			}
			
			// 공백을 space만큼 찍는다.
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			// 별을 star만큼 찍는다.
			for(int k=0;k<star;k++) {
				System.out.print("*");
			}
			
			// 개행
			System.out.println();
		}
		
		
		
		sc.close();

		
		
	}

}
