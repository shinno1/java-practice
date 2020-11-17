package day04;

import java.util.Scanner;

public class Exam13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[4]; // 0 : 국어 1 : 수학 2 : 영어 3 : 총점
		String[] subject = {"국어", "수학", "영어"};
		double avg = 0.0; // 평균
		
		//점수 입력
//		System.out.println("국어점수 : ");
//		scores[0] = sc.nextInt();
//		System.out.println("수학점수 : ");
//		scores[1] = sc.nextInt();
//		System.out.println("영어점수 : ");
//		scores[2] = sc.nextInt();
		
		for (int i = 0 ; i < subject.length ; i++) {
			System.out.print(subject[i] + " 점수 : ");
			scores[i] = sc.nextInt();
		}
		
		//총점 및 평균 계산
		for(int i = 0 ; i < subject.length ; i++) {
			scores[scores.length - 1] += scores[i];
			//scores[scores.length - 1] = scores[scores.length - 1] + scores[i];
		}
		avg = scores[scores.length - 1] / (double)subject.length;
		
		//점수 출력
		for (int i = 0 ; i < subject.length ; i++) {
			System.out.println(subject[i] + " 점수 : " + scores[i]);
		}
		System.out.println("총점 : " + scores[scores.length - 1]);
		System.out.println("평균 : " + avg);
		
			
		
	}
}
