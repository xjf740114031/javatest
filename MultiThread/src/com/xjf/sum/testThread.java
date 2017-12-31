package com.xjf.sum;

public class testThread implements Runnable{
	private int start;
	private int end;
	private int number;
	public testThread(int start,int end) {
		this.start=start;
		this.end=end;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			for(;start<=end;start++)
			{
				number+=start;
			}
			
		}
		
	}
	public int returnnum() {
		return number;
		
	}

}
