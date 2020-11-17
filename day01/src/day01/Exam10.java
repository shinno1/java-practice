package day01;

import java.util.Scanner;

public class Exam10 {
	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력받아서
		// 세 과목의 점수와, 세 과목의 총점, 평균까지
		// 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		int korScore = 0; //국어점수
		int mathScore = 0; //수학점수
		int engScore = 0; //영어점수
		int totalScore = 0; //총점
		double avg = 0.0; //평균
		
		System.out.print("국어 점수 : ");
		korScore = sc.nextInt();
		System.out.print("수학 점수 : ");
		mathScore = sc.nextInt();
		System.out.print("영어 점수 : ");
		engScore = sc.nextInt();
		
		totalScore = korScore + mathScore + engScore;
		avg = totalScore / 3.0;
		
		System.out.println("국어 점수 = " + korScore);
		System.out.println("수학 점수 = " + mathScore);
		System.out.println("영어 점수 = " + engScore);
		System.out.println("총점 = " + totalScore);
		System.out.println("평균 = " + avg);
		}

}
