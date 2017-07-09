package com.java24hours;

import javax.swing.*;
import java.awt.*;

public class Playback extends JFrame {
	
	public Playback(){
		super("Playback");
		setLookAndFeel();
		setSize(255,80);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		JLabel pageLabel = new JLabel ("Web page address: ", JLabel.RIGHT);
		JTextField pageAddress = new JTextField("Web address here", 20);
		JButton play = new JButton("Play");
		JButton stop = new JButton("Stop");
		JButton pause = new JButton("Pause");
		add(play);
		add(stop);
		add(pause);
		add(pageLabel);
		add(pageAddress);
		JComboBox profession = new JComboBox();
		profession.addItem("Butcher");
		profession.addItem("Baker");
		add(profession);
		profession.setEditable(true);
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
		Playback frame = new Playback();
	}
	

}
