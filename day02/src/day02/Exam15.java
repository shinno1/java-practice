package day02;

import java.util.Scanner;

public class Exam15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int max = 0;
		int min = 0;
		
		System.out.print("첫번째 수 : ");
		x = sc.nextInt();
	
		System.out.print("두번째 수 : ");
		y = sc.nextInt();
		
		if (x > y) {
			max = x;
			min = y;
		} else {
			max = y;
			min = x;
		}
		System.out.println(max + " > " + min);
		
	}
}
