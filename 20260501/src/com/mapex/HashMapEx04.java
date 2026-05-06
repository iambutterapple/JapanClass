package com.mapex;

import java.util.*;

public class HashMapEx04 {

	static HashMap phoneBook = new HashMap();
	
	public static void main(String[] args) {
		addPhoneNumber("친구", "가자", "010-1111-1111");
		addPhoneNumber("친구", "나자", "010-2222-1111");
		addPhoneNumber("친구", "나자", "010-1111-2222");

		addPhoneNumber("회사", "라대리", "010-3333-2222");
		addPhoneNumber("회사", "바대리", "010-1111-3333");
		addPhoneNumber("회사", "나대리", "010-4444-2222");
		addPhoneNumber("회사", "나대리", "010-1111-4444");

		addPhoneNumber("세탁소", "010-3333-3333");
//		System.out.println(phoneBook);
		phoneprint();
	}
	
	//그룹에 전화번호를 추가하는 메소드
	static void addPhoneNumber(String groupName,String name,String tel)
	{
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);// 이름은 중복가능하나 전화번호는 중복 불가
	}
	//그룹을 추가하는 메소드
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap<>());
		}
	}
	static void addPhoneNumber(String name,String tel) {
		addPhoneNumber("기타", name,tel);
	}
	//전화번호를 출력하는 메소드
	static void phoneprint() {
		Set set = phoneBook.entrySet();
		Iterator it =set.iterator();
		
		while(it.hasNext())
		{
			Map.Entry e = (Map.Entry)it.next();
			
			Set subset = ((HashMap)e.getValue()).entrySet();
			Iterator subit =subset.iterator();
			
			System.out.println(" * " + e.getKey() + "[" + subset.size() + "]");
			
			while(subit.hasNext()) {
				Map.Entry subE = (Map.Entry)subit.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				
				System.out.println("이름 " + name + "전봐번호 : " + telNo);
			}
			System.out.println();
		
		}
	}
}
