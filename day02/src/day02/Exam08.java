package day02;

import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {
		//0 ~ 100 ������ ���� �ϳ��� �Է¹޾�,
		// �� ���� 90 ~ 100�� ���̸� A�� ���
		// �� ���� 80 ~ 90�� ���̸� B�� ���
		// �� ���� 70 ~ 80�� ���̸� C�� ���
		// �� ���� 70�̸��� ���̸� D�� ���
		
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String str = "";
		
		score = sc.nextInt();
		
		if(score >= 90) {
			 str = "A";
		}else if(score >= 80) {
			 str = "B";
		}else if(score >= 70) {
			 str = "C";
		}else {
			 str = "D";
		}
		System.out.println(str);
		
		sc.close();
		
		
		
		
	}
}
