package com.xjf.manager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.xjf.view.ServerView;

public class ServerManager {
	private BufferedReader reader;
	private PrintWriter writer;
	private ServerSocket serverSocket;
	private Socket socket;
	private ServerView sView;
	public void getserver(){
		try {
			sView=new ServerView("服务器");
			sView.setSize(200,400);
			sView.setVisible(true);
			System.out.println("服务器开启");
			serverSocket=new ServerSocket(8998);
			System.out.println("服务器套接字已经创建成功");
			while(true){
				System.out.println("等待客户机的连接");
				socket=serverSocket.accept();
				System.out.println("客户机已连接");
				reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer=new PrintWriter(socket.getOutputStream(),true);
				sView.setWriter(writer);
				getClientMessage();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void getClientMessage(){
		try {
//			System.out.println(sView);
			String line;
			System.out.println("开始获得客户端信息");
		
				while ((line = reader.readLine()) != null) {
//					System.out.println("...");
					System.out.println("收到:"+line);
					sView.appendText("收到："+line);
				}
//				System.out.println("获得客户端信息结束");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("异常1");
		}
	}

}
