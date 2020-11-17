package day02;

import java.util.Scanner;

public class Exam14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		score = sc.nextInt();
		
		
		switch (score/10) {
		case 10:
		case 9: // num ->90 ~ 99
			System.out.println("A");
			break;
		case 8: 
			System.out.println("B");
			break;
		case 7: 
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}
	}

}
