package com.javaex.ex08;

import java.util.Scanner;

public class FriendsApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Friends[] fArr=new Friends[3];
		String[] infoArr=new String[3];
		
		System.out.println("친구 3명을 등록해주세요.");
		for(int i=0;i<fArr.length;i++) {
			String acc=sc.nextLine();
			infoArr=acc.split(" ");
			Friends f=new Friends();
			f.setName(infoArr[0]);
			f.setHp(infoArr[1]);
			f.setSchool(infoArr[2]);
			fArr[i]=f;
		}
		sc.close();
		
		for (int i = 0; i < fArr.length; i++) {
        	fArr[i].showInfo();
        }
		
		
		

	}

}
