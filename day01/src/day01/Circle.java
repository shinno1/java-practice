package day01;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// 원의 반지름을 입력받아 원의 둘레와 넓이를 출력하세요.
		// 원의 둘레 = 2 * 파이 * 반지름
		// 원의 넓이 = 파이 * 반지름 * 반지름
		Scanner sc = new Scanner(System.in);
		final double PI = 3.14;
		int rad = 0; //반지름
		
		System.out.print("반지름 : ");
		rad = sc.nextInt();
		
		double aa = 2 * PI * rad; // 원의 둘레
		double bb = PI * rad * rad; // 원의 넓이
		
		System.out.println("원의 반지름이 " + rad + "인");
		System.out.println("원의 둘레는" + aa + ", 원의 넓이는 " + bb + "입니다.");
		
		sc.close();
	}

}
