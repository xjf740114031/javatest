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
			sView=new ServerView("������");
			sView.setSize(200,400);
			sView.setVisible(true);
			System.out.println("����������");
			serverSocket=new ServerSocket(8998);
			System.out.println("�������׽����Ѿ������ɹ�");
			while(true){
				System.out.println("�ȴ��ͻ���������");
				socket=serverSocket.accept();
				System.out.println("�ͻ���������");
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
			System.out.println("��ʼ��ÿͻ�����Ϣ");
		
				while ((line = reader.readLine()) != null) {
//					System.out.println("...");
					System.out.println("�յ�:"+line);
					sView.appendText("�յ���"+line);
				}
//				System.out.println("��ÿͻ�����Ϣ����");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�쳣1");
		}
	}

}
