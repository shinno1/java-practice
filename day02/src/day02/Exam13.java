package day02;

import java.util.Scanner;

//�ֹε�Ϲ�ȣ 7��° �ڸ��� �Է¹޴´�.
//�ֹε�Ϲ�ȣ 7��° �ڸ� ���ڰ� 1, 3�̸� ����
//2, 4�̸� �����̴�.
//�Է¹��� �ֹε�Ϲ�ȣ 7��° �ڸ��� ���� ����
//1, 3�� �Է¹����� '����'��� ����ϰ�, 2, 4�̸� '����'��� ����Ѵ�
//���� 1~4�� ���ڰ� �ƴ� �ٸ� ���ڸ� �Է¹޾Ҵٸ�
//'�߸� �Է��߽��ϴ�'��� ����� �ؾ� �Ѵ�.
public class Exam13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt(); // -> int num = sc.nextInt();
		
		switch(num) {
		case 1: 
		case 3:
			System.out.println("����");
			break;
		case 2:
		case 4:
			System.out.println("����");
			break;
		default:
			System.out.println("�߸� �Է��߽��ϴ�.");
		}
	}
}
