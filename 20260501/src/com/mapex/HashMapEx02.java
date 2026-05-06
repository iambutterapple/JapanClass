package com.mapex;
import java.util.*;
public class HashMapEx02 {

	public static void main(String[] args) {
		HashMap map = new HashMap<>();
		
		map.put("가길동", 90);
		map.put("나길동", 100);
		map.put("다길동", 70);
		map.put("라길동", 80);
		map.put("마길동", 90);
		
//		System.out.println(map);
		
		Set set = map.entrySet(); // 이름+점수 쌍을 묶어서 set에 담음
		Iterator it = set.iterator(); // 훑어보기 위한 일꾼(Iterator) 소환

		while(it.hasNext()) { // 1. 꺼낼 게 더 있니? (True/False)
		    Map.Entry e = (Map.Entry)it.next(); // 2. 있으면 하나 꺼내서 'e'에 저장해
		    System.out.println("이름 : " + e.getKey() + "," + "점수 : " + e.getValue()); // 3. e에서 이름이랑 점수만 읽어줘
		}
		set = map.keySet();//키 값만 뽑기
		System.out.println("명단 : "+set);
		
		
		Collection values = map.values(); // 점수들(90, 100, 70...)만 따로 모음
		it = values.iterator(); // 다시 일꾼 소환

		int sum = 0; // 합계를 저장할 통
		while(it.hasNext()) { // 1. 꺼낼 점수가 또 있니?
		    Integer i = (Integer)it.next(); // 2. 점수 하나 꺼내서 'i'라고 부르자
		    sum += i.intValue(); // 3. 그 점수를 sum에 계속 누적해서 더해
		}
		System.out.println("총점은  : " + sum);
		System.out.println("평균은 : " + (float)sum/set.size());
		System.out.println("최고점수는 : "+Collections.max(values));
		System.out.println("최고점수는 : "+Collections.min(values));
		
	}
}
