package com.polymorphism;

public class PolyArgumentEx03 {

	
		public static void main(String[] args) {
			Buyer b =new Buyer();
			Tv tv = new Tv();
			Computer com = new Computer();
			Audio audio  =new Audio();
			
			b.buy(tv);
			b.buy(audio);
			b.buy(com);
			b.summary();
			System.out.println();
			b.refund(tv);
			b.summary();
		}
}
