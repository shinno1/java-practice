package day02;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = null;
		
		s = sc.nextLine();
		
		if(s.equals("남")) {
			System.out.println("남자입니다.");
		}else if(s.equals("여")) {
			System.out.println("여자입니다.");
		} else {
			System.out.println("다시 입력하세요.");
		}
	}

}
