package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String cal = sc.nextLine();
			if (cal.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			}

			else {
				String[] cArr = cal.split(" ");
				int[] iArr = new int[cArr.length];
				iArr[0] = Integer.parseInt(cArr[0]);
				iArr[2] = Integer.parseInt(cArr[2]);
				if (cArr[1].equals("+")) {
					Add ad = new Add(iArr[0], iArr[2]);
					System.out.println(ad.calculate());
				} else if (cArr[1].equals("-")) {
					Sub sb = new Sub(iArr[0], iArr[2]);
					System.out.println(sb.calculate());
				} else if (cArr[1].equals("*")) {
					Mul ml = new Mul(iArr[0], iArr[2]);
					System.out.println(ml.calculate());
				} else if (cArr[1].equals("/")) {
					Div dv = new Div(iArr[0], iArr[2]);
					System.out.println(dv.calculate());
				} else {
					System.out.println("알 수 없는 연산자입니다.");
				}
			}
			//sc.close();
		}

	}
}
