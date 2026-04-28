package com.inherexam;

public class IPTV extends ColorTv{

	private String ipAddr;
	public IPTV(String ipAddr,int size,int color) {
		super(size, color);
		this.ipAddr = ipAddr;
	}
	@Override
	public void printProperty() {
		System.out.println("나의 IPTV는"+ ipAddr + "주소의" );
		super.printProperty();
	}
	
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.168.1.2", 32, 1024);
		iptv.printProperty();
	}
}
