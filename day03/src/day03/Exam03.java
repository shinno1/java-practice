package day03;

public class Exam03 {
	public static void main(String[] args) {
		int num = 0; //0
		
		while(num < 5) { //1
			System.out.println("*"); //2
			num++; //3
		}
		
		for(int num1 = 0 ; num1 < 5 ; num1++) { //for문 내에서 선언된 변수는 for문 안에서만 적용가능.
			System.out.println("*");
		}
		
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println(i);
		}
	}
}
