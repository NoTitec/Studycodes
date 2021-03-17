package ch02;

import java.util.Scanner;

public class section_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("sel num");
		int m = sc.nextInt();
		ex s1 = new ex();
		switch (m) {
		case 1:
			s1.n2_7();
			break;
		case 2:
			s1.n2_8();
			break;
		case 3:
			s1.n2_10();
		}
		sc.close();
		
	}
}

class ex {
	public void n2_7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름과 학번을 입력하세요");
		String name = sc.nextLine();
		int num = sc.nextInt();
		System.out.println(name + num);
		sc.close();
	}

	public void n2_8() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.nextLine();
		double b = sc.nextDouble();
		System.out.println(i + b);
		System.err.println("oh");
		sc.close();
	}
	public void n2_10() {
		System.out.println("123456");
		System.out.printf("%1$6d %1$6o %1$6x \n",10);
		System.out.printf("%-6d\n",20);
		System.out.printf("%+6d\n",30);
		System.out.printf("%6.2f\n",3.12345);
		System.out.printf("123456\n");
		
	}
}
