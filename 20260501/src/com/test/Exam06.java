package com.test;
/*
 * 도시 이름,위도 ,경도 정보를 가진 Location 클래스를 작성하고,
 * 도시이름을 키로하는 HashMap<String,Location> 컬렉션을 만들고
 * 사용자로부터 입력받아 4개의 도시를 저장 하는 프로그램을 구현하고,
 * 도시이름으로 검색하는 프로그램을 구현하시오.
 * 
 * 
 * 결과
 * 도시이름 , 경도,위도를 입력하세요.
 * >>서울 37 126
 * >>서울 37 126
 * >>서울 37 126
 * >>서울 37 126
 * -------------------------------------------------
 * 서울 37 126
 * LA 34 -118
 * 파리 2 48
 * 시드니 151 -33
 * -------------------------------------------------
 * 도시이름 검색 : 파리
 * 파리는 없습니다.
 * 도시이름 검색 : 서울
 * 서울 37 126
 * 도시이름 검색 : 그만
 * 프로그램을 종료
 * 
 * */
import java.util.*;
public class Exam06 {
	
	private Scanner sc = new Scanner(System.in);
	private HashMap<String, location> sl = new HashMap<String, location>();
	
	//입력
//	void input() {
//		System.out.println("도시이름 , 경도,위도를 입력하세요.");
//		for(int i=0;i<4;i++)
//		{
//			System.out.print(">>");
//			String city = sc.next().trim();
//			double long_longitude = sc.nextDouble();
//			double lat_latitude =sc.nextDouble();
//						
//			location lo = new location(city, long_longitude, lat_latitude);
//			sl.put(city, lo);
//		}
//	}
	public void input() {
		System.out.println("도시이름 , 경도,위도를 입력하세요.");
		for(int i=0;i<4;i++)
		{
			System.out.print(" >>");
			String city = sc.next().trim();
			double long_longitude = sc.nextDouble();
			double lat_latitude =sc.nextDouble();
			
			location loc = new location(city, long_longitude, lat_latitude);
			sl.put(city, loc);
		}
	}
	//출력
//	void print() {
//		Iterator<location>it = sl.values().iterator();
//		
//		System.out.println("-------------------------------------------------");
//		while(it.hasNext())
//		{
//			location s=it.next();
//			System.out.println(s.getCity() + s.getLatitude()+s.getLongitude());
//		}
//		System.out.println("-------------------------------------------------");
//		
//	}
	public void print() {
		Set<String> key = sl.keySet();
		Iterator<String> it = key.iterator();
		System.out.println("-------------------------------------------------");
		while(it.hasNext())
		{
			String city = it.next();
			location loc = sl.get(city);
			
			System.out.println(loc.getCity() + ", " + loc.getLongitude() + ", "+ loc.getLatitude());
		}
		System.out.println("-------------------------------------------------");
		
	}
	//검색
	public void search() {
		while(true)
		{
			System.out.print("도시 이름 : ");
			String city = sc.next();
			
			if(city.equals("그만"))
			{
				System.out.println("프로그램 종료");
				return;
			}
			location loc = sl.get(city);
			
			if(loc==null)
			{
				System.out.println("NO DATA");
				
			}else
			{
				System.out.println(loc.getCity() + ", " + loc.getLongitude() + ", "+ loc.getLatitude());
			}
		}
	}
//	void search() {
//		while(true) {
//			System.out.print("도시이름 검색 : ");
//			String city =sc.next().trim();
//			
//			if(city.equals("그만"))
//			{
//				System.out.println("종료");
//				return;
//			}
//			
//			location lc = sl.get(city);
//			
//			if(lc != null)
//				System.out.println(lc.getCity() + lc.getLatitude() + lc.getLongitude());
//			else 
//				System.out.println("데이터 없습니다.");
//
//			
//		}
//	}
	//실행
	void run() {
		input();
		print();
		search();
	}
	
	public static void main(String[] args) {
		new Exam06().run();
	}
}

