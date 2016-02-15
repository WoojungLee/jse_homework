package test;

import java.util.Scanner;

public class InputGugudan {
	/*
	 * 단수를 입력받아서 구구단을 출력함
	 * 예를 들어 2를 입력하면 2*1 = 2 ~ 2*9 - 18
	 * 단, 입력값이 0 또는 음수는 불허
	 * for loop으로 처리*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("===구구단=== \n 숫자를 입력하세요.");
		int gugu = scanner.nextInt();
		if(gugu<0 || gugu==0){
			System.out.println("숫자를 잘못 입력하셨습니다.");
		}else{
			for(int i = 1;  i <10; i++ ){
				System.out.println(gugu + "*" + i + "=" + gugu*i);
			}
		}
	}
}
