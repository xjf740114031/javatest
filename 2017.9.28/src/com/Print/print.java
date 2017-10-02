package com.Print;

public class print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		for(int i=0;i<4;i++)      
		{
			for(int j=0;j<=2-i;j++)
				System.out.print(" ");
			for(int k=0;k<=2*i;k++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print(" ");
			for(int k=0;k<=4-2*i;k++)
				System.out.print("*");
			System.out.println();
		}
	}
}



