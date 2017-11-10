package com.task;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SFCFS sfcfs=new SFCFS();
		sfcfs.start_up();
		sfcfs.start_serve();
		sfcfs.print();
		DFCFS dfcfs=new DFCFS();
		dfcfs.start_up();
		dfcfs.start_serve();
		dfcfs.print();
		SSJF sf=new SSJF();
		sf.start_up();
		sf.start_serve();
		sf.print();
		DSJF df=new DSJF();
		df.start_up();
		df.start_serve();
		df.print();
	}

}
