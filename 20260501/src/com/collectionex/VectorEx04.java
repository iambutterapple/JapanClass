package com.collectionex;
import java.util.*;
class myData{
	public String name;
	public int age;
	
	public myData() {
		name = "";
		age=0;
	}
	public myData(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
}
public class VectorEx04 {
	
	public static void main(String[] args) {
		Vector<myData> v = new Vector<myData>();
		
		v.add(new myData("가길동",23));
		v.add(new myData("나길동",22));
		v.add(new myData("다길동",21));
		
		for(myData d:v)
		{
			System.out.printf("이름 %s %d %n",d.name,d.age);
		}
	}

}
