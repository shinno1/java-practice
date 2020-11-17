package day02;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		//369 게임을 간단히 작성해보자. 1~99까지의 정수를 키보드로부터 입력받고 정수에 3, 6, 9 중
		//하나가 있는 경우는 "박수짝"을 출력하고 두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라.
		//예를 들면, 키보드로 입력된 수가 13인 경우 "박수짝"을, 36인 경우 "박수짝짝"을 출력하면 된다.
		System.out.println("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int first = 0;
		int second = 0;
		num = sc.nextInt();
		
		first = num / 10;
		second = num % 10;
		
		if(first == 3 || first == 6 || first == 9) {
		}
		
		if(first == 3) {
			
		}
		

	}
	
}
	
		
		

