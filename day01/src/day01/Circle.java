package day01;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// ���� �������� �Է¹޾� ���� �ѷ��� ���̸� ����ϼ���.
		// ���� �ѷ� = 2 * ���� * ������
		// ���� ���� = ���� * ������ * ������
		Scanner sc = new Scanner(System.in);
		final double PI = 3.14;
		int rad = 0; //������
		
		System.out.print("������ : ");
		rad = sc.nextInt();
		
		double aa = 2 * PI * rad; // ���� �ѷ�
		double bb = PI * rad * rad; // ���� ����
		
		System.out.println("���� �������� " + rad + "��");
		System.out.println("���� �ѷ���" + aa + ", ���� ���̴� " + bb + "�Դϴ�.");
		
		sc.close();
	}

}
