package day01;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		// ���
		final int MAX_SPEED = 300;
		int maxSpeed = 400;
		System.out.println(MAX_SPEED);
		System.out.println(maxSpeed);

		// ����Ī ���� a = 10, b = 20 -> a = 20, b = 10���� ����ÿ�.
		int a = 10;
		int b = 20;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		int c;
		c = b;
		b = a;
		a = c;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		//�Է� ��ĳ�� �̸�, �ּ�, ���̸� �Է��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		String name = "";
		String address = "";
		int age = 0;
		String appearance = "";
		
		System.out.print("�̸� = "); // ���ڿ����� �̾����� ���ڿ��� sc.nextLine();�� ������൵
		name = sc.nextLine();		 // �̾����� ���ڿ��� ���ڿ��� �Ѿ ���� sc.nextLine();�� �Է�.
		System.out.print("�ּ� = ");
		address = sc.nextLine();
		System.out.print("���� = ");
		age = sc.nextInt();
		System.out.print("Ư¡ = ");
		sc.nextLine();
		appearance = sc.nextLine();
		System.out.println("�̸� = " + name);
		System.out.println("�ּ� = " + address);
		System.out.println("���� = " + age);
		System.out.println("Ư¡ = " + appearance);
		
		//�̽������� ������
		System.out.println("\"�ȳ��ϼ���\"");
		System.out.println("\'�����մϴ�\'");
		System.out.println("�ݰ�����\t�ݰ�����");
		System.out.println("�����ϴ�\n�����ϴ�");
		
		//boolean
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(3 < 5);
		System.out.println(3 > 5);
		
		// �ڵ� ����ȯ
		int num1 = 10;
		double num2 = 3.3;
		double num3 = num1 + num2;
		
		// ����� ����ȯ
		int num4 = 20;
		double num5 = 3.3;
		int num6 = (int)(num4 + num5);
		System.out.println(num6);
		
		//
		int num = 20 / 3;
		System.out.println(num);
		double num01 = 20 / 3.0;
		System.out.println(num01);
		
		}

}
