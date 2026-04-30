package com.example;

public class Point3D extends Point{

	private int z;
	
	
	 public int getZ() {
		return z;
	}

	 public Point3D(int x, int y, int z) {
         super(x, y);
         this.z = z;
	}

    
    public void move(int x, int y, int z) {
    	// TODO Auto-generated method stub
    	super.move(x, y);
    	this.z = z;
    }
    
    
    public void moveUP() {
    	z++;
    }

    public void moveDown() {
    	z--;
    }

    @Override
    public String toString() {
    	// TODO Auto-generated method stub
        String str="("+getX()+", "+getY()+", "+getZ()+") 점";
    	return str;
    }



	public static void main(String[] args) {
	        Point3D p = new Point3D(1,2,3);
	        System.out.println(p.toString()+"입니다");

	         p.moveUP(); // z 축으로 위쪽 이동  -> 1,2,4
	         System.out.println(p.toString()+"입니다");

	         p.moveDown(); // z 축으로 아래쪽 이동
	         p.move(10,10);  //10,10, 3
	         System.out.println(p.toString()+"입니다");
	         
	         p.move(100,200,300); // 100,200,300
	        System.out.println(p.toString()+"입니다");
	     }

}
