package com.task;

import java.util.Scanner;

import com.task.SSJF.task;

public class DSJF {
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
	private boolean  [] isdone;
	private int n;//计数器
	private int nowtime;//当前时间
	private int nowtime1;
	private int nowtime2;
	private int unserved;//未服务的最小任务
	private int min;//已到达服务时间最短的任务
	public DSJF() {
		// TODO Auto-generated constructor stub
		n=0;
		nowtime=0;
		nowtime1=0;
		nowtime2=0;
		
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
		isdone=new boolean[read];
		for (int i = 0; i <read; i++) {
			index=(int)(Math.random()*suijiarr.length);
			int rand=suijiarr[index];
			ts[i]=new task(i+1, i, rand);
		}
		
	}
	public void start_serve() {
		unserved=0;
		min=0;
		for (int i = 0; i < num; i++) {
			for (int j = unserved; j <=num; j++) {
				if(isdone[j]==false)
				{
					unserved=j;
					break;
				}
			}
				min=unserved;
				for (int k = unserved; k < num&&k<=nowtime1&&k<=nowtime2; k++) {
					if(isdone[k]==false&&ts[k].serviceTime<ts[min].serviceTime){
						min=k;
					}
				}
				if(nowtime1<=nowtime2){
					if(ts[min].arrivalTime<=nowtime1){
						ts[min].serve(nowtime1);
						nowtime1=nowtime1+ts[min].serviceTime;
						isdone[min]=true;
					}
					else {
						ts[min].serve(ts[min].arrivalTime);
						nowtime1=ts[min].arrivalTime+ts[min].serviceTime;
						isdone[min]=true;
					}
				}
				else{
//					ts[min].serve(nowtime2);
//					nowtime2=nowtime2+ts[min].serviceTime;
//					isdone[min]=true;
					if(ts[min].arrivalTime<=nowtime2){
						ts[min].serve(nowtime2);
						nowtime2=nowtime2+ts[min].serviceTime;
						isdone[min]=true;
					}
					else {
						ts[min].serve(ts[min].arrivalTime);
						nowtime2=ts[min].arrivalTime+ts[min].serviceTime;
						isdone[min]=true;
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
