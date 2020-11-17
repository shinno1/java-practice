package day02;

import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {
		//0 ~ 100 사이의 정수 하나를 입력받아,
		// 그 수가 90 ~ 100점 사이면 A를 출력
		// 그 수가 80 ~ 90점 사이면 B를 출력
		// 그 수가 70 ~ 80점 사이면 C를 출력
		// 그 수가 70미만점 사이면 D를 출력
		
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String str = "";
		
		score = sc.nextInt();
		
		if(score >= 90) {
			 str = "A";
		}else if(score >= 80) {
			 str = "B";
		}else if(score >= 70) {
			 str = "C";
		}else {
			 str = "D";
		}
		System.out.println(str);
		
		sc.close();
		
		
		
		
	}
}
