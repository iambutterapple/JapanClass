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
public class Exam07 {

	Scanner sc = new Scanner(System.in);
	HashMap<String, Student_score> st = new HashMap<String, Student_score>();
	
	//입력
	void input() {
		System.out.println("글로벌장학금관리 시스템입니다.");
		for(int i=0;i<6;i++)
		{
			System.out.print("이름과 학점 :");
			String name = sc.next();
			double hak = sc.nextDouble();
			
			Student_score ss = new Student_score(name, hak);
			st.put(name, ss);
			
		}
	}

	//장학생선발
	void sunbar() {
		System.out.print("장학생 선발 기준 : ");
		double gijun = sc.nextDouble();

		
		
//		 for (Student_score s : st.values()) { 
//		        // 여기서 s는 null이 아니므로 getScore()를 안전하게 호출할 수 있습니다.
//		        if (s.getScore() >= gijun) {
//		            System.out.print(s.getName() + " ");
//		        }
//		  }
		
		for(Student_score s: st.values())
		{
			if(s.getScore() >= gijun)
			{
				System.out.print(s.getName() + " ");
			}
		}

	}
	//운영
	void run() {
		input();
		sunbar();
	}
	
	public static void main(String[] args) {
		new Exam07().run();
	}
}
