package day02;

import java.util.Scanner;

public class Exam17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		int x = 0;
		int y = 0;
		int z = 0;
		
		System.out.print("첫번째 수 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		num2 = sc.nextInt();
		System.out.print("세 번째 수 : ");
		num3 = sc.nextInt();
		
		if(num1 > num2 && num2 > num3){
			}else if(num1 > num3 && num3 > num2) {
				x = num1;
				y = num2;
				z = num3;
			}else if(num2 > num3 && num3 > num1) {
				x = num2;
				y = num3;
				z = num1;
			}else if(num2 > num1 && num1 > num3) {
				x = num2;
				y = num1;
				z = num3;
			}else if(num3 > num2 && num2 > num1) {
				x = num3;
				y = num2;
				z = num1;
			}else if(num3 > num1 && num1 > num2) {
				x = num3;
				y = num1;
				z = num2;
			} System.out.println(x + " > " + y + " > " + z);
		} 
		
		
	}

