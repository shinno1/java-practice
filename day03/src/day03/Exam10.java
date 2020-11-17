package day03;

import java.util.Scanner;

public class Exam10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int korScore = 0;
		int mathScore = 0;
		int totalScore = 0;
		double avg = 0.0;
		
		while(true) {
			System.out.print("국어 점수 : ");
			korScore = sc.nextInt();
		
			if(korScore >= 0 && korScore <= 100) {
				break;
			}
			System.out.println("점수는 0 ~ 100점이어야 합니다.");
		}
		while(true) {
			System.out.print("수학 점수 : ");
			mathScore = sc.nextInt();
			
			if(mathScore >= 0 && mathScore <= 100) {
				break;
			}
			System.out.println("점수는 0 ~ 100점이어야 합니다.");
		}
	
			totalScore = korScore + mathScore;
			avg = totalScore / 2.0;
			
			System.out.println("국어 점수 : " + korScore);
			System.out.println("수학 점수 : " + mathScore);
			System.out.println("총점 : " + totalScore);
			System.out.println("평균 : " + avg);
	}
		
}
