package com.setexam;

public class AsciiPrintEx {

	public static void main(String[] args) {
		char ch = ' ';
		for(int i=0;i < 95; i++)
		{
			System.out.print(ch++);
			if(i%8==0)
				System.out.println();
		}
	}
}
