package day01;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		// 이름과 나이를 입력받아, 화면에 출력
		Scanner sc = new Scanner(System.in);
		String name; // 이름을 저장할 공간
		int age; // 나이를 저장할 공간
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.println("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.println("입력하신 이름은 : " + name);
		System.out.println("입력하신 나이는 : " + age);
	}

}
