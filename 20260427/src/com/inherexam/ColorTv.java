package com.inherexam;

public class ColorTv extends Tv{
	
	private int color;
	


	public ColorTv(int size,int color) {
		super(size);
		this.color = color;
	}

	public void printProperty() {
		System.out.println(getSize() + "인치 " + color + "색");
	}
	
	public static void main(String[] args) {
//		ColorTv myTv=new ColorTv(32,1024);
//		myTv.printProperty();
	}

}
