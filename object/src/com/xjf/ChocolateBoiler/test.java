package com.xjf.ChocolateBoiler;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CB test=CB.returncb();
		System.out.println(test.isEmpty());
		System.out.println(test.isBoiled());
		test.isBoiled();
		test.fill();
		test.boil();
		test.drain();
		System.out.println(test.isEmpty());
		System.out.println(test.isBoiled());
		System.out.println("用户2取得锅炉");
		CB test2=CB.returncb();
		System.out.println(test2.isEmpty());
		System.out.println(test2.isBoiled());
		
		

	}

}
