package day02;

import java.util.Scanner;

public class Exam18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		String opr = null;

		System.out.print("첫 번째 수 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 수 : ");
		num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자 : ");
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
			System.out.println("연산자를 잘못 입력하였습니다.");
		}

	}
}
