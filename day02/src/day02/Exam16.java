package day02;

import java.util.Scanner;

public class Exam16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gender = null;
		gender = sc.nextLine();
		
		switch (gender) {
		case "남":
			System.out.println("남자입니다.");
			break;
		case "여":
			System.out.println("여자입니다.");
			break;
		default:
			System.out.println("잘못입력");
		}
	}
}
