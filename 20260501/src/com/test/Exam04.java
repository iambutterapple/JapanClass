package com.test;

import java.util.Scanner;
import java.util.Vector;

/*
 * 
 * Vector를 이용하여 강수량의 평균을 유지 관리하는 프로그램을 구현하시오.
 * 	강수량을 입력하여 벡터에 추가하고 현재까지 입력된 모든 강수량과 
 * 	평균을 출력하시오.
 * 
 * 강수량 입력 : 5
 * 5
 * 	강수량 입력 : 80
 * 5 85
 * 강수량 입력 : 53
 * 5 80 53
 * 강수량 입력 : 22
 * 5 80 53 22
 * 강수량 입력 : 0
 * 현재 평균 : 40
 * 종료
 * 
 * 
 * */
import java.util.*;
public class Exam04 {

	public static void main(String[] args) {
		Vector<Integer> list = new Vector<>();
		Scanner sc = new Scanner(System.in);
		double hap = 0.0;
		//강수량 입력 :
		while(true)
		{
			System.out.print("강수량 입력 : ");
			int num = sc.nextInt();
			hap += num;
			if(num == 0)
			{
				hap = (double)hap/list.size();
				System.out.println("현재 평균 : " + hap);
				return;				
			}
			list.add(num);
			for(int i=0;i<list.size();i++)
				System.out.print(list.get(i)+ " ");
			System.out.println();
		}
		
		/*
		 * 
		 * Iterator<Integer>it = v.iterator();
		 * 
		 * while(it.hasNext())
		 *	{
		 *		int n = it.next();
		 *	}
		 * */

	}
}
