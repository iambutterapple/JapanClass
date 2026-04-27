package com.casting;
/*
 *Person 타입의 참조변수를 Student 타입의 참조로 변환하는 것을 의미함 
 * 
 * 		Person p =new Studnet("가길동")
 * 
 * 
 * 		Studnet s = (Student)p;
 * 		다운캐스팅 : student의 타입 변환을 반드시 표시해야함
 * 
 * 
 * 
 * */
public class DowncastingEx {

	
	public static void main(String[] args) {
		Person p =new Student("가길동");
		Student  s = (Student)p;
		
		System.out.println(s.name);
		s.grade = "A";
		System.out.println(s.grade);
	}
}
