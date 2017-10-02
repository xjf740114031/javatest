package com.years;

import java.io.IOException;
import java.util.Scanner;

public class year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while(true){
//			System.out.println("请输入一个年份:(1990~2007)");
//		
//				Scanner scan = new Scanner(System.in);
//				int i=scan.nextInt();
//				if(i>=1990&&i<=2007){
//					if((i%4==0)&&(i%100!=0)){
//						System.out.println(i+"是闰年");
//					}else if(i%400==0){
//						System.out.println(i+"是闰年");
//					}
//					else{
//						System.out.println(i+"不是闰年");
//					}
//				}
//				else {
//					System.out.println("请输入1990到2007之间.");
//				}
//				
//		}
		int k=0;
		for(int i=1990;i<=2007;i++){
			if((i%4==0)&&(i%100!=0)){
				System.out.print(i+"是闰年");
			}else if(i%400==0){
				System.out.print(i+"是闰年");
			}
			else{
				System.out.print(i+"不是闰年");
			}
			k++;
			if(k%2==0){
				System.out.println();
			}
		}

	}

}
