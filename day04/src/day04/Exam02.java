package day04;

public class Exam02 {
	public static void main(String[] args) {
		//정수 3개 공간의 배열
		int[] a = new int[3]; //0 0 0으로 초기화
		//문자열 5개 공간의 배열
		String[] str = new String[5]; //null null null null null으로 초기화
		//실수 3개 공간의 배열
		double[] d = new double[3]; //0.0 0.0 0.0으로 초기화
		//문자 5개 공간의 배열 결론 -> 기본자료형은 배열로 만들 수 있다 배열도 기본자료형
		char[] c = new char[5]; //
		boolean[] b = new boolean[2]; //
		
		System.out.println("a[0] = " + a[0]);
		System.out.println("str[0] = " + str[0]);
		System.out.println("d[0] = " + d[0]);
		System.out.println("c[0] = " + c[0]);
		System.out.println("b[0] = " + b[0]);
		
		int[] arr1 = {1, 2, 3};
		double[] arr2 = {1.2, 3.5, 5.7};
		String[] arr3 = {"abc", "def", "ghi"};
		
		
	}
}
