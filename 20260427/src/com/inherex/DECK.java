package com.inherex;

public class DECK {

	
	final int CARD_NUM = 52;
	Card cardARR[] = new Card[CARD_NUM];
	
	public DECK() {
		//deck의 카드 초기화
		
		int i=0;
		for(int k=Card.KIND_MAX;k>0;k--)
		{
			for(int n=0;n<Card.NUM_MAX;n++)
			{
				cardARR[i++] = new Card(k, n+1);
			}
		}
	}
	
	Card pick(int index) {
		//index에 있는 카드 하나를 반환
		return cardARR[index];
	}
	
	Card pink() {//DECK에서 카드 하나를 랜덤으로 선택
		int index = (int)(Math.random() *  CARD_NUM);
		return pick(index);
	}
	void shufle() {
		//카드를 섞음
		for(int i=0;i<cardARR.length;i++)
		{
			int r =  (int)(Math.random() *  CARD_NUM);
			Card temp = cardARR[i];
			cardARR[i] = cardARR[r];
			cardARR[r] = temp;
 		}
	}
}
