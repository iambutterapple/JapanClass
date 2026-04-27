package com.inherex;

public class DeckMain {

	public static void main(String[] args) {

		DECK d = new DECK();
		Card c = d.pick(0);
		System.out.println(c);
		
		d.shufle();
		c = d.pick(0);
		System.out.println(c);
		
	}
}
