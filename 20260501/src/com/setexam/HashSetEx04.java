package com.setexam;
import java.util.*;
public class HashSetEx04 {

		public static void main(String[] args) {
			HashSet setA = new HashSet<>();
			HashSet setB = new HashSet<>();
			HashSet setHab = new HashSet<>();
			HashSet setKyo = new HashSet<>();
			HashSet setCha = new HashSet<>();
			
			setA.add("1");
			setA.add("2");
			setA.add("3");
			setA.add("4");
			setA.add("5");
			System.out.println("A : " + setA);
			
			setB.add("4");
			setB.add("5");
			setB.add("6");
			setB.add("7");
			setB.add("8");
			System.out.println("B : " + setB);
			
			Iterator it = setB.iterator();
			while(it.hasNext())
			{
				Object tmp = it.next();
				if(setA.contains(tmp))
				{
					setKyo.add(tmp);
				}
			}
			it =setA.iterator();
			while(it.hasNext()) {
				Object tmp = it.next();
				
				if(!setB.contains(tmp))
				{
					setCha.add(tmp);
				}
			}
			it = setA.iterator();
			while(it.hasNext())
			{
				setHab.add(it.next());
			}
			it = setB.iterator();
			while(it.hasNext())
			{
				setHab.add(it.next());
			}
			System.out.println("A B 교집합"+setKyo);
			System.out.println("A B 합집합"+setHab);
			System.out.println("A B 차집합"+setCha);
			
//			교집합: setA.retainAll(setB); (A를 B와의 교집합만 남기고 변경)
//			차집합: setA.removeAll(setB); (A에서 B에 포함된 것 제거)
//			합집합: setA.addAll(setB); (A에 B의 모든 요소를 추가, 중복은 자동 제거)
		}
}
