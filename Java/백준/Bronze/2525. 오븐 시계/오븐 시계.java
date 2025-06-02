

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 시는 h, 분은 m, 요리시간은 cookingTime으로 했다.
		// 추가적으로 분 + 요리시간을 따로 변수로 설정하면 코드가 더 깔끔해질것같아서 이렇게했다.
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		int cookingTime = scanner.nextInt();
		int a = m+cookingTime;
		
		// 입력한 분 + 요리시간이 60분이 이상일때는 출력되는 값이 그냥 m + cookingTime으로 나오게한다.
		if(a<60) {
			m+=cookingTime;
		} else if(a>=60) { // 입력한 분 + 요리시간이 60이상이면 60으로 나누었을때의 나머지 값이 나오게한다.
							// 출력되는 h는 분 + 요리시간을 나누었을때의 값과 h를 더해준다.
			m = a%60;
			h = (a/60)+h; 
			
			// 별개로 h의 출력값이 24이상이면 h%24로 나오게한다.
			// ex) 입력한 h의 값이 23이고 m이 50, cookingTime이 30이라고 가정한다면 출력값은 24 20이 나오게 된다. 
			// 이 경우를 위해서 h를 h%24;로 설정했다.
			if(h>=24) {
				h = h%24;
			}
		}
		System.out.println(h + " " + m);
		

		scanner.close();

	}

}
