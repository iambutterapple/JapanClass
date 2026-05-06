package com.setexam;

import java.util.*;
public class SetLotto {
	
	public static void main(String[] args) {
		Set set = new HashSet<>();
		
		
		for(int i=0;set.size()<6;i++)
		{
			int number = (int)(Math.random()*45)+1;//0부터 가기 때문에 +1
			set.add(number);
			
		}
		System.out.println(set);
		
		List list = new LinkedList<>(set);
		Collections.sort(list);//정렬
		System.out.println(list);
	}
	
}
