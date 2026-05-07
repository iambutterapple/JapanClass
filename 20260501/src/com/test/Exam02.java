package com.test;

import java.util.ArrayList;
import java.util.List;

import com.ascore.ScoreVO;

/*
 * 문]
 * 		사용자로부터 6개의 학점(A,B,C,D,F)을 문자로 입력받아
 * 		ArrayList에 저장하고, ArrayList를 검색하여 학점에 점수로 변환하고,평균을 출력하는 프로그램 구현
 * 		학점 점수 : A=4.0,B=3.0,C=2.0,D=1.0,F=0
 * 
 * 		결과
 * 		6 개의 학점 입력 : A C A B F D
 * 		평균 : 2.3333333
 * 
 * */
import java.util.*;
public class Exam02 {

		public static void main(String[] args) {
			
			List<Character>list = new ArrayList<Character>();
			Scanner sc = new Scanner(System.in);
			double number = 0.0;
			//String(문자)로 6개의 학점을 입력 ( 숫자 X,오로지 문자로 입력 )
			for(int i=0;i<6;i++)
			{
				System.out.print("6개 학점 입력 : ");
//				String score = sc.next();
				char ch = sc.next().charAt(0);
				
				if((ch>='A' && ch <= 'D') || ch == 'F')
				{
					list.add(ch);
				}else
				{
					System.out.println("학점 오류");
					return;
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
//				 // 숫자가 포함되어 있는지 확인 (정규표현식)
//			    // .matches(".*\\d.*")는 문자열에 숫자가 하나라도 포함되면 true를 반환합니다.
//			    if (score.matches(".*\\d.*")) {
//			        i--; // 횟수를 차감하여 다시 입력받게 함
//			        continue;
//			    }
//				//학점 점수 : A=4.0,B=3.0,C=2.0,D=1.0,F=0
//				list.add(score);				
//				switch (score) {
//				case "A":
//					number += 4.0;
//					break;
//				case "B":	
//					number += 3.0;
//					break;
//				case "C":	
//					number += 2.0;
//					break;
//				case "D":	
//					number += 1.0;
//					break;
//				case "F":	
//					number += 0;
//					break;
//				default:
//					System.out.println("오류");
//					return;
//				}
			}
			//ArrayList 저장 및 학점 문자를 기준으로 점수로 변환 및 평균 출력
//			System.out.println("평균 :" + number/6.0);
			
			
			System.out.println(list);
			
			for(int i=0;i<6;i++)
			{
				char ch = list.get(i);
				
				switch (ch) {
				case 'A':
						number += 4.0;
					break;
				case 'B':
					number += 3.0;
					break;
				case 'C':
					number += 2.0;
					break;
				case 'D':
					number += 1.0;
					break;
				case 'F':
					number += 0;
					break;
				default:
					break;
				}
			}
			System.out.println("총점 : " + number + "평균 " + number/6.0);
			
			
			
			
			
		}
}
