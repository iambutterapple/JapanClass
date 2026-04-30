package com.example;

public class Km2Mile extends Converter{

	public Km2Mile(double ratio) {
	     this.ratio = ratio;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Km2Mile  toMile = new Km2Mile(1.6);// 1마일은 1.6km
         toMile.run();

	}



	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/  ratio;
	}



	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "km";
	}



	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "mile";
	}

}
