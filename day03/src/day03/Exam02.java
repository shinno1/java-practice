package day03;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		//2�� ���, 5�� �Է� �޾� ���
		Scanner sc = new Scanner(System.in);
		int num = 1;
		int num2 = 0;
		num2 = sc.nextInt();
		
		while(num < 10) {
			System.out.println(num2 + " * " + num + " = " + (num2*num));
			num++;
		}
	}
}
