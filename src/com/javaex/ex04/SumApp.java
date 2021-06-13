package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		String[] sArr=numLine.split(" ");
		int[] iArr=new int[sArr.length];
		for(int i=0;i<sArr.length;i++) {
			iArr[i]=Integer.parseInt(sArr[i]);
			sum=sum+iArr[i];
		}
		
		
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
