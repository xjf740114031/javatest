package com.task;

import java.util.Scanner;

import com.task.SFCFS.task;

public class DFCFS {
	public class task {
		private int taskID;//任务ID
		private int arrivalTime;//到达时间
		private int serviceTime;//服务时间
		private int startingTime ;//开始时间
		private int finishingTime;//完成时间=开始时间+服务时间
		private int turnAroundTime;//周转时间=完成时间-到达时间
		private double weightTurnAround;//带权周转时间=周转时间/服务时间
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
			System.out.println("任务ID:"+taskID+" 到达时间:"+arrivalTime+" 服务时间:"+serviceTime+
					" 开始时间:"+startingTime+" 完成时间:"+finishingTime+" 周转时间:"+
					turnAroundTime+" 带权周转时间:"+weightTurnAround);
		}

	}
	private int starttime;//开始时间
	private int num;//任务数量
	private task [] ts;//任务数组
	private int n;//计数器
	private int runtime1;//处理队列1时间
	private int runtime2;//处理队列2时间
	public DFCFS() {
		// TODO Auto-generated constructor stub
		n=0;
		runtime1=0;
		runtime2=0;
		
	}
	public void start_up() {
		int [] suijiarr={6,2,1,3,9};
		int index;
		int read;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入任务数量");
		read=scanner.nextInt();
		num=read;
		System.out.println("任务数量为："+read);
		ts=new task[read];
		for (int i = 0; i <read; i++) {
			index=(int)(Math.random()*suijiarr.length);
			int rand=suijiarr[index];
			ts[i]=new task(i+1, i, rand);
		}
		
	}
	public void start_serve() {
		for (int i = 0; i < num; i++) {
//			if(runtime1<=runtime2){
//				if((runtime1+runtime2)<=ts[i].arrivalTime){
//					ts[i].serve(ts[i].arrivalTime);
//					runtime1=ts[i].arrivalTime+ts[i].serviceTime;
//				}
//				else {
//					ts[i].serve(runtime1);
//					runtime1=runtime1+ts[i].serviceTime;
//				}
//			}
//			else {
//				if ((runtime1+runtime2)<=ts[i].arrivalTime) {
//					ts[i].serve(ts[i].arrivalTime);
//					runtime2=ts[i].arrivalTime+ts[i].serviceTime;
//				}
//				else {
//					ts[i].serve(runtime2);
//					runtime2=runtime2+ts[i].serviceTime;
//				}
//			}
			if(runtime1<=runtime2){
				if (runtime1<=ts[i].arrivalTime) {
					ts[i].serve(ts[i].arrivalTime);
					runtime1=ts[i].arrivalTime+ts[i].serviceTime;
				}
				else {
					ts[i].serve(runtime1);
					runtime1=runtime1+ts[i].serviceTime;
				}
			}
			else {
				if (runtime2<=ts[i].arrivalTime) {
					ts[i].serve(ts[i].arrivalTime);
					runtime2=ts[i].arrivalTime+ts[i].serviceTime;
				}
				else {
					ts[i].serve(runtime2);
					runtime2=runtime2+ts[i].serviceTime;
				}
			}
		}
		
		
	}
	public void  print() {
		for (int i = 0; i < num; i++) {
			ts[i].print();
			
		}
		
	}

}
