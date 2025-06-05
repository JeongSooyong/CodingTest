
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		/*
		 * B진법 수 n
		 * 이 수를 10진법으로 바꿔 출력
		 * 10진법을 넘어가는 진법은 숫자로 표시 할 수 없음.
		 * 이경우 알파벳을 사용 
		 * A: 10, B: 11, C: 12....
		 */
		
		
		String n = sc.next();
		int b = sc.nextInt();
		
		// parseInt 메서드를 사용하면 n을 b진법으로 바꾸어준다.
		int num = Integer.parseInt(n, b);
		
		System.out.println(num);
		
		
		
		
		
		
		sc.close();

		
	}

}
