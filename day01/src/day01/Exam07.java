package day01;

public class Exam07 {

	public static void main(String[] args) {
		// �ڵ� ����ȯ
		int a = 10;
		double b = 1.1;

		b = a;

		int num1 = 50;
		long num2 = 1111111111L;
//		int aa = num1 + num2; int + long = long -> �ڷᰪ�� �� ū ������ �ڵ� ����ȯ
		long bb = num1 + num2;
		System.out.println(num1 + num2);

		int val1 = 10 / 2; // 5
		int val2 = 10 / 3; // 3
//		int val3 = 10 / 3.0; 10 / 3.0 = ����/�Ǽ� = �Ǽ��̱� ������ �Ǽ��� ������ ���� ���Ͽ� ����
		double val4 = 10 / 3.0;
		// ����� ����ȯ
		int val5 = (int) 1.1; // 1
		int val6 = (int) (10 / 3.0);
	}

}
