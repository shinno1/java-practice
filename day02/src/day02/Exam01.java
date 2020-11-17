package day02;

public class Exam01 {

	public static void main(String[] args) {
		int num = 10;
		//num이 저장한 값을 1 증가시킨다.
		num = num + 1;
		num += 1;
		num++;
		++num;
		
		int a = 0;
		int b = 0;
		
		++a; // 단독으로 쓰일 경우 위치 상관없이 1 증가
		b++;
		System.out.println(a + " " + b); // a = 1, b = 1
		
		b = ++a; // 전위형 그냥 계산 a = 2, b = 2 
		System.out.println(a + " " + b); // a = 2, b = 2
//		a++;
//		b = a;
		
		b = a++; // 후위형 나머지 계산을 다하고 a를 1 증가시킨다
		System.out.println(a + " " + b); // a = 3, b = 2
//		b = a;
//		a++;
		
		a = b++; // a = 2, b = 3
		System.out.println(a + " " + b); // a = 2, b = 3
		
		boolean flag = true;
		System.out.println(flag + " " + !flag);
		
		
		num -= 1; // num = num - 1;
	}

}
