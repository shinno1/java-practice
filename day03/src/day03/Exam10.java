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
			System.out.print("���� ���� : ");
			korScore = sc.nextInt();
		
			if(korScore >= 0 && korScore <= 100) {
				break;
			}
			System.out.println("������ 0 ~ 100���̾�� �մϴ�.");
		}
		while(true) {
			System.out.print("���� ���� : ");
			mathScore = sc.nextInt();
			
			if(mathScore >= 0 && mathScore <= 100) {
				break;
			}
			System.out.println("������ 0 ~ 100���̾�� �մϴ�.");
		}
	
			totalScore = korScore + mathScore;
			avg = totalScore / 2.0;
			
			System.out.println("���� ���� : " + korScore);
			System.out.println("���� ���� : " + mathScore);
			System.out.println("���� : " + totalScore);
			System.out.println("��� : " + avg);
	}
		
}
