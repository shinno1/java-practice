package day03;

import java.util.Scanner;

public class Exam09 {
public static void main(String[] args) {
	//����, ���� ������ �Է¹޾� ������ ������ ����, ����� ����Ѵ�.
	//��, ������ 0 ~ 100 ������ ������ �Է��̰����ϰ�,
	//�� ���� ������ �Է¹����� �ٽ� �Է¹��� �� �ֵ��� ���α׷��� �ۼ��ϼ���.
	Scanner sc = new Scanner(System.in);
	int korScore = 0;
	int mathScore = 0;
	int sum = 0;
	double avg = 0.0;
	
	System.out.print("���� ���� : ");
	korScore = sc.nextInt();
	
	while (korScore > 100) {
		System.out.print("���� ���� : ");
		korScore = sc.nextInt();
		if(korScore >= 0 && korScore <= 100) {
			break;
		}
	}
		
		System.out.print("���� ���� : ");
		mathScore = sc.nextInt();
		
	while (mathScore > 100) {
		System.out.print("���� ���� : ");
		mathScore = sc.nextInt();
		if(mathScore >= 0 && mathScore <= 100) {
			break;
		}
		
	} 
	System.out.println("���� : " + sum);
	System.out.print("��� : " + avg);
	}
}


	
	
