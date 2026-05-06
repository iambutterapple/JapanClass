package com.collectionex;

import java.util.*;

public class VectorEx03 {

	//문자 배열 선언 및 초기화
	private static final String colors[] = {"검정","노랑","초록","파랑","빨강","연두"};

	
	public static void main(String[] args) {
		Vector<String> v= new Vector<String>();
		
		for(String str: colors)
		{
			v.add(str);
		}
		System.out.println("첫 번재 요소 :"+v.firstElement());
		System.out.println("두 번재 요소 :"+v.get(1));
		System.out.println("마지막 요소 :"+v.lastElement());
		System.out.println();
		//첫번재 요소를 흰색으로 변경
		v.set(0, "흰색");
		System.out.println("첫 번재 요소 :"+v.firstElement());
		System.out.println("요소 개수 :"+v.size());
		
		//첫번째 요소에 빨강 추가
		v.insertElementAt("빨강",0);
		System.out.println("첫 번재 요소 :"+v.firstElement());
		System.out.println("\n 전체 출력");
		for(String str:v)
		{
			System.out.print(str+" ");
		}
		
		//오름차순 정렬
		Collections.sort(v);
		System.out.println("\n 오름차순 전체 출력");
		for(String str:v)
		{
			System.out.print(str+" ");
		}
		System.out.println();
		//검색
		int idx = Collections.binarySearch(v, "핑크");//오름차순 정렬된 자료에서만 가능한 메소드
		System.out.println(idx);
		//찾고자 하는 요소가 없을 경우 음수를 출력합니다.
		
		//내림차순 정렬
		Collections.sort(v,Collections.reverseOrder());
		System.out.println("\n 내림차순 전체 출력");
		for(String str:v)
		{
			System.out.print(str+" ");
		}
		System.out.println();
		//내림차순 정렬 후 자료검색할때는 
		idx = Collections.binarySearch(v,"파랑",Collections.reverseOrder());//오름차순 정렬된 자료에서만 가능한 메소드
		System.out.println(idx);
		
		//검색
		String s = "노랑";
		if(v.contains(s))
		{
			int i = v.indexOf(s)+1;
			System.out.println(s + "--> 위치" + i);
		}
		//삭제
		v.remove(0);
		v.remove("파랑");
		System.out.println("\n 삭제후 전체 출력");
		for(String str:v)
		{
			System.out.print(str+" ");
		}
		System.out.println();
	}
}
