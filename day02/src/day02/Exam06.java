package day02;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		//���� �ϳ��� �Է¹޾� �Է¹��� ������ 
		//¦���� '¦���Դϴ�'�� ����ϰ�,
		//Ȧ���� 'Ȧ���Դϴ�'�� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("'¦���Դϴ�'");
		} else {
			System.out.println("'Ȧ���Դϴ�'");
		}
	
		sc.close();
	}

}
