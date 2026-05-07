package com.test;
/*
 * 
 * 	하나의 학생 정보를 나타내는 Student 클래스에는 이름,학과,학번,학점 평균을 
 * 저장하는 필드가 있다.
 * 학생마다 student 객체를 생성하고 4명의 학생 정보를 ArratList<Student>
 * 컬렉션에 저장한후에, ArratList<Student>의 모든 학생 정보를 출력하고 
 * 학생 이름을 입력받아 해당 학생의 학점 평균을 출력하는 프로그램을 구현
 * 
 * 결과
 * 학생의 이름 ,학과 ,학번,학점 평균을 입력하세요.
 * 	가길동 모바일 		1 4.1
 * 	나길동 안드로이드 	2 3.9
 * 	다길동 웹학과 		3 3.5
 * 	라길동 빅데이터 		4 4.25
 * ---------------------------------------------------------------
 * 이름: 가길동
 * 학과: 모바일
 * 학번: 1
 * 학점평균: 4.1
 * ---------------------------------------------------------------
 * 학생이름 : 다길동
 * ---------------------------------------------------------------
 * 이름: 다길동
 * 학과: 웹학과
 * 학번: 3
 * 학점평균: 3.5
 * ---------------------------------------------------------------
 * 학생이름 : 그만 → 프로그램 종료
 * */
import java.util.*;
public class Exam05 {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Student> st = new ArrayList<Student>();
	
	//입력
	public void input() {
		System.out.println("학생의 이름 ,학과 ,학번,학점 평균을 입력하세요.");
		for(int i=0;i<4;i++)
		{
			System.out.print(">> ");
			String name = sc.next().trim();
			String department = sc.next().trim();
			String id = sc.next().trim();
			double grade = sc.nextDouble();
			
			Student student = new Student(name, department, id, grade);
			st.add(student);
		}

	}
	//출력
	public void print() {
		
		Iterator<Student>it = st.iterator();
		while(it.hasNext()) {
			
			Student s= it.next();
			
			System.out.println("------------------------------------------------------------");
			System.out.println("이름"+s.getName());
			System.out.println("학과"+s.getDepartment());
			System.out.println("학번"+s.getId());
			System.out.println("평점"+s.getGrade());

		}
		System.out.println("------------------------------------------------------------");
	}
	//검색
	public void search(){
		while(true)
		{
			System.out.print("학생 이름 : ");
			String name = sc.next();
			
			if(name.equals("그만"))
			{
				System.out.println("프로그램 종료");
				return;
			}
			
			for(int i = 0;i<st.size();i++)
			{
				Student s = st.get(i);
				if(s.getName().equals(name))
				{
					System.out.println("------------------------------------------------------------");
					System.out.print(s.getName() + "<<학생이름	");
					System.out.print(s.getDepartment() + "<<학과 ");
					System.out.print(s.getId() + "<<학번 ");
					System.out.println(s.getGrade());
					break;
				}else
				{
					System.out.println("이름이 없습니다.");
					break;
				}
			}
			
		}
		
		
	}
	public void run() {
		input();
		print();
		search();	
	}
		
	public static void main(String[] args) {
		new Exam05().run();
	}	
}
