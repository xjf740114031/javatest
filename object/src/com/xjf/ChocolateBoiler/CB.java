package com.xjf.ChocolateBoiler;

public class CB {
	private boolean empty=true;
	private boolean boiled=false;
	private static CB uniquecb;
	private CB(){};
	public static CB returncb(){
		if(uniquecb==null){
			uniquecb=new CB();
		}
		return uniquecb;
	}
	public void fill(){
		if(empty==true){
			System.out.println("fill...");
			empty=false;
		}
		
	}
	public void boil(){
		if(empty==false){
			if(boiled==false){
				System.out.println("boil...");
				boiled=true;
			}
		}
	}
	public void drain(){
		if(empty==false){
			if(boiled==true){
				System.out.println("drain");
				empty=true;
			}
		}
	}
	public boolean isEmpty() {
		return empty;
	}
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	public boolean isBoiled() {
		return boiled;
	}
	public void setBoiled(boolean boiled) {
		this.boiled = boiled;
	}
}
