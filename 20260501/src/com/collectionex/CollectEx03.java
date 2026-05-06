package com.collectionex;
/*
 * 큐(Queue)
 * 		큐는 FIFO 방식 ( First Input First Output)방식 구조로
 * 		먼저 입력된 데이터가 먼저 출력된다.
 * 		큐 인터페이스를 구현한 클래스는 큐와 관련된
 * 		다양한 메소드를 제공함
 * 
 * 		element(),offer(),peek(),poll(),remove()
 * 
 * */
import java.util.*;
public class CollectEx03 {

	
	
	
	public static void main(String[] args) {
		//Queue 인스턴스 생성
		Queue<String>  myQueue = new LinkedList<>();
		
		
		String str1 = "1-aaaa";
		String str2 = "2-aaaa";
		String str3 = "3-aaaa";
		String str4 = "4-aaaa";
		
		//Queue 에 데이터 추가
		myQueue.offer(str1);
		myQueue.offer(str2);
		myQueue.offer(str3);
		myQueue.offer(str4);
		
		System.out.println("값 1 :" + myQueue.element());
		System.out.println("값 1 :" + myQueue.element());
		
		
		System.out.println();
		String val;
		
		//peek(): 큐에 head 요소를 반환하고 제거는 안함
		//			  큐가 비어있을 때(empty())는 null을 반환함
		//첫번째 방법
//		while(myQueue.peek() != null)
//		{
//			val = myQueue.poll();//큐의 head 요소를 반환하고 제거한다.
//			System.out.print(val + " ");
//		}
		System.out.println();
		//두번째 방법
//		while(true) {
//			val = myQueue.poll();
//			if(val == null)
//				break;
//			else
//				System.out.print(val + " ");
//		}
		System.out.println();
		//세번째 방법
		while(!myQueue.isEmpty())
		{
			val = myQueue.poll();
			System.out.print(val + " ");
		}
	}
}
