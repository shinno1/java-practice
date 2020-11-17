package day02;

import java.util.Scanner;

public class Exam12 {
	public static void main(String[] args) {
		//1 ~ 3 사이의 정수를 입력받고, 입력받은 숫자를 출력하되,
		//switch문을 사용하여 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			
		}
		
		
		
	}
}
