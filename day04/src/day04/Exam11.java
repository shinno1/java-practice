package day04;

import java.util.Arrays;

public class Exam11 {
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5};
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(); // ���� ����
		
		//for-each ���۷��� ���� Ŭ���� � ����
		for(int e : arr) { // 1 2 3 4 5
			// int e = 1;
			// int e = 2;
			// int e = 3;
			System.out.print(e + " ");
		}
		
		System.out.println(); // ���� ����
		
		String[] arr1 = {"�ڹ�", "C���", "C++", "Python"};
		
		for(String e : arr1) {
			System.out.print(e + " ");
		}
		
		int[] arr2 = {1, 5, 9, 10, 2, 7};
		
		
	}
}
