package day02;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		// ���� �ϳ��� �Է¹޾� �Է¹��� ���� 10���� ũ��
		// *�� ����ϰ�, 10���� ������ !�� ����ϰ�, 10�� ������ @�� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		x = sc.nextInt();
		
		if(x > 10) {
			System.out.println("*");
		}else if(x < 10) {
			System.out.println("!");
		}else {
			System.out.println("@");
		}
		
		sc.close();
		
	}

}
