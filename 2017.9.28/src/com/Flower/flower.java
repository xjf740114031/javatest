package com.Flower;

public class flower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100;i<999;i++){
			int a=i%10;
			int b1=i%100;
			int b2=b1/10;
			int c=i/100;
			if((a*a*a+b2*b2*b2+c*c*c)==i){
				System.out.println(" "+i+"是水仙花数");
			}
		}

	}

}
