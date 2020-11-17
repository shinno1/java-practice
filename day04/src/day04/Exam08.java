package day04;

public class Exam08 {
	public static void main(String[] args) {
//		System.out.println(Math.random()); //     0.0 <= Math.random() < 1.0
//		
//		0 <= x < 10
//		int rand = (int)(Math.random() * 10); // 0 ~ 9 까지의 정수를 랜덤
//		System.out.println(rand);
		
		//1 ~ 45까지의 랜덤 수
		int[] lotto = new int[6];
		
		for (int i = 0 ; i < lotto.length ; i++) {
			int rand = (int)(Math.random() * 45 + 1); // 1 ~ 45까지의 난수
			lotto[i] = rand;
			
//			lotto[i] = (int)(Math.random() * 45 + 1);
		} 
		
		for(int i = 0 ; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
