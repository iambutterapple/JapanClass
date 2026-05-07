package com.test;

import java.util.HashMap;

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
public class Exam8_result {
	Scanner sc  = new Scanner(System.in);
	HashMap<String,Integer> sn = new HashMap<String,Integer>();
	
	//입력
	 
	//출력
	//운영
	public Exam8_result() {
		
	}
	
	
	public static void main(String[] args) {
		
	}
}
