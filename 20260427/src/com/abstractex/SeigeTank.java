package com.abstractex;

public class SeigeTank extends Unit{

	@Override
	void move(int x, int y) {
		System.out.println("Move it x:" + x + "y :" +y);
	}

	@Override
	void stop() {
		System.out.println("Destination!");
	}

	@Override
	void message() {
		System.out.println("Message : Go , SeigeTank");
	}
	public void changeMode() {
		System.out.println("Yes sir");
	}
}
