package com.exam;
/*
 * 
	Player 클래스: 게임 참가자 한 명 한 명을 나타냅니다.

	참가자의 이름을 저장합니다.
	getWordFromUser(): 사용자로부터 단어를 입력받는 기능을 수행합니다.
	checkSuccess(): 이전 단어와 현재 단어를 비교해 끝말잇기가 성공했는지 판별합니다.
 * 
 * */
import java.util.*;
public class Play {
	
	Play pl[];
	private String name;
	private String word;
	Scanner sc = new Scanner(System.in);
	
	
	public Play() {
		
	}
	// 사용자로부터 단어를 입력받는 기능을 수행합니다.
	public void getWordFromUser() {
		
	

	}
	//이전 단어와 현재 단어를 비교해 끝말잇기가 성공했는지 판별합니다.
	public void checkSuccess() {

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
