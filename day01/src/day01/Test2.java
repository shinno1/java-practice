package day01;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// ���α��̿� ���α��̸� �Է¹޾�, �簢���� ���̸� ���Ͻÿ�.
		// �簢���� ���� = ���� * ����
		
		Scanner sc = new Scanner(System.in);
		int width = 0;
		int height = 0;
		
		System.out.print("���� ���� = ");
		width = sc.nextInt();
		System.out.print("���� ���� = ");
		height = sc.nextInt();
		
		System.out.println("�簢���� ���� = " + (width * height));
		
		sc.close();
	}

}
