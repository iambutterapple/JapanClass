package com.polymorphism;

public class HospitalMain {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		
		//부모타입을 참조변수를 활용하여 자식객체를 생성함
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		hospital.injection(dog);
		hospital.injection(cat);
		hospital.injection(tiger);
		
	}
}
