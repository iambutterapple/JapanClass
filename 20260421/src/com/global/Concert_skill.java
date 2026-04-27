package com.global;
import java.util.*;
public class Concert_skill {

	Calendar cl = Calendar.getInstance();
	Scanner sc = new Scanner(System.in);
	
	
	public Concert_skill() {
		
	}
	
	public void run(){
		System.out.print("예약할 날짜를 선택하세요.:");
		int date = sc.nextInt();
		if(cl.get(Calendar.DATE)>0||cl.get(Calendar.DATE)<date)
		{
			System.out.println("날짜가 잘못 입력했습니다.");
			return;
		}else
		{
			
		}
	}
	
	
	
}
