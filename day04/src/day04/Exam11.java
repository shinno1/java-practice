package day04;

import java.util.Arrays;

public class Exam11 {
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5};
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(); // 한줄 개행
		
		//for-each 레퍼런스 변수 클래스 등에 쓰임
		for(int e : arr) { // 1 2 3 4 5
			// int e = 1;
			// int e = 2;
			// int e = 3;
			System.out.print(e + " ");
		}
		
		System.out.println(); // 한줄 개행
		
		String[] arr1 = {"자바", "C언어", "C++", "Python"};
		
		for(String e : arr1) {
			System.out.print(e + " ");
		}
		
		int[] arr2 = {1, 5, 9, 10, 2, 7};
		
		
	}
}
