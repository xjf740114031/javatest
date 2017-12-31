package com.xjf.ChocolateBoiler;

public class main {
	public static void main(String[] args) {
		test tt= new test();
		Thread ta=new Thread(tt);
		Thread tb=new Thread(tt);
		Thread tc=new Thread(tt);
		ta.start();
		tb.start();
		tc.start();
		
	}

}
