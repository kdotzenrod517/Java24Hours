package com.java24hours;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NewColorFrame extends JFrame {
	
	JButton red, green, blue;
	
	public NewColorFrame() {
		super("NewColorFrame");
		setLookAndFeel();
		setSize(322, 122);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		red = new JButton("Red");
		add(red);
		green = new JButton("Green");
		add(green);
		blue = new JButton("Blue");
		add(blue);
		//being Lambda expression
		ActionListener act = (event) -> {
				if (event.getSource() == red){
					getContentPane().setBackground(Color.RED);
				}
				if (event.getSource() == green){
					getContentPane().setBackground(Color.GREEN);
				}
				if (event.getSource() == blue){
					getContentPane().setBackground(Color.BLUE);
			}
		};
		
		red.addActionListener(act);
		green.addActionListener(act);
		blue.addActionListener(act);
		setVisible(true);
		
	}
	
	
	private void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc){
			//ignore
		}
	}
	
	public static void main(String[] arguments){
		new NewColorFrame();
	}


}
