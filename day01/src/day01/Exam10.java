package day01;

import java.util.Scanner;

public class Exam10 {
	public static void main(String[] args) {
		// ����, ����, ���� ������ �Է¹޾Ƽ�
		// �� ������ ������, �� ������ ����, ��ձ���
		// ����ϴ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		int korScore = 0; //��������
		int mathScore = 0; //��������
		int engScore = 0; //��������
		int totalScore = 0; //����
		double avg = 0.0; //���
		
		System.out.print("���� ���� : ");
		korScore = sc.nextInt();
		System.out.print("���� ���� : ");
		mathScore = sc.nextInt();
		System.out.print("���� ���� : ");
		engScore = sc.nextInt();
		
		totalScore = korScore + mathScore + engScore;
		avg = totalScore / 3.0;
		
		System.out.println("���� ���� = " + korScore);
		System.out.println("���� ���� = " + mathScore);
		System.out.println("���� ���� = " + engScore);
		System.out.println("���� = " + totalScore);
		System.out.println("��� = " + avg);
		}

}
