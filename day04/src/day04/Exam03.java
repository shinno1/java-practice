package day04;

public class Exam03 {
	public static void main(String[] args) {
		int[] arr1 = new int[100]; // 0 ~ 99
//		System.out.println(array1[0]);
//		System.out.println(array1[1]);
//		System.out.println(array1[2]);
		
		for (int i = 0 ; i < arr1.length ; i++) {
			System.out.println(arr1[i]);
		}
		
		for (int i = 0 ; i < arr1.length ; i++) {
			arr1[i] = 10;
			System.out.println(arr1[i]);
		}
		
		System.out.println(arr1.length); // �迭�� ����=ũ�� ��°� 100 (�迭�̸�.length)
		
		
	}
}
