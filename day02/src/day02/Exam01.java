package day02;

public class Exam01 {

	public static void main(String[] args) {
		int num = 10;
		//num�� ������ ���� 1 ������Ų��.
		num = num + 1;
		num += 1;
		num++;
		++num;
		
		int a = 0;
		int b = 0;
		
		++a; // �ܵ����� ���� ��� ��ġ ������� 1 ����
		b++;
		System.out.println(a + " " + b); // a = 1, b = 1
		
		b = ++a; // ������ �׳� ��� a = 2, b = 2 
		System.out.println(a + " " + b); // a = 2, b = 2
//		a++;
//		b = a;
		
		b = a++; // ������ ������ ����� ���ϰ� a�� 1 ������Ų��
		System.out.println(a + " " + b); // a = 3, b = 2
//		b = a;
//		a++;
		
		a = b++; // a = 2, b = 3
		System.out.println(a + " " + b); // a = 2, b = 3
		
		boolean flag = true;
		System.out.println(flag + " " + !flag);
		
		
		num -= 1; // num = num - 1;
	}

}
