package com.inherex;

public class ClassB extends ClassA{

	public ClassB() {//오류 발생 : B() 기본 생성자에 대한  A() 기본 생성자가 없기 때문에 오류가 발생함
							//생성자와 생성자는 짝을 이루는데 부모생성자의 기본생성자가 없는 경우에는 
							//자식 생성자에서 오류가 발생한다. 이를 해결하기 위해서는 부모 클래스의 기본 생성자를 생성해 주어야한다.
		System.out.println("생성자 B");
	}
	public ClassB(int x) {
		//부모 클래스 생성자를 명시적으로 선택
		//super()는 부모클래스 생성자를 호출하는 메소드임
		super(x);
		System.out.println("여기는 생성자 B" + x);
	}
}
