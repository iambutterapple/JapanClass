package com.abstractex;

public class AbsEx extends AbsEx02{

	public static void main(String[] args) {
		AbsEx ae = new AbsEx();
		System.out.println("ae.getA() : "+ ae.getA());
		System.out.println("ae.getA() : "+ ae.getStr());
		
	}

	@Override
	public String getStr() {
		//AbsEx02의 추상 메소드 재정의 한것
		return str;
		//AbsEx01 클래스의 멤버변수
	}

}
