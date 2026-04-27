package com.inherex;

public class CaptionTv extends Tv{
			
		boolean caption;//캡션에 대한 상태(on.off)
		
		void displayCaption(String text) {
		
			if(caption)
			{//캡션의 상태가 true 일 때 매개변수로 전달받은 text를 보여준다.
				System.out.println(text);
			}
		}
}
