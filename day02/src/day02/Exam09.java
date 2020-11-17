package day02;

public class Exam09 {
	public static void main(String[] args) {
		int num = 5;
		int result = 0;
		
		if(num > 3) {
			result = 10;
		}else {
			result = 20;
		}
		
		result = (num > 3) ? 10 : 20;
		// 조건식이 참이면 두번째 항 대입, 조건식이 거짓이면 세번째 항이 대입됨.
		
	}
}
