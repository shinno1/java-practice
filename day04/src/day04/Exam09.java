package day04;

public class Exam09 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 100, 8, 2};
		
		for(int i = 0 ; i < array.length ; i++) {
			//max�� ���� �迭�� ��Ұ��� ũ�⸦ ���ؼ�
			//�迭 ����� ���� ũ��
			//max���� �迭 ����� ������ �����Ѵ�.
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.println("max : " + max);
		
	}
}
