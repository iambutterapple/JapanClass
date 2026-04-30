package com.example;

public class ColorPoint extends Point{

	private String color;
	
	public ColorPoint() {
	          super(0, 0);
	          this.color ="BLACK";
	}
	
	public ColorPoint(int x, int y) {
        super(x, y);
    }
	
	public void setXY(int x, int y) {
		move(x, y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
	       String str =color+"색의 ("+getX()+", "+getY()+") 점";
	       return str;
	}
	public static void main(String[] args) {
		 
		ColorPoint zeroPoint = new ColorPoint();// (0, 0) 위치의 BLACK 색 점
        System.out.println(zeroPoint.toString()+"입니다");

       ColorPoint cp = new ColorPoint(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str+"입니다");


	}

}
