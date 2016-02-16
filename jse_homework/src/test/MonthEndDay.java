package test;

import java.util.Scanner;

public class MonthEndDay {
	/*
	 * 월을 입력하면 해당 월의 끝날이 몇일인지 출력하는 프로그램
	 * 1 을 입력하면 31일 이 출력되야함
	 * 단, 2월 29일로 통일
	 * 주의점 : 입력값이 1~12를 넘어서면 잘못 입력된 값입니다를 뿌려줌
	 * switch로 처리
	 * */
	public static void main(String[] args) {
		System.out.println("년도와 월을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31일 입니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일 입니다.");
			break;
		case 2:
			System.out.println("29일 입니다.");
			break;
		default:
			System.out.println("숫자를 잘못 입력하셨습니다.");
			break;
		}
		
		
	}
}
