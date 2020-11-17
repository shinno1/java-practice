package day03;

import java.util.Scanner;

public class Exam09 {
public static void main(String[] args) {
	//국어, 수학 점수를 입력받아 각각의 점수와 총점, 평균을 출력한다.
	//단, 점수는 0 ~ 100 사이의 점수만 입력이가능하고,
	//그 외의 점수를 입력받으면 다시 입력받을 수 있도록 프로그램을 작성하세요.
	Scanner sc = new Scanner(System.in);
	int korScore = 0;
	int mathScore = 0;
	int sum = 0;
	double avg = 0.0;
	
	System.out.print("국어 점수 : ");
	korScore = sc.nextInt();
	
	while (korScore > 100) {
		System.out.print("국어 점수 : ");
		korScore = sc.nextInt();
		if(korScore >= 0 && korScore <= 100) {
			break;
		}
	}
		
		System.out.print("수학 점수 : ");
		mathScore = sc.nextInt();
		
	while (mathScore > 100) {
		System.out.print("수학 점수 : ");
		mathScore = sc.nextInt();
		if(mathScore >= 0 && mathScore <= 100) {
			break;
		}
		
	} 
	System.out.println("총점 : " + sum);
	System.out.print("평균 : " + avg);
	}
}


	
	
