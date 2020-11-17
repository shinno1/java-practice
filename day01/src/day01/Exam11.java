package day01;

import java.util.Scanner;

public class Exam11 {
	public static void main(String[] args) {
		// 학생의 개인정보를 입력하고, 입력된 정보를 출력하는 프로그램을
		// 만들어 보자.
		// 학생의 개인정보는 이름, 나이, 국, 영, 수 점수, 총점, 평균을
		// 가진다.
		// 모든 정보를 입력받아, 입력받은 정보를 다시 출력하는 프로그램을
		// 완성하세요.
		// 단, 이름은 가장 마지막에 입력받는다.
		
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0;
		int korScore = 0;
		int engScore = 0;
		int mathScore = 0;
		int totalScore = 0;
		double avg = 0.0;
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("국어 점수 : ");
		korScore = sc.nextInt();
		System.out.print("영어 점수 : ");
		engScore = sc.nextInt();
		System.out.print("수학 점수 : ");
		mathScore = sc.nextInt();
		sc.nextLine();
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		totalScore = korScore + engScore + mathScore;
		
		avg = totalScore / 3.0;
		
		System.out.println("나이 : " + age);
		System.out.println("국어점수 : " + korScore);
		System.out.println("영어점수 : " + engScore);
		System.out.println("수학점수 : " + mathScore);
		System.out.println("총점 : " + totalScore);
		System.out.println("평균 : " + avg);
		System.out.println("이름 : " + name);
		
		
		
		
	}
}
