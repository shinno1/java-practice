package day03;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		//1부터 100까지 출력
//		for(int i = 1 ; i <= 100 ; i++) {
//			System.out.println(i);
		
		//2단 출력
//		for(int i = 1 ; i <= 9 ; i++) {
//			System.out.println("2 * " + i + " = " + (2 * i));
//		}
		
		// 2 4 6 8 10 출력
//		for(int i = 1 ; i <= 5 ; i++) {
//			System.out.println(i*2);
//		}
//		for(int i = 2 ; i <= 10 ; i += 2) {
//			System.out.println(i);
		
		//10 ~ 0까지 출력
//		for(int i = 10 ; i >= 0 ; i--) {
//			System.out.println(i);
//		}
		
		//1 ~ 10까지의 합을 출력 55
//		int sum = 0;
//		for(int i = 1 ; i <= 10; i++) {
//			sum += i;
//		}	System.out.println(sum);
//		
		//1부터 1까지의 합 : 1
		//1부터 2까지의 합 : 3
		//1부터 3까지의 합 : 6
		//1부터 4까지의 합 : 10
		//       ...
		//1부터 10까지의 합 : 55
//		int sum = 0;
//		for(int i = 1 ; i <= 10 ; i++) {
//			sum += i;
//			System.out.println("1부터 " + i + "까지의 합 : " + sum);
//		}
		
		//1 ~ 100의 수 중에서 3의 배수의 갯수를 출력
//		int cnt = 0;
//		for(int i = 1 ; i < 101 ; i++) {
//			if(i % 3 == 0) {
//				cnt++;
//			}
//		} System.out.println(cnt);
		
		//1 ~ 100의 수 중에서 3의 배수들을 출력
//		for(int i = 1 ; i < 101 ; i++) {
//			if(i % 3 == 0) {
//				System.out.println(i);
//			}
//		} 
		//1 ~ 100의 수 중에서 3의 배수들과 갯수를 출력
//		int cnt = 0;
//		for(int i = 1 ; i < 101 ; i++) {
//			if(i % 3 == 0) {
//				System.out.println(i);
//				cnt++;
//			}
//		} System.out.println("3의 배수의 갯수 : " + cnt);
		
		//정수를 하나 입력받고, 0 ~ 입력받은 수까지 중,
		//짝수의 갯수를 구하세요.
		//단, 0은 짝수가 아니다.
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int num = 0;
		num = sc.nextInt();
		for (int i = 1 ; i <= num ; i++) {
			if (i % 2 == 0) {
				cnt++;
			}
		} System.out.println("짝수의 갯수 : " + cnt);
	}
}
