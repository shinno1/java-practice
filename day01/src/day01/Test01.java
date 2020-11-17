package day01;

public class Test01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		// 값 스위칭 전 출력
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// 값 스위칭 로직
		int c;
		c = b;
		b = a;
		a = c;
		
		//값 스위칭 후 출력
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	
		
		
				
		
	}
}
