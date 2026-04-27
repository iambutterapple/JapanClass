package com.polymorphism;
/*
 * 
 * 다형성
 * 		-한 타입의 참조변수로 여러 타입의 객체를 참조하는 것을 의미
 * 		-부모 클래스 타입의 참조변수로 자식 클래스의 인스턴스를 참조할 수 있다.
 * 
 * 
 * 		class Super{
 * 			int a;
 * 			public void test(){
 * 			}
 * 		}
 * 
 * 		기존의 선언 및 생성
 * 		Super super = new Super();
 * 		Sub sub = new Sub();
 * 
 * 		다형성 선언 및 생성
 * 		Super s = new Sub();
 * 
 * 
 * 		class Sub extends super{
 * 		
 * 			int b;
 * 			public void test2(){
 * 			
 * 			}
 * 		}
 * 
 * 
 * */
public class SunEx extends ParentEx{

	int foo =7;
	
	public int getNumber(int a) {
		return a+2;
	}
	
	public static void main(String[] args) {
		/*
		 * 다형성에서 메소드는 자식것을 호출하고,
		 * 멤버필드는 부모것을 사용한다.
		 * */
		
		ParentEx pe = new SunEx();
		System.out.println(pe.foo);//5
		System.out.println(pe.getNumber(0));//2
	}
}
