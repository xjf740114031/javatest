package com.xjf.ChocolateBoiler;


public class test implements Runnable{
	private CB test1=null;

	public test() {
		test1=CB.returncb();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (test1) {
			System.out.println("��¯�Ƿ�Ϊ�գ�"+test1.isEmpty());
			System.out.println("�Ƿ������"+test1.isBoiled());
			test1.isBoiled();
			test1.fill();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			test1.boil();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			test1.drain();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
//		System.out.println("��¯�Ƿ�Ϊ�գ�"+test.isEmpty());
//		System.out.println("�Ƿ������"+test.isBoiled());
//		System.out.println("�û�2ȡ�ù�¯");
//		CB test2=CB.returncb();
//		System.out.println(test2.isEmpty());
//		System.out.println(test2.isBoiled());
		
	}

}
