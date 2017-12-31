package com.xjf.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class ClientView extends JFrame{
	private PrintWriter writer;
	private JTextArea ta=new JTextArea();
	private JTextField tf=new JTextField();
	Container cc;
	public ClientView(String title){
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cc=this.getContentPane();
		final JScrollPane scrollPane=new JScrollPane();
		scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
		cc.add(scrollPane,BorderLayout.CENTER);
		scrollPane.setViewportView(ta);
		cc.add(tf,"South");
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//将文本框中的信息写入流
				writer.println(tf.getText());
				//将文本框中的信息显示在文本域中
				ta.append(tf.getText()+'\n');
				ta.setSelectionEnd(ta.getText().length());
				tf.setText("");
			}
		});
		
	}
	public void appendText(String in) {
		ta.append(in+"\n");
	}
	public void setWriter(PrintWriter printWriter) {
		writer=printWriter;
	}
}
