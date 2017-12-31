package com.xjf.sum;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		testThread t1=new testThread(1, 25);
		testThread t2=new testThread(26, 50);
		testThread t3=new testThread(51, 75);
		testThread t4=new testThread(76, 100);
		Thread ta=new Thread(t1);
		Thread tb=new Thread(t2);
		Thread tc=new Thread(t3);
		Thread td=new Thread(t4);
		try {
			ta.start();
			ta.join();
			sum+=t1.returnnum();
			tb.start();
			tb.join();
			sum+=t2.returnnum();
			tc.start();
			tc.join();
			sum+=t3.returnnum();
			td.start();
			td.join();
			sum+=t4.returnnum();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(sum);
		

	}

}
