package day04;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		// 1. ������ 5�� ������ �� �ִ� �迭�� �����ϰ�, �迭�� 2��°, 4��° ����� ����
		// ����ϼ���.
		
//		int[] arr = new int[5];
//		
//		System.out.println(arr[1]);
//		System.out.println(arr[3]);
		
		// 2. ������ 10�� ������ �� �ִ� �迭�� �����ϰ� ��� ����� ���� ����غ��ƶ�.
		
//		int[] arr = new int[10];
		
//		for (int i = 0 ; i < arr.length ; i++) {
//			System.out.println(arr[i]);
//		}
		
		// 3. ������ 10�� ������ �� �ִ� �迭�� �����ϰ� �� ��� ��ҿ� 3�� �־��.
		//	  �׸��� 3�� �� ������ ����Ͽ� Ȯ���غ��ƶ�.
		
//		int[]arr = new int[10];
//		
//		for (int i = 0 ; i < arr.length ; i++) {
//			arr[i] = 3;
//			System.out.println(arr[i]);
//		}
		
		// 4. ������ 10�� ������ �� �ִ� �迭�� �����ϰ�,
		//	  �� ��ҿ� 1 ~ 10���� ���ʴ�� �־��. �׸��� ���� �� ������ Ȯ���غ���.
//		
//		int[] arr = new int[10];
		
//		for (int i = 0 ; i < arr.length ; i++) {
//			arr[i] = i + 1;
//			System.out.println(arr[i]);
//		}
//		
		// 5. 1, 5, 7�� �ʱⰪ���� �����ϰ� �ִ� �迭�� �����,
		//	  �迭�� ��� ����� ���� ����غ��ƶ�.
//		
//		int[] arr = {1, 5, 7};
//		int sum = 0;
//		
//		for (int i = 0 ; i < arr.length ; i++) {
//			sum += arr[i]; // sum = sum + arr[i];
//		} System.out.println(sum);
		
		//6. ������ 5�� ������ �� �ִ� �迭�� �����, scanner�� ���� �Է¹��� ����
		//�ϳ��� �迭�� ��ҿ� �����غ���, ���� Ű����� 1 2 3 4 5�� �Է��ߴٸ�
		//�迭�� ��ҿ� ���� 1 2 3 4 5�� ����Ǿ�� �Ѵ�. ����� ���� ����� Ȯ���� ���ƶ�.
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		// 7. 1, 2, 3, 4, 5, 6, 7, 8�� �ʱ�ȭ�� �迭�� �����,
		// �迭�� ��� �� ¦���� ������ ���ϴ� ���α׷��� ������.
//		
//		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//		int cnt = 0;
//		
//		for (int i = 0 ; i < arr.length ; i++) {
//			if (arr[i] % 2 == 0) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
		
	}
}
