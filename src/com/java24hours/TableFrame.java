package com.java24hours;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableFrame extends JFrame {
	
	public TableFrame(){
		super("Table Frame");
		String[] columnLabels = {"First Name", "Last Name", "Job", "Age"};
		Object[][] tableData = {
				{"Frankie", "Heck", "dental hygienist", 50},
				{"Mike", "Heck", "quarry manager", 51},
				{"Sue", "Heck", "wrestlerette", 16},
				{"Brick", "Heck", "reader", 12}
		};
		JTable table = new JTable(tableData, columnLabels);
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		add(scrollPane);
		setSize(450, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	

	public static void main(String[] arguments){
		TableFrame frame = new TableFrame();
	}

}
