package day04;

public class Exam09 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 100, 8, 2};
		
		for(int i = 0 ; i < array.length ; i++) {
			//max의 값과 배열의 요소값의 크기를 비교해서
			//배열 요소의 값이 크면
			//max값을 배열 요소의 값으로 변경한다.
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.println("max : " + max);
		
	}
}
