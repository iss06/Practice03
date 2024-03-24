package com.javaex.practice;

public class Ex08 {
	//	아래와 같이 구구단을 출력하세요
	public static void main(String[] args) {

		int dan = 1;
		int num = 1;

		for (num = 1; num <= 9; num++) {
			for (dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "*" + num + "=" + (dan * num));
				System.out.print("\t");

			}

			System.out.println();

		}
	}
}