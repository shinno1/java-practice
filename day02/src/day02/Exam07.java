package day02;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		//���� �ϳ��� �Է¹޾Ƽ�,
		//�Է¹��� ������ 5�� ����̸鼭 3�� ����̸鼭 2�� �����
		//*�� ����ϼ���
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		
		if(num%2 == 0 && num%3 ==0 && num%5 ==0) {
			System.out.println("*");
		}
		
		if(num%3==0 && num%5==0 || num%2 ==0 && num%5 ==0) {
			System.out.println("*");
		} //&&(and) �����ڰ� �켱������ ||(or) ���� ����
		  
		
		sc.close();
		
		//5�� ����̸鼭 3�� ����̰ų�,
		//5�� ����̸鼭 2�� ����̸� *�� ����ϼ���.
	}
}
