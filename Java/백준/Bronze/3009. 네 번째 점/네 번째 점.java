

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		/*
		 * 세 점이 주어진다.
		 * 평행한 직사각형을 만들기 위해 필요한 네번재 점을 찾는다.
		 * 세점의 좌표입력
		 * ex)
		 * (5,5), (5,7), (7,5) -> (7,7)
		 * (30,20), (10,10), (10,20) -> (30,10)
		 * 4개의 점을 봤을때 똑같은 x값, y값이 2쌍이 나와야함.
		 */
		
		// 꼭짓점 1
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		
		// 꼭짓점 2
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		// 꼭짓점 3
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		int x4 = 0;
		int y4 = 0;
		
		// 모든 x축과 y축의 값을 담을 list
		List<Integer> listX = new ArrayList<>();
		List<Integer> listY = new ArrayList<>();
		
		// 리스트에 모든 x값과 y값을 넣는다.
		listX.add(x1);
		listX.add(x2);
		listX.add(x3);
		listY.add(y1);
		listY.add(y2);
		listY.add(y3);
		
		// 모든 x,y의 값을 반복문을 통해서 확인한후 frequency 함수를 이용해 중복값이 1일경우 그 값을 x4,y4에 할당
		for(int x : listX) {
			if(Collections.frequency(listX, x)==1) {
				x4 = x;
				break;
			}
		}
		
		for(int y : listY) {
			if(Collections.frequency(listY, y)==1) {
				y4 = y;
				break;
			}
		}
		
		System.out.println(x4 + " " + y4);
		
		
		sc.close();

		
	}

}
