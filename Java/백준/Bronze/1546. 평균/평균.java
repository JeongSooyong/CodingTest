

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		
		/*
		 * 점수중에 최댓값 m
		 * 모든 점수를 해당 과목의 점수/m*100으로 바꾼다.
		 * ex) 수학점수가 50점이고 가장 높은 점수가 70점이면 50/70*100 = 71.43이 됨.
		 * 시험 본 과목의 개수 n
		 * 과목의 개수만큼 두번째 줄에 현재 성적
		 */
		
		// 시험 본 과목의 갯수 입력
		int n = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			
			// 각 과목의 점수 m
			int m = sc.nextInt();
			// 입력한 과목의 점수를 list에 넣어준다.
			list.add(m);
			
		}
		
		// 과목 중에 가장 높은 점수
		int max = Collections.max(list);
		
		// 총합 점수를 담아줄 변수 sum
		double sum = 0;
		
		for(int i=0;i<n;i++) {
			
			double score = (double)list.get(i)/max*100;
			
			sum += score;
			
		}
		
		double avg = sum/n;
		
		System.out.println(avg);
		
		
		
		
		
		
		sc.close();
		
		
	}

}
