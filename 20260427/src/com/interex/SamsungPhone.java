package com.interex;

public class SamsungPhone extends PDA implements MobilePhone,MP3Interface {

	@Override
	public void sendCall() {
		System.out.println("Call");
	}

	@Override
	public void receiveCall() {
		System.out.println("Get");
	}
	//메소드 추가
//	public void flash() {
//		System.out.println("전화기에 불이 켜졌습니다.");
//	}
	
	@Override
	public void play() {
		System.out.println("음악 재생");
	}

	@Override
	public void stop() {
		System.out.println("음악 멈춥니다.");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자 보냅니다.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자 왔습니다.");
	}
	public void schedule() {
		System.out.println("일정 관리 합니다.");
	}
}
