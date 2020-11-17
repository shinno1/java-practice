package day04;

public class Exam01 {
	public static void main(String[] args) {
		int score5;
		score5 = 0;
		
		int num = 0;
		
		//정수를 여러개 담을 수 있는 변수
		int[] score; //배열의 선언
		score = new int[5]; //배열에 5개의 정수를 담을 공간을 생성
		
		int[] score2 = new int[10]; //
		
		System.out.println(num);
		System.out.println(score2); //score2배열의 주소를 출력함
		System.out.println(score2[0]); //score2배열의 0번째 요소를 출력함
		
		score2[0] = 10;
		System.out.println(score2[0]);
		
		//배열의 초기화 방법
		int[] arr1 = new int[3]; // 0 0 0
		//int[] arr2 = new int[] {1, 2, 3}; //1 2 3
		int[] arr2;
		arr2 = new int[] {1, 2, 3};
		
 		//int[] arr3 = {1, 2, 3}; //1 2 3 ->선언과 생성을 분리해서 할 수 없다.
		int[] arr3;
//		arr3 = {1, 2, 3}; 오류!!
		
		
		
		
	}
}
