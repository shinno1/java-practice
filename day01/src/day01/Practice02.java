package day01;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		// 상수
		final int MAX_SPEED = 300;
		int maxSpeed = 400;
		System.out.println(MAX_SPEED);
		System.out.println(maxSpeed);

		// 스위칭 로직 a = 10, b = 20 -> a = 20, b = 10으로 만드시오.
		int a = 10;
		int b = 20;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		int c;
		c = b;
		b = a;
		a = c;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		//입력 스캐너 이름, 주소, 나이를 입력하시오.
		Scanner sc = new Scanner(System.in);
		String name = "";
		String address = "";
		int age = 0;
		String appearance = "";
		
		System.out.print("이름 = "); // 문자열에서 이어지는 문자열은 sc.nextLine();을 안잡아줘도
		name = sc.nextLine();		 // 이어지고 숫자에서 문자열로 넘어갈 때는 sc.nextLine();을 입력.
		System.out.print("주소 = ");
		address = sc.nextLine();
		System.out.print("나이 = ");
		age = sc.nextInt();
		System.out.print("특징 = ");
		sc.nextLine();
		appearance = sc.nextLine();
		System.out.println("이름 = " + name);
		System.out.println("주소 = " + address);
		System.out.println("나이 = " + age);
		System.out.println("특징 = " + appearance);
		
		//이스케이프 시퀀스
		System.out.println("\"안녕하세요\"");
		System.out.println("\'감사합니다\'");
		System.out.println("반가워요\t반가워요");
		System.out.println("고맙습니다\n고맙습니다");
		
		//boolean
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(3 < 5);
		System.out.println(3 > 5);
		
		// 자동 형변환
		int num1 = 10;
		double num2 = 3.3;
		double num3 = num1 + num2;
		
		// 명시적 형변환
		int num4 = 20;
		double num5 = 3.3;
		int num6 = (int)(num4 + num5);
		System.out.println(num6);
		
		//
		int num = 20 / 3;
		System.out.println(num);
		double num01 = 20 / 3.0;
		System.out.println(num01);
		
		}

}
