package com.test;

import java.util.HashMap;

/*
 * 문3] 
 * 		"그만"이 입력될때까지 나라 이름과 인구를 입력받고 저장
 * 		다시 나라 이름받아 인구를 출력하는 프로그램을 구현
 * 		
 * 		HashMap<String,Integer> nations = new HashMap<String,Integer>();
 * 
 * 
 * 		출력결과
 * 		나라 이름과 인구를 입력하세요.
 * 		나라 이름 인구 : korea 5000
 * 		나라 이름 인구 : USA 10000000
 * 		나라 이름 인구 : France 3000
 * 		나라 이름 인구 : 그만
 * 		인구 검색 : France 
 * 		France의 인구는 3000
 * 		인구 검색 : 중국
 * 		중국 나라는 없습니다.
 * 		인구 검색 : 그만
 * 		프로그램을 종료합니다.
 * 
 * */
import java.util.*;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String,Integer>();
		
		while(true) {
			System.out.print("나라 이름 인구 : ");
			String s = sc.next();
			if(s.equals("그만"))
			{
				System.out.println("프로그램 종료");
				break;
			}
			int n = sc.nextInt();
			
			nations.put(s, n);
		}
		System.out.println(nations);
		while(true)
		{
			System.out.print("나라 이름 검색 : ");
			String s = sc.next();
			if(s.equals("그만"))
			{
				System.out.println("프로그램 종료");
				break;
			}
			Integer n = nations.get(s);
			
			if(n == null)
				System.out.println(s+"데이터가 없습니다.");
			else
				System.out.println(s + "의 인구수는 " + n);
		}
	}
}
//class function{
//	HashMap<String, Integer> nations = new HashMap<String,Integer>();
//
//	//나라 이름과 인구를 입력하세요.
//	//나라 이름, 인구
//	void run() {
//		Scanner sc  =new Scanner(System.in);
//		System.out.println("나라 이름과 인구를 입력하세요.");
//		while(true)
//		{
//			 System.out.print("나라 이름 인구 수 : ");
//			 String name = sc.next().trim();
//			 
//			 //그만 이라고 하면 검색하는 메소드로 이동
//			 if(name.equals("그만"))
//				 search();
//			 
//			 int number = sc.nextInt();
//			
//	         nations.put(name, number);
//	        
//			 
//		}
//	}
	//인구 검색 : France 
	//France의 인구는 3000
//	void search() {
//		Set set = nations.entrySet();
//		Iterator it = set.iterator();
//		
//		while(it.hasNext())
//		{
//			
//		}
//		
//	}
//}