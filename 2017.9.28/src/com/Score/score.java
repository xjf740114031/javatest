package com.Score;

public class score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10,20,30,40,50,60,70,80,90,100};
		String [] arr2 =new String[arr.length];
		ToGradeScore(arr, arr2);

	}
	static void ToGradeScore(int score[],String grade[]){
		  for(int i=0;i<score.length;i++){
	           if(score[i]>=90){
	             grade[i] = "A";
	           }else if(score[i]>=80&&score[i]<=89){
	               grade[i] = "B";
	           }else if(score[i]>=70&&score[i]<=79){
	               grade[i] = "C";
	           }else if(score[i]>=60&&score[i]<=69){
	               grade[i] = "D";
	           }else{
	           grade[i] = "E";
	           }
	       }
	       //输出转换后成绩
	       for(int i=0;i<grade.length;i++){
	         System.out.print(grade[i]+",");
	       }
		
	}

}
