package day01;

import java.util.Scanner;

public class Exam11 {
	public static void main(String[] args) {
		// �л��� ���������� �Է��ϰ�, �Էµ� ������ ����ϴ� ���α׷���
		// ����� ����.
		// �л��� ���������� �̸�, ����, ��, ��, �� ����, ����, �����
		// ������.
		// ��� ������ �Է¹޾�, �Է¹��� ������ �ٽ� ����ϴ� ���α׷���
		// �ϼ��ϼ���.
		// ��, �̸��� ���� �������� �Է¹޴´�.
		
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0;
		int korScore = 0;
		int engScore = 0;
		int mathScore = 0;
		int totalScore = 0;
		double avg = 0.0;
		
		System.out.print("���� : ");
		age = sc.nextInt();
		System.out.print("���� ���� : ");
		korScore = sc.nextInt();
		System.out.print("���� ���� : ");
		engScore = sc.nextInt();
		System.out.print("���� ���� : ");
		mathScore = sc.nextInt();
		sc.nextLine();
		System.out.print("�̸� : ");
		name = sc.nextLine();
		
		totalScore = korScore + engScore + mathScore;
		
		avg = totalScore / 3.0;
		
		System.out.println("���� : " + age);
		System.out.println("�������� : " + korScore);
		System.out.println("�������� : " + engScore);
		System.out.println("�������� : " + mathScore);
		System.out.println("���� : " + totalScore);
		System.out.println("��� : " + avg);
		System.out.println("�̸� : " + name);
		
		
		
		
	}
}
