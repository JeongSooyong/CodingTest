

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		/*
		 * 3개의 줄에 걸쳐 삼각형의 각의 크기.
		 * 세각의 크기가 모두 60이면 Equilateral
		 * 세각의 합이 180이고, 두 각이 같은 경우 Isosceles
		 * 세각의 합이 180이고, 같은 각이 없는 경우 Scalene
		 * 세각의 합이 180이 아닌 경우 Error
		 */
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		
		if(sum!=180) {
			System.out.println("Error");
		} else if(num1==60&&num2==60&&num3==60) {
			System.out.println("Equilateral");
		} else if(num1==num2||num1==num3||num2==num3) {
			System.out.println("Isosceles");
		} else if(num1!=num2&&num1!=num3&&num2!=num3) {
			System.out.println("Scalene");
		} 
		
		sc.close();

		
	}

}
