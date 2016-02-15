package test;

import java.util.Scanner;

public class InputSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int sum = 0;
		
		int limit = (b>a) ? b : a;
		int start = (b>a) ? a: b;
		for (int i = start ; i <= limit ; i++){
		   sum += i;
		}
		System.out.println(sum);
	}
}
