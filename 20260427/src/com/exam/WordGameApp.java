package com.exam;
/*
 * 
 * 
 * run()메소드
 * 
 * 
 * 
 * */
import java.util.*;
public class WordGameApp {

	Scanner sc = new Scanner(System.in);
	private int inwon;
	
	public void run() {

		System.out.println("끝말잇기 게임을 시작합니다.");
		System.out.print("게임 참가자 인원수 :");
		this.inwon = sc.nextInt();
		Play pl[] = new Play[this.inwon];
		
		for(int i=0;i<this.inwon;i++)
		{
			System.out.print("참가자 이름 :");
			pl[i] = new Play();
			pl[i].setName(sc.next());
		}

	}
	
	
	
	
	
	public static void main(String[] args) {
		WordGameApp wp = new WordGameApp();
		wp.run();
		
	}
}
