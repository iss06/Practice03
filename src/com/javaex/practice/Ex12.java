package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
//	팩토리얼은 다음과 같이 정의된다. 숫자를 1개 입력 받아 팩토리얼 값을 출력하세요.
//	5 입력시 1*2*3*4*5 의 값이 출력됩니다.
//	7 입력시 1*2*3*4*5*6*7 의 값이 출력됩니다.
//	팩토리얼 공식 n! = 1 × 2 × 3 × ⋯ × n
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		int num = scanner.nextInt();

		if (num < 0) {
			return;
		}
		
		long fac = 1;
		
		for (int i = 2; i <=num; i++) {
			fac *= i;
		}
		
		System.out.println("결과값: " + fac);
	}
}
