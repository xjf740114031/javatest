package com.xjf.main;

import com.xjf.manager.ServerManager;
import com.xjf.view.ServerView;

public class ServerStart {
	public static void main(String[] args) {
//		ServerView sView=new ServerView("服务器");
//		sView.setSize(200,400);
//		sView.setVisible(true);
//		System.out.println("服务器开启");
		ServerManager serverManager=new ServerManager();
		serverManager.getserver();
		return;
	}
	

}
