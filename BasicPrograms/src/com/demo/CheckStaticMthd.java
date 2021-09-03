package com.demo;

public class CheckStaticMthd {

	public static void main(String[] args) {
		
		CheckStaticMthd a = new CheckStaticMthd();
		a.send();
		disp();
	}
	
	public static void disp() {
		System.out.println("disp");
	}
	
	public void send() {
		System.out.println("send");
	}
}
