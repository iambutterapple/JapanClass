package com.gameex;

import java.util.*;
//게임 참가자를 의미하는 클래스
public class Player {
	
	private Scanner sc;
	private String name;
	private String word;
	
	
	public Player(String name) {
		this.name = name;
		sc = new Scanner(System.in);
	}
	
	public String getName() {
		return name;
	}
	public String getWordFromUser(){
		System.out.print(name +":");
		word= sc.next();
		return word;
	}
	public boolean checkSuccess(String lastwords) {
		//입력받은 
		int lastIndex = lastwords.length()-1;// 마지막 문자에 대한 인덱스
		char lastChar = lastwords.charAt(lastIndex);// 마지막문자
		char firstChar = lastwords.charAt(0);//첫번째 문자

		//마지막 단어의 맨 마지막 문자와 다음 참가자가 입력한 단어의 첫 문자가 같은지를 비교
		if(lastwords.charAt(lastIndex) == word.charAt(0))
		{
			//마지막 문자와 첫문자가 같으면
			return true;
		}else
			return false;
		
	}
	
		//이름,단어,스캐너 필드 선언
		//생성자를 이용하여 초기화 시킴


	
		//사용자로부터 단어를 입력받는 메소드 정의
	
	
		//마지막단어와 참가자가 입력한 단어를 비교하여 끝말잇기가 됐는지를 
		//판정하고 맞으면 true,틀리면 false를 반환하는 메소드
}
