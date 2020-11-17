package day02;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		//정수 하나를 입력받아 입력받은 정수가 
		//짝수면 '짝수입니다'를 출력하고,
		//홀수면 '홀수입니다'를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("'짝수입니다'");
		} else {
			System.out.println("'홀수입니다'");
		}
	
		sc.close();
	}

}
