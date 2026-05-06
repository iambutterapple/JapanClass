package com.mscore;
import java.util.*;
public class ScoreImpl implements Score {

//	private List<ScoreVO>list = new ArrayList<ScoreVO>();
	//HashMap : 키가 정렬되지 않는다.
//	private Map<String, ScoreVO> map = new HashMap<>();
	private Map<String, ScoreVO> map = new TreeMap<>();
	//TreeMap : 키 값으로 정렬됨.
	private Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.print("데이터 자료 추가 : ");
		String hak;
		System.out.print("학번 : ");
		hak = sc.next();
		
//		ScoreVO temp = readScore(hak);//입력한 학번이 list와 있는 학번과 같으면
//		if(temp != null)
//		{//학번이 이미 존재한다면
//			System.out.println("이미 등록된 학번입니다.\n");
//			return;
//		}
		
		if(map.containsKey(hak))
		{
			System.out.println("이미 등록된 학번이 있습니다.");
			return;
		}
		
		
		//학번이 존재 하지 않으면 
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("이름 : ");
		vo.setName(sc.next());
		System.out.print("생년월일 : ");
		vo.setBirth(sc.next());
		System.out.print("국어 : ");
		vo.setKor(sc.nextInt());
		System.out.print("영어 : ");
		vo.setEng(sc.nextInt());
		System.out.print("수학 : ");
		vo.setMat(sc.nextInt());
		
//		list.add(vo);
		map.put(hak, vo);
		System.out.println("데이터 등록이 완료 되었습니다.");
	}

	@Override
	public void update() {
		System.out.print("데이터 자료 수정 : ");
		String hak;
		System.out.print("수정할 학번 : ");
		hak = sc.next();
		
		if(!map.containsKey(hak))
		{
			System.out.println("등록된 학번이 없습니다.");
			return;
		}
		//학번이 존재 한다면 
//		ScoreVO vo = new ScoreVO();
//				vo.setHak(hak);
		ScoreVO vo = map.get(hak);
		System.out.print("이름 : ");
		vo.setName(sc.next());
		System.out.print("생년월일 : ");
		vo.setBirth(sc.next());
		System.out.print("국어 : ");
		vo.setKor(sc.nextInt());
		System.out.print("영어 : ");
		vo.setEng(sc.nextInt());
		System.out.print("수학 : ");
		vo.setMat(sc.nextInt());
		
//				list.add(vo);
		System.out.println("데이터 수정이 완료 되었습니다.");
		
		//학번이 존재 하지 않으면 
//		System.out.print("이름 : ");
//		vo.setName(sc.next());
//		System.out.print("생년월일 : ");
//		vo.setBirth(sc.next());
//		System.out.print("국어 : ");
//		vo.setKor(sc.nextInt());
//		System.out.print("영어 : ");
//		vo.setEng(sc.nextInt());
//		System.out.print("수학 : ");
//		vo.setMat(sc.nextInt());
//		
//		System.out.println("데이터 등록이 완료 되었습니다.");

	}

	@Override
	public void delete() {
		System.out.print("데이터 자료 삭제 : ");
		String hak;
		System.out.print("삭제할 학번 : ");
		hak = sc.next();
		
		if(!map.containsKey(hak))
		{
			System.out.println("등록된 학번이 없습니다.");
			return;
		}
		
		map.remove(hak);
		System.out.println("데이터 삭제가 완료 되었습니다.");
	}

	@Override
	public void listall() {
		// TODO Auto-generated method stub
		System.out.println("\n 전체 출력 ...");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext())
		{
			String hak = it.next();
			ScoreVO vo = map.get(hak);
//			System.out.print(hak);
			System.out.println(vo.toString());
		}
		System.out.println();
	}

	@Override
	public void searchHak() {
		// TODO Auto-generated method stub
		System.out.print("데이터 자료 검색 : ");
		String hak;
		System.out.print("검색할 학번 : ");
		hak = sc.next();
		
		if(!map.containsKey(hak))
		{
			System.out.println("등록된 학번이 없습니다.");
			return;
		}
		ScoreVO vo = map.get(hak);
		
		if(vo !=null) {
			System.out.println(vo.toString());
		}
		System.out.println();
	}

	@Override
	public void searchName() {
		System.out.print("데이터 이름 검색 : ");
		String name;
		System.out.print("검색할 이름 : ");
		name = sc.next();
		
//		for(ScoreVO vo:list) {
//			if(vo.getName().startsWith(name))
//			{
//				System.out.println(vo);
//			}
//		}
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext())
		{
			String hak = it.next();
			
			ScoreVO vo = map.get(hak);
			
			if(vo.getName().startsWith(name))
			{
				System.out.println(vo.toString());
			}
		}
		System.out.println();
	}
	
	

}
