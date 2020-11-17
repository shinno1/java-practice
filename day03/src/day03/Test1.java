package day03;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//1 ~ 100까지 중 3의 배수의 총합
//		int sum = 0;
//		for (int i = 1 ; i < 101 ; i++) {
//			if(i % 3 == 0) {
//				sum += i;
//			} 
//		} System.out.println(sum);
		
		//두 수를 입력받아 두 수 사이의 모든 숫자들의 합 출력
//		int num1 = 0;
//		int num2 = 0;
//		int sum = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫 번째 수 : ");
//		num1 = sc.nextInt();
//		System.out.print("두 번째 수 : ");
//		num2 = sc.nextInt();
//		
//		for (int i = num1 + 1 ; i < num2 ; i++) {
//			sum += i;
//		} System.out.println(sum);
//		
		//int num1 = sc.nextInt();  1, 5 -> 1~5까지의 합
		//int num2 = sc.nextInt();  5, 1 -> 1~5까지의 합
		//int min = 0; //입력받은 수 중 큰 수를 저장하기 위한 변수
		//int max = 0; //입력받은 수 중 작은 수를 저장하기 위한 변수
		//int sum = 0; //두 수 사이의 합을 저장하기 위한 변수
		
		//입력받은 수에서 큰 수와 작은 수를 결정짓는 로직
//		if (num1 > num2) {
//			max = num1;
//			min = num2;
//		} else {
//			max = num2;
//			min = num1;
//		}
//		
//		for(int i = min ; i < max ; i++) {
//			sum += i;
//		} System.out.println(sum);
		
		//두 수와 배수 n을 입력받아, 두 수 사이의 n배수의 합 출력
		//단, 입력은 작은 수부터 받는 것으로 간주한다.
//		int num1 = 0;
//		int num2 = 0;
//		int n = 0;
//		int sum = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫 번째 수 : ");
//		num1 = sc.nextInt();
//		System.out.print("두 번째 수 : ");
//		num2 = sc.nextInt();
//		System.out.print("배수 : ");
//		n = sc.nextInt();
//		
//		for (int i = num1 ; i <= num2 ; i++) {
//			if (i % n == 0) {
//				sum += i;
//			}
//		}	System.out.println("배수의 합 : " + sum);
		
		
		//1 ~ 100 사이의 모든 소수를 출력하세요.
		//소수는 1과 자기 자신으로만 나누어 떨어지는 수이다. ex) 2, 3, 5, 7 ...
//		for (int i = 1 ; i < 101 ; i++) {
		
		//while문을 사용하여 0 ~ 10까지의 합을 구하여라.
//		int sum = 0;
//		int i = 0;
//		while (i < 11) {
//			sum += i;
//			i++;
//		} System.out.println(sum);
	}
}
