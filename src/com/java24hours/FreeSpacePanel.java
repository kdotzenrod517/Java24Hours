package com.java24hours;

import java.nio.file.*;
import javax.swing.*;
import java.io.IOException;

public class FreeSpacePanel extends JPanel{
	
	JLabel spaceLabel = new JLabel("Disk space: ");
	JLabel space = new JLabel();
	
	public FreeSpacePanel(){
		super();
		add(spaceLabel);
		add(space);
		try {
			setValue();
		} catch (IOException ioe){
			space.setText("Error");
		}
	}
	
	private final void setValue() throws IOException{
		Path current = Paths.get("");
		FileStore store = Files.getFileStore(current);
		long totalSpace = store.getTotalSpace();
		long freeSpace = store.getUsableSpace();
		double percent = (double)freeSpace/(double)totalSpace * 100;
		percent = (int)(percent * 100)/(double)100;
		space.setText(freeSpace + " free out of " + totalSpace + " (" + percent + "%)");
	}
	

}
