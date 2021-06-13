package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		/*
		equals 는 오브젝트에 있는 메소드이므로 쓸수 있다.
		p1/p2 의 값은 같으나 주소값이 다르므로 같다거나 동등하지않다.
		p1,p4는 동일한 주소를 가리키고 있으므로 같다.
		false
		false
		false
		true
		false
		true
  	    */
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
	}

}


