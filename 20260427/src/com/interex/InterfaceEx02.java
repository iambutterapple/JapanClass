package com.interex;
/*
 * 추상클래스와 인터페이스 비교
 * 
 * abstract class class명{
 * 	
 * 	모든 멤버 변수들;
 * 모든 멤버 메소드들;
 * 
 * }
 * 		-단일 상속만 가능함
 * 	
 * interface interface명 {
 * 
 * 	(public static final ) int x=10;//상수만 가능
 * (public abstract) void disp();//추상메소드만 가능
 * 
 * }
 * 		- 다중 상속이 가능함
 * 
 * 
 * */
public class InterfaceEx02 implements Inter3 {

	int a = 100;
	
	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public int getB() {
		// TODO Auto-generated method stub
		return a+10;
	}

	@Override
	public int getDate() {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args) {
		InterfaceEx02 it1 = new InterfaceEx02();
		
		Inter1 it11 = it1;
		Inter2 it12 = it1;
		Inter3 it13 = it1;
		
		System.out.println(it11.getA());
		System.out.println(it12.getB());
		System.out.println(it13.getDate());
	}
}
