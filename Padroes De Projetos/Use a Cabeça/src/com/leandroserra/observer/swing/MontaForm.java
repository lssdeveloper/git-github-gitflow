package com.leandroserra.observer.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MontaForm {
	JFrame frame;
	
	public void go(){
		frame = new JFrame("fazer ou não fazer?Eis a questão.");
		
		JButton btn = new JButton("Devo fazer isso?");
		btn.addActionListener(new Amigo());
		btn.addActionListener(new Inimigo());
		frame.getContentPane().add(BorderLayout.CENTER, btn);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, btn);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
