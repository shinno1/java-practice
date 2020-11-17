package day03;

import java.util.Scanner;

public class Exam11 {
	public static void main(String[] args) {
//		int num = 1;
//		
//		while(num < 11) {
//			System.out.println(num);
//			num = num + 1;
//		}
//		
//		for(int i = 1 ; i < 11 ; i++) {
//			System.out.println(i);
//		}
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
//		
//		while(true) {
//			System.out.print("점수 입력 : ");
//			num = sc.nextInt();
//			
//			if(num >= 0 && num <= 100) {
//				break;
//			}
		
		do {
			System.out.print("점수 입력 : ");
			num = sc.nextInt();
		}while(num < 0 || num > 100);
		
		}
		
		
		
	}
