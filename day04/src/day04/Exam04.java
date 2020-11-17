package day04;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		// 1. 정수를 5개 저장할 수 있는 배열을 생성하고, 배열의 2번째, 4번째 요소의 값을
		// 출력하세요.
		
//		int[] arr = new int[5];
//		
//		System.out.println(arr[1]);
//		System.out.println(arr[3]);
		
		// 2. 정수를 10개 저장할 수 있는 배열을 생성하고 모든 요소의 값을 출력해보아라.
		
//		int[] arr = new int[10];
		
//		for (int i = 0 ; i < arr.length ; i++) {
//			System.out.println(arr[i]);
//		}
		
		// 3. 정수를 10개 저장할 수 있는 배열을 생성하고 그 모든 요소에 3을 넣어라.
		//	  그리고 3이 잘 들어갓는지 출력하여 확인해보아라.
		
//		int[]arr = new int[10];
//		
//		for (int i = 0 ; i < arr.length ; i++) {
//			arr[i] = 3;
//			System.out.println(arr[i]);
//		}
		
		// 4. 정수를 10개 저장할 수 있는 배열을 생성하고,
		//	  각 요소에 1 ~ 10까지 차례대로 넣어보라. 그리고 값이 잘 들어갔는지 확인해보라.
//		
//		int[] arr = new int[10];
		
//		for (int i = 0 ; i < arr.length ; i++) {
//			arr[i] = i + 1;
//			System.out.println(arr[i]);
//		}
//		
		// 5. 1, 5, 7을 초기값으로 저장하고 있는 배열을 만들고,
		//	  배열의 모든 요소의 합을 출력해보아라.
//		
//		int[] arr = {1, 5, 7};
//		int sum = 0;
//		
//		for (int i = 0 ; i < arr.length ; i++) {
//			sum += arr[i]; // sum = sum + arr[i];
//		} System.out.println(sum);
		
		//6. 정수를 5개 저장할 수 있는 배열을 만들고, scanner를 통해 입력받은 갑을
		//하나씩 배열의 요소에 저장해보자, 만약 키보드로 1 2 3 4 5를 입력했다면
		//배열의 요소에 각각 1 2 3 4 5가 저장되어야 한다. 출력을 통해 결과를 확인해 보아라.
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		// 7. 1, 2, 3, 4, 5, 6, 7, 8로 초기화된 배열을 만들고,
		// 배열의 요소 중 짝수의 개수를 구하는 프로그램을 만들어라.
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
