package day04;

public class Exam06 {
	public static void main(String[] args) {
//		int[] arr = {5, 4, 3, 2, 1}; // 5 4 3 2 1
//		int[] newArr = new int[5]; // 0 0 0 0 0
//		
//		for (int i = 0; i < newArr.length; i++) {
//			newArr[i] = arr[i];
//		}
//	
//		for (int i = 0; i < newArr.length; i++) {
//			System.out.print(newArr[i]+ " ");
//		}
		
		int[] arr = {5, 4, 3, 2, 1}; // 5 4 3 2 1
		int[] newArr = arr;				// 자료형이 같기 때문에 대입시킬 수 있다.
		
		newArr[0] = 0;
		System.out.println(arr[0]);
		System.out.println(newArr[0]);
		
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
//		
//		for (int i = 0; i < newArr.length; i++) {
//			System.out.println(newArr[i]);
//		}
//		
//		int a = 10;
//		int b = a;
//		
//		b = 5;
//		
//		System.out.println(a);
//		System.out.println(b);
		
	}
}
