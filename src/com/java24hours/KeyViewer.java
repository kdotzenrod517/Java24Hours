package com.java24hours;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyViewer extends JFrame implements KeyListener {
	
	JTextField keyText = new JTextField(80);
	JLabel keyLabel = new JLabel ("Press any key in the text field.");
	
	public KeyViewer(){
		super("KeyViewer");
		setLookAndFeel();
		setSize(350, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		keyText.addKeyListener(this);
		BorderLayout bord = new BorderLayout();
		setLayout(bord);
		add(keyLabel, BorderLayout.NORTH);
		add(keyText, BorderLayout.CENTER);
		setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent input) {
		char key = input.getKeyChar();
		keyLabel.setText("You pressed " + key);
	}

	@Override
	public void keyPressed(KeyEvent txt) {
		
	}

	@Override
	public void keyReleased(KeyEvent txt) {

	}
	
	private void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc){
			//ignore
		}
	}
	
	public static void main(String[] arguments){
		KeyViewer frame = new KeyViewer();
	}


}
