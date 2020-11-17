package day01;

public class Exam07 {

	public static void main(String[] args) {
		// 자동 형변환
		int a = 10;
		double b = 1.1;

		b = a;

		int num1 = 50;
		long num2 = 1111111111L;
//		int aa = num1 + num2; int + long = long -> 자료값이 더 큰 값으로 자동 형변환
		long bb = num1 + num2;
		System.out.println(num1 + num2);

		int val1 = 10 / 2; // 5
		int val2 = 10 / 3; // 3
//		int val3 = 10 / 3.0; 10 / 3.0 = 정수/실수 = 실수이기 때문에 실수를 정수에 담지 못하여 오류
		double val4 = 10 / 3.0;
		// 명시적 형변환
		int val5 = (int) 1.1; // 1
		int val6 = (int) (10 / 3.0);
	}

}
