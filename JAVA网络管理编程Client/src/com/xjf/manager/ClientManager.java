package com.xjf.manager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.xjf.view.ClientView;

public class ClientManager {
	private BufferedReader reader;
	private PrintWriter writer;
	private Socket socket;
	private ClientView cView;
	public void getserver(){
		try {
			cView=new ClientView("客户端");
			cView.setSize(200,400);
			cView.setVisible(true);
			System.out.println("客户端开启");
			socket=new Socket("127.0.0.1",8998);
			System.out.println("客户端套接字已经创建成功");
				reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer=new PrintWriter(socket.getOutputStream(),true);
				cView.setWriter(writer);
				getClientMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void getClientMessage(){
		try {
//			System.out.println(sView);
			String line;
			System.out.println("开始获得服务器信息");
		
				while ((line = reader.readLine()) != null) {
//					System.out.println("...");
					System.out.println("收到:"+line);
					cView.appendText("收到："+line);
				}
//				System.out.println("获得客户端信息结束");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("异常1");
		}
	}

}
