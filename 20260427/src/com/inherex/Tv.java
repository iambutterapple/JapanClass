package com.inherex;

public class Tv {
	//부모클래스
	
	
	//멤버 필드
	boolean power;//전원상태
	int chaennel;//채널

	void power() {
		power = !power;
	}
	void channelUp() {
		chaennel++;
	}
	void channelDown() {
		chaennel--;
	}
	
	
}
