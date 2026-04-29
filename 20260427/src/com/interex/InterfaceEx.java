package com.interex;

public class InterfaceEx implements InterEx {

	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return ns;
	}
	
	public static void main(String[] args) {
		InterfaceEx ie = new InterfaceEx();
		System.out.println(ie.getA());
	}
}
