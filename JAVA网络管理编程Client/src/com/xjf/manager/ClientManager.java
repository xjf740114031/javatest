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
			cView=new ClientView("�ͻ���");
			cView.setSize(200,400);
			cView.setVisible(true);
			System.out.println("�ͻ��˿���");
			socket=new Socket("127.0.0.1",8998);
			System.out.println("�ͻ����׽����Ѿ������ɹ�");
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
			System.out.println("��ʼ��÷�������Ϣ");
		
				while ((line = reader.readLine()) != null) {
//					System.out.println("...");
					System.out.println("�յ�:"+line);
					cView.appendText("�յ���"+line);
				}
//				System.out.println("��ÿͻ�����Ϣ����");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�쳣1");
		}
	}

}
