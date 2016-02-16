package test;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("년도를 입력해주세요.");
		int year = scanner.nextInt();
		System.out.println("월을 입력해주세요");
		int month = scanner.nextInt();
		String result = "";
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			result ="31일";
			break;
		case 4: case 6: case 9: case 11:
			result = "30일";
			break;
		case 2:
	         if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
	        	 result = "29일";
	         }else{
	        	 result = "28일";
	         }
			break;
		default:
			System.out.println("숫자를 잘못 입력하셨습니다.");
			break;
		}
		System.out.println(year + "년 " + month + "월의 마지막 일은 " + result + " 입니다.");
	}
}
