package com.gameex;
import java.util.*;
public class WordGameApp {

	//필드 선언
	//스캐너,참가자,객체배열,처음단어 초기화 필드
	
	//생성자 구현(스캐너 초기화)
	
	//게임 참가자 수를 입력받고 객체 배열을 생성하는 메소드
	
	//객체 배열을 생성하였으며
	//생성된 객체배열로 참가자 만큼
	private Scanner sc;
	private Player[]p;
	private String startWords="아버지";
	public void run() {
		
	}
	public void Player() {
		System.out.print("게임 참가자 인원 :");
	}
	
	public static void main(String[] args) {
		new WordGameApp().run();
	}

}
