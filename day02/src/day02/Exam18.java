package day02;

import java.util.Scanner;

public class Exam18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		String opr = null;

		System.out.print("ù ��° �� : ");
		num1 = sc.nextInt();
		System.out.print("�� ��° �� : ");
		num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("������ : ");
		opr = sc.nextLine();
		
		int plu = num1 + num2;
		int min = num1 - num2;
		int mul = num1 * num2;
		double div = num1 / (double)num2;
		
		if (opr.equals("+")) {
			System.out.print(num1 + " + " + num2 + " = ");
			System.out.println(plu);
		}else if(opr.equals("-")) {
			System.out.print(num1 + " - " + num2 + " = ");
			System.out.println(min);
		}else if(opr.equals("*")) {
			System.out.print(num1 + " * " + num2 + " = ");
			System.out.println(mul);
		}else if(opr.equals("/")) {
			System.out.print(num1 + " / " + num2 + " = ");
			System.out.println(div);
		} else {
			System.out.println("�����ڸ� �߸� �Է��Ͽ����ϴ�.");
		}

	}
}
