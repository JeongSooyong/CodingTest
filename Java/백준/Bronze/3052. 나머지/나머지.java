


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		/*
		 *  두 자연수 a와 b
		 *  a%b는 a를 b로 나눈 나머지
		 *  ex) 7,14,27,38을 3으로 나눈 나머지는 1,2,0,2
		 *  수 10개를 입력받고, 이를 42로 나눈 나머지를 구하고
		 *  이 값들 중에서 서로 다른 값이 몇개 있는지 출력
		 */
		
		Set<Integer> set = new HashSet<>();
		/*
		 * HashSet은 서로 다른값만 담을 수 있고, n번째 인덱스만 따로 출력하는 것이 불가능.
		 */
		
		for(int i=0;i<10;i++) {
			
			int a = sc.nextInt()%42;
			
			set.add(a);
			// HashSet Class의 add 메서드를 이용하면 괄호안의 값을 HashSet에 담을수있다.
			
		}
		
		System.out.println(set.size());
		// HashSet은 중복된 값을 담을 수 없어서 size 메서드를 통해 set에 있는 개수를 출력하기만 하면 된다.
		
		
		
		sc.close();
		
		
	}

}
