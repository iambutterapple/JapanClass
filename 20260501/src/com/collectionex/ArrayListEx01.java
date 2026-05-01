package com.collectionex;
import java.util.*;
public class ArrayListEx01 {
	
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(5);//0
		list1.add(10);//1
		list1.add(15);//2
		list1.add(1);//3
		list1.add(13);//4
		
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		Collections.sort(list1);
		Collections.sort(list2);
		
		print(list1, list2);
//		System.out.println(list1);
//		System.out.println(list2);
		
		System.out.println("list1.containsAll(list2) : " +list1.containsAll(list2));
		System.out.println();
		list2.add(1,"B");
		list2.add(2,"C");
		list2.add(3,"D");
		list2.add(4,"E");
		
		list2.set(3,"AA");
		print(list1, list2);
		//retainAll → list1에서 list2와 겹치는 부분만 남기고 나머는 삭제 처리함
		System.out.println("list1.retainAll(list2)" + list1.retainAll(list2));
		print(list1, list2);
		
		//list2에서 list1에 포함된 객체들을 삭제처리
		
		for(int i=list2.size()-1;i>=0;i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
				print(list1, list2);
			}
		}
	}
	
	
	static void print(ArrayList list1,ArrayList list2) {
		System.out.println("list 1" + list1);
		System.out.println("list 2" + list2);
		System.out.println();
	}
}
