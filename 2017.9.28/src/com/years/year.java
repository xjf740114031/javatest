package com.years;

import java.io.IOException;
import java.util.Scanner;

public class year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while(true){
//			System.out.println("������һ�����:(1990~2007)");
//		
//				Scanner scan = new Scanner(System.in);
//				int i=scan.nextInt();
//				if(i>=1990&&i<=2007){
//					if((i%4==0)&&(i%100!=0)){
//						System.out.println(i+"������");
//					}else if(i%400==0){
//						System.out.println(i+"������");
//					}
//					else{
//						System.out.println(i+"��������");
//					}
//				}
//				else {
//					System.out.println("������1990��2007֮��.");
//				}
//				
//		}
		int k=0;
		for(int i=1990;i<=2007;i++){
			if((i%4==0)&&(i%100!=0)){
				System.out.print(i+"������");
			}else if(i%400==0){
				System.out.print(i+"������");
			}
			else{
				System.out.print(i+"��������");
			}
			k++;
			if(k%2==0){
				System.out.println();
			}
		}

	}

}
