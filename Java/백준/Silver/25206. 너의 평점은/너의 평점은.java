

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		/*
		 * 전공평점 = 전공과목별 (학점*과목평점)의 합을 학점의 총합으로 나눈값
		 * p와 f는 계산에서 제외
		 * 20줄에 걸쳐 과목명,학점,등급 입력
		 * 
		 * ex) 3.0 * A+(4.5) / 학점의 총합
		 */
		
		// 최종 점수
		double total = 0.0;
		
		// 학점의 총합
		double scoreSum = 0.0;
		
		for(int i=0;i<20;i++) {
			
			// 과목명 subject, 각 과목의 학점, 각 과목의 등급
			String subject = sc.next();
			double score = sc.nextDouble();
			String grade = sc.next();
			
			if(grade.equals("P")) {
				continue;
			}
			
			scoreSum += score;
			
			if(grade.equals("A+")) {
				total += score*4.5;
			} else if(grade.equals("A0")) {
				total += score*4.0;
			} else if(grade.equals("B+")) {
				total += score*3.5;
			} else if(grade.equals("B0")) {
				total += score*3.0;
			} else if(grade.equals("C+")) {
				total += score*2.5;
			} else if(grade.equals("C0")) {
				total += score*2.0;
			} else if(grade.equals("D+")) {
				total += score*1.5;
			} else if(grade.equals("D0")) {
				total += score*1.0;
			} else if(grade.equals("F")) {
				total += score*0.0;
			}
			
			
		}
		
		System.out.println(total/scoreSum);
		
		
		sc.close();

		
		
	}

}
