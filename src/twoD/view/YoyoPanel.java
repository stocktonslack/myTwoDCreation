package twoD.view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import towD.controller.YoyoController;

public class YoyoPanel extends JPanel
{
	private YoyoController baseController;
	
	public YoyoPanel (YoyoController baseController)
	{
		this.baseController = baseController;
		
		setupTable();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupTable()
	{
		String [] colNames = {"Stud 1, Stud 2"};
		DefaultTableModel yoyoModel = new DefaultTableModel(baseController.getMyYoyo(), colNames);	
		yoyoTable = new JTable(yoyoTable);
		
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(yoyoLabel);
		this.add(titleLabel);
		this.setBackground (Color.GREEN);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
