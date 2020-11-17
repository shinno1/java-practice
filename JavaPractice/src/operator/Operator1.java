package operator;

public class Operator1 {
	public static void main(String[] args) {
		//연산자(연산을 수행하는 기호)와 피연산자(연산자의 작업 대상)
		int x = 0; //변수 선언
		int y = 0;
		
		y = 4 * x + 3; //4, x, 3 -> 피연산자 *, + -> 연산자
		System.out.println(y);
		
		/*
		 * 피연산자의 개수에 의한 분류
		 * ex) -3 - 5 -> -3에서의 -는 부호 연산자, - 5의 -는 뺄셈 연산자
		 * 	   따라서 피연산자는 -3과 5이므로 -3 - 5는 이항 연산자이다.
		 */
	}
}
