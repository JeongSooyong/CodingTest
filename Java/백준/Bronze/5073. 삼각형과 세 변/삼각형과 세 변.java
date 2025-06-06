
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		/*
		 * 3개의 줄에 걸쳐 삼각형의 각의 크기.
		 * 세 변의 길이가 모두 같으면 Equilateral
		 * 두 변의 길이만 같으면 Isosceles
		 * 세 변의 길이가 모두 다르면 Scalene
		 * 가장 긴 변의 길이 >= 나머지 두변의 길이의 합 <= 이경우 Invalid
		 */
		
		// 무한 루프
		while(true) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			// a,b,c가 0이면 멈춘다.
			if(a==0&&b==0&&c==0) {
				
				break;
				
			}
			
			int longest = Math.max(a, Math.max(b, c));
			int others = a + b + c - longest;
			
			if(longest>=others) {
				System.out.println("Invalid");
			} else if(a==b&&b==c&&a==c) {
				System.out.println("Equilateral");
			} else if(a==b||a==c||b==c) {
				System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}
			

		}
		
		sc.close();

		
	}

}
