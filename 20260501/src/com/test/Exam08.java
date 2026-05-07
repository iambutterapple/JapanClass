package com.test;

/*
 * 문]
 * 		고객의 이름과 포인트 점수를 관리하는 프로그램을 map을 이용하여 구현하시오.
 * 		고객의 이름과 포인트 점수를 저장관리하는데, 포인트는 추가될때마다 누적하여 저장
 * 
 * 		포인트 관리 프로그램
 * 
 * 		이름과 포인트 입력 : 가길동 40
 * 		(가길동,40)
 * 		이름과 포인트 입력 : 나길동 50
 * 		(가길동,40)(나길동,50)
 * 		이름과 포인트 입력 : 다길동 60
 * 		(가길동,40)(나길동,50)(나길동,40)
 * 		이름과 포인트 입력 : 나길동 30
 * 		(가길동,40)(나길동,50)(나길동,40)(나길동,40)
 * 		이름과 포인트 입력 : 나길동 20
 * 		(가길동,40)(나길동,50)(나길동,40)(나길동,40)(나길동,20)
 * 		＊ 같은 이름 일경우 포인트는 더하는 조건
 * 		이름과 포인트 입력 : 그만
 * 		프로그램을 종료합니다.
 * 	
 * 
 * */
import java.util.*;
public class Exam08 {
	Scanner sc  = new Scanner(System.in);
	HashMap<String,Name_point> sn = new HashMap<String,Name_point>();
	
	//입력
	public void input() {
		while(true)
		{
			System.out.print("이름과 포인트 입력 :");
			String name = sc.next().trim();
			if(name.equals("그만"))
			{
				System.out.println("종료");
				return;
			}
//			Integer n = map.get(name);
//			if(n != null)
//			{
//				point += n;
//			}
			
			
			
			int point = sc.nextInt();
			Name_point n = sn.get(name);
			if(n != null)
			{
				point += n.getScore();
			}
						
			Name_point np = new Name_point(name, point);

			
			sn.put(name, np);
			
			print();
		}
	}
	//출력 및 같은 이름 더하기
	public void print() {
		Iterator<Name_point> it = sn.values().iterator();
		
		while(it.hasNext())
		{
			Name_point np=	it.next();
			
			System.out.println("(" + np.getName() + ","+np.getScore()+ ")");
			
		}
		
		
	}
	//운영
	public void run() {
		input();
	}
	
	
	public static void main(String[] args) {
		new Exam08().run();
	}
}
