package day04;

public class Exam10 {
	public static void main(String[] args) {
		int min = 1000;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int i = 0 ; i < array.length ; i++) {
			
			if(array[i] < min) {
			min = array[i];
		}
		
	}
		System.out.println("Min : " + min);
	}
}
