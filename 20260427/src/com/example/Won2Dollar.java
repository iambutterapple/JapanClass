package com.example;

public class Won2Dollar extends Converter{
	
	public Won2Dollar(int ratio) {
          this.ratio = ratio;
	}
	
	
	 public static void main(String[] args) {
	        Won2Dollar wd = new Won2Dollar(1500);// 1달러는 1500원
	        wd.run();
	     }

	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src / ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "달러";
	}

}
