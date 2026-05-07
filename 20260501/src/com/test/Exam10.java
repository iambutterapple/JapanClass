package com.test;
/*
 * 
 * 문]
 * 		나라와 수도 맞추기 게임
 * 		1. 나라 이름 ( countrty ) 과 수도 ( capital )로 구성된 Nation 클래스를 작성하고
 * 			Vector<Notion> 컬렉션을 이용하여 프로그램을 구성
 * 		2. HashMap<String,String> 을 이용하여 작성하라.
 * 			키는 나라이름, 값은 수도
 * 
 *		출력
 *			수도 맞추기 게임을 시작
 *			입력 : 1, 퀴즈 : 2, 종료:3 >> 1
 *			현재 9개 나라와 수도가 입력 되어 있습니다.
 *			나라와 수도 입력 10 >> 한국 서울 
 *			나라와 수도 입력 11 >> 그리스  아테네
 *			그리스는 이미 있습니다.
 *			나라와 수도 입력 11 >> 호주 시드니
 *			나라와 수도 입력 12 >> 이탈리아 로마
 *			나라와 수도 입력 12 >> 그만
 *			입력 종료
 *			입력 : 1, 퀴즈 : 2, 종료:3 >> 2
 *			호주의 수도는 : 시드니
 *			정답
 *			독일의 수도는 : 하얼빈
 *			아닙니다.
 *			멕시코의 수도는 : 멕시코시티
 *			정답
 *			이탈리아의 수도는 : 로마
 *			정답
 *			영국의 수도는 : 그만
 *			입력 : 1, 퀴즈 : 2, 종료:3 >> 3
 *			게임을 종료합니다.
 *		
 * 			멕시코 멕시코시티
 * 			스페인 리스본
 * 			프랑스 파리
 * 			영국 런던
 * 			그리스 아테네
 * 			독일 베를린
 * 			일본 도쿄
 * 			중국 베이징
 * 
 * 
 * 
 * 
 * */
import java.util.*;
public class Exam10 {
	
	private Vector<Nation> v = new Vector<Nation>();
	private Scanner sc = new Scanner(System.in);
	
	public Exam10() {
		
		v.add(new Nation("멕시코", "멕시코시티"));
		v.add(new Nation("스페인", "리스본"));
		v.add(new Nation("프랑스", "파리"));
		v.add(new Nation("영국", "런던"));
		v.add(new Nation("그리스", "아테네"));
		v.add(new Nation("독일", "베를린"));
		v.add(new Nation("일본", "도쿄"));
	}
	
	public void erro(String msg) {
		System.out.println(msg);
	}
	public void run() {
		System.out.println("수도 맞추기 게임을 시작합니다.");
		while(true) {
			System.out.print("입력 : 1, 퀴즈 : 2, 종료:3 >>");
			int num = sc.nextInt();
			
			switch (num) {
			case 1:
				input();
				break;
			case 2:
				quiz();
				break;
			case 3:
				finish();
				return;
			default:
				erro("잘못된 입력");
				break;
			}
			
		}
	}
	public boolean contains(String country) {
		
		for(int i=0;i<v.size();i++)
		{
			if(v.get(i).getCountry().equals(country))
			{
				//사용자가 입력한 나라가 이미 있다면 
				return true;
			}
		}
		return false;
		
	}
	public void input() {
		int n = v.size();
		System.out.println("현재 " + n + "개의 나라와 수도가 입력되어있습니다.");
		while(true) {
			System.out.print("나라와 수도를 입력:" + n +">>");
			String country = sc.next();//나라
			
			if(country.equals("그만"))
				break;
			
			String capital = sc.next();//수도
			
			if(contains(country))
			{
				System.out.println(country + "이미 있습니다.");
				continue;
			}
			v.add(new Nation(country, capital));
			n++;
			
		}
		
	}
	public void quiz() {
		//모든 키를 알아야합니다.
		while(true) {
			//나라 중 하나를 선택
			int index = (int)(Math.random() * v.size());
			
			//문제와 정답을 결정
			Nation nation = v.get(index);
			String question = nation.getCountry();
			String answer = nation.getCapital();
			//문제 출력
			System.out.print(question + " 의 수도는 ? ");
			//사용자가 수도입력(정답입력)
			String capital = sc.next();
			
			if(capital.equals("그만"))//quiz 종료
				break;
			
			if(capital.equals(answer))
				System.out.println("정답");
			else
				System.out.println("정답이 아닙니다.");
		}
	}
	public void finish() {
		System.out.println("게임을 종료합니다.");
//		System.exit(0);
	}
	public static void main(String[] args) {
		new Exam10().run();
	}
}
