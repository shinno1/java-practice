package day04;

import java.util.Scanner;

public class Exam13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[4]; // 0 : ���� 1 : ���� 2 : ���� 3 : ����
		String[] subject = {"����", "����", "����"};
		double avg = 0.0; // ���
		
		//���� �Է�
//		System.out.println("�������� : ");
//		scores[0] = sc.nextInt();
//		System.out.println("�������� : ");
//		scores[1] = sc.nextInt();
//		System.out.println("�������� : ");
//		scores[2] = sc.nextInt();
		
		for (int i = 0 ; i < subject.length ; i++) {
			System.out.print(subject[i] + " ���� : ");
			scores[i] = sc.nextInt();
		}
		
		//���� �� ��� ���
		for(int i = 0 ; i < subject.length ; i++) {
			scores[scores.length - 1] += scores[i];
			//scores[scores.length - 1] = scores[scores.length - 1] + scores[i];
		}
		avg = scores[scores.length - 1] / (double)subject.length;
		
		//���� ���
		for (int i = 0 ; i < subject.length ; i++) {
			System.out.println(subject[i] + " ���� : " + scores[i]);
		}
		System.out.println("���� : " + scores[scores.length - 1]);
		System.out.println("��� : " + avg);
		
			
		
	}
}
