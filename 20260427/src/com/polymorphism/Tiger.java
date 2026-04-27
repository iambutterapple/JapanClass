package com.polymorphism;

public class Tiger extends Animal{

	private String name;
	
	public Tiger() {
		name = getClass().getSimpleName();
		System.out.println(name);
	} 
	@Override
	public String scream() {
		return "어흥";
	}
	@Override
	public String getName() {
		return name;
	}
}
