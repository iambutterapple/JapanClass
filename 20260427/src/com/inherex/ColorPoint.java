package com.inherex;

public class ColorPoint extends Point2{

	
	private String color;

	public void setColor(String color) {
		this.color = color;
	}
	

	//컬라 점의 좌표
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
