package day03;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		//1���� 100���� ���
//		for(int i = 1 ; i <= 100 ; i++) {
//			System.out.println(i);
		
		//2�� ���
//		for(int i = 1 ; i <= 9 ; i++) {
//			System.out.println("2 * " + i + " = " + (2 * i));
//		}
		
		// 2 4 6 8 10 ���
//		for(int i = 1 ; i <= 5 ; i++) {
//			System.out.println(i*2);
//		}
//		for(int i = 2 ; i <= 10 ; i += 2) {
//			System.out.println(i);
		
		//10 ~ 0���� ���
//		for(int i = 10 ; i >= 0 ; i--) {
//			System.out.println(i);
//		}
		
		//1 ~ 10������ ���� ��� 55
//		int sum = 0;
//		for(int i = 1 ; i <= 10; i++) {
//			sum += i;
//		}	System.out.println(sum);
//		
		//1���� 1������ �� : 1
		//1���� 2������ �� : 3
		//1���� 3������ �� : 6
		//1���� 4������ �� : 10
		//       ...
		//1���� 10������ �� : 55
//		int sum = 0;
//		for(int i = 1 ; i <= 10 ; i++) {
//			sum += i;
//			System.out.println("1���� " + i + "������ �� : " + sum);
//		}
		
		//1 ~ 100�� �� �߿��� 3�� ����� ������ ���
//		int cnt = 0;
//		for(int i = 1 ; i < 101 ; i++) {
//			if(i % 3 == 0) {
//				cnt++;
//			}
//		} System.out.println(cnt);
		
		//1 ~ 100�� �� �߿��� 3�� ������� ���
//		for(int i = 1 ; i < 101 ; i++) {
//			if(i % 3 == 0) {
//				System.out.println(i);
//			}
//		} 
		//1 ~ 100�� �� �߿��� 3�� ������ ������ ���
//		int cnt = 0;
//		for(int i = 1 ; i < 101 ; i++) {
//			if(i % 3 == 0) {
//				System.out.println(i);
//				cnt++;
//			}
//		} System.out.println("3�� ����� ���� : " + cnt);
		
		//������ �ϳ� �Է¹ް�, 0 ~ �Է¹��� ������ ��,
		//¦���� ������ ���ϼ���.
		//��, 0�� ¦���� �ƴϴ�.
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int num = 0;
		num = sc.nextInt();
		for (int i = 1 ; i <= num ; i++) {
			if (i % 2 == 0) {
				cnt++;
			}
		} System.out.println("¦���� ���� : " + cnt);
	}
}
