package day01;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 가로길이와 세로길이를 입력받아, 사각형의 넓이를 구하시오.
		// 사각형의 넓이 = 가로 * 세로
		
		Scanner sc = new Scanner(System.in);
		int width = 0;
		int height = 0;
		
		System.out.print("가로 길이 = ");
		width = sc.nextInt();
		System.out.print("세로 길이 = ");
		height = sc.nextInt();
		
		System.out.println("사각형의 넓이 = " + (width * height));
		
		sc.close();
	}

}
