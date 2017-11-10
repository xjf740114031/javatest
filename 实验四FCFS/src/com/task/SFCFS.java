package com.task;

import java.io.IOException;
import java.util.Scanner;

public class SFCFS {
	public class task {
		private int taskID;//����ID
		private int arrivalTime;//����ʱ��
		private int serviceTime;//����ʱ��
		private int startingTime ;//��ʼʱ��
		private int finishingTime;//���ʱ��=��ʼʱ��+����ʱ��
		private int turnAroundTime;//��תʱ��=���ʱ��-����ʱ��
		private double weightTurnAround;//��Ȩ��תʱ��=��תʱ��/����ʱ��
		public task(int id ,int altime,int setime) {
			// TODO Auto-generated constructor stub
			taskID=id;
			arrivalTime=altime;
			serviceTime=setime;
		}
		void serve(int stime){
			startingTime=stime;
			finishingTime=startingTime+serviceTime;
			turnAroundTime=finishingTime-arrivalTime;
			weightTurnAround=(double)turnAroundTime/serviceTime;
		}
		void print(){
			System.out.println("����ID:"+taskID+" ����ʱ��:"+arrivalTime+" ����ʱ��:"+serviceTime+
					" ��ʼʱ��:"+startingTime+" ���ʱ��:"+finishingTime+" ��תʱ��:"+
					turnAroundTime+" ��Ȩ��תʱ��:"+weightTurnAround);
		}

	}
	private int starttime;//��ʼʱ��
	private int num;//��������
	private task [] ts;//��������
	private int n;//������
	private int nowtime;//��ǰʱ��
	public SFCFS() {
		// TODO Auto-generated constructor stub
		n=0;
		nowtime=0;
		
	}
	public void start_up() {
		int [] suijiarr={6,2,1,3,9};
		int index;
		int read;
		Scanner scanner=new Scanner(System.in);
		System.out.println("��������������");
		read=scanner.nextInt();
		num=read;
		System.out.println("��������Ϊ��"+read);
		ts=new task[read];
		for (int i = 0; i <read; i++) {
			index=(int)(Math.random()*suijiarr.length);
			int rand=suijiarr[index];
			ts[i]=new task(i+1, i, rand);
		}
		
	}
	public void start_serve() {
		for (int i = 0; i < num; i++) {
			if(nowtime<=ts[i].arrivalTime){
				ts[i].serve(ts[i].arrivalTime);
				nowtime=nowtime+ts[i].serviceTime;
			}
			else{
				ts[i].serve(nowtime);
				nowtime=nowtime+ts[i].serviceTime;
				
			}
		}
		
		
	}
	public void  print() {
		for (int i = 0; i < num; i++) {
			ts[i].print();
			
		}
		
	}

}
