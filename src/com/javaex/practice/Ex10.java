package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	// 정수 다섯개를 입력받아 가장 큰 수를 출력하세요.
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		int[] num = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.println("숫자" + (i+1) + ": ");
			num[i] = scanner.nextInt();
		}
		
		int max = num[0];
		
		for ( int i =1; i<5; i++) {
			if (num[i] >  max) {
				max = num[i];
			}
		}
		System.out.println("최대값은" + max + "입니다.");

		scanner.close();
	}

}
