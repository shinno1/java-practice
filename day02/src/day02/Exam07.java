package day02;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		//정수 하나를 입력받아서,
		//입력받은 정수가 5의 배수이면서 3의 배수이면서 2의 배수면
		//*를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		
		if(num%2 == 0 && num%3 ==0 && num%5 ==0) {
			System.out.println("*");
		}
		
		if(num%3==0 && num%5==0 || num%2 ==0 && num%5 ==0) {
			System.out.println("*");
		} //&&(and) 연산자가 우선순위가 ||(or) 보다 높다
		  
		
		sc.close();
		
		//5의 배수이면서 3의 배수이거나,
		//5의 배수이면서 2의 배수이면 *을 출력하세요.
	}
}
