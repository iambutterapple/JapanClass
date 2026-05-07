package com.test;

/*
 * 이름과 학점을 5개 입력받아 맴에 저장하고, 장학생 선발 기준을 입력받아
 * 장학생 명단을 출력하는 프로그램을 구현하시오..
 * 장학생 선발 기준은 학점이 3.2이상인 학생
 * 
 * 결과
 * 글로벌장학금관리 시스템입니다.
 * 
 * 이름과 학점 : 가길동 3.1
 * 이름과 학점 : 나길동 2.4
 * 이름과 학점 : 다길동 4.3
 * 이름과 학점 : 라길동 3.3
 * 이름과 학점 : 마길동 2.3
 * 장학생 선발 기준 학점 :3.2
 * 장학생 명단 : 라길동,다길동
 * 
 * 
 * */
import java.util.*;
public class Exam7_result {

	String title;
	Scanner sc = new Scanner(System.in);
	HashMap<String, Double> st = new HashMap<String, Double>();
	
	
	public Exam7_result() {
	}
	//입력
	public void input() {
		for(int i=0;i<5;i++)
		{
			System.out.print("이름과 학점 >>");
			String name = sc.next();
			double score = sc.nextDouble();
			
			st.put(name, score);
		}
	}
	public void print() {
		System.out.print("장학생 선발 학점 기준 : ");
		double baseline = sc.nextDouble();
		
		System.out.print("장학생 명단 : ");
		Set<String> kname = st.keySet();
		Iterator<String> it = kname.iterator();
		while(it.hasNext())
		{
			String name = it.next();
			double score = st.get(name);
			
			if(score > baseline)
			{
				System.out.print(name + " ");
			}
		}
	}
	public void run() {
		input();
		print();
	}
	
	public static void main(String[] args) {
		new Exam7_result().run();
	}
}
