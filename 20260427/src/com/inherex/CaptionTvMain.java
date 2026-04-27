package com.inherex;

public class CaptionTvMain {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.chaennel = 10;//부모클래스의 멤버필드
		ctv.channelUp();//부모클래스의 멤버 메소드
		System.out.println(ctv.chaennel);
		ctv.displayCaption("사랑합니다.");//자식의 멤버메소드
		ctv.caption = true;//자식의 멤버필드
		ctv.displayCaption("ㅎㅎ");
	}
}
