package com.collectionex;
import java.util.*;
public class CollectEx04 {
	private static final String colors[] = {"검정","노랑","초록","파랑","빨강","연두"};
	
	public static void main(String[] args) {
		Queue<String> qu = new LinkedList<>();
		//offer : 큐에 데이터를 저장
		for(String str:colors)
		{
			qu.offer(str);
		}
		//poll : 큐의 head 요소를 리턴하고 삭제한다.
		while(qu.peek()!= null)
		{
			System.out.print(qu.poll() + " ");
		}
		System.out.println();
	}
}
