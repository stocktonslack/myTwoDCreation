package twoD.view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

import towD.controller.YoyoController;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class YoyoPanel extends JPanel
{
	private YoyoController baseController;
	
	private SpringLayout baseLayout;
	
	private JTable yoyoTable;
	
	private JScrollPane tablePane;
	
	JLabel yoyoLabel = new JLabel("Cool");
	
	JLabel titleLabel = new JLabel("My Yoyo Table");
	private JTable table;
	private JTable yoyoTables;
	
	public YoyoPanel (YoyoController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.NORTH, yoyoLabel, 38, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, yoyoLabel, 130, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, titleLabel, 177, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, titleLabel, -276, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, titleLabel, -197, SpringLayout.EAST, this);
		
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
		
	}

	private void setupTable()
	{
		String [] colNames = {"Stud 1, Stud 2"};
		DefaultTableModel yoyoModel = new DefaultTableModel(baseController.getMyYoyo(), colNames);	
		yoyoTable = new JTable(yoyoModel);
		tablePane = new JScrollPane(yoyoTable);
		
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		//
		this.add(yoyoLabel);
		//
		this.add(titleLabel);
		//sets background color to Green
		this.setBackground (Color.GREEN);
		
		yoyoTable = new JTable();
		baseLayout.putConstraint(SpringLayout.NORTH, table, 21, SpringLayout.SOUTH, yoyoLabel);
		baseLayout.putConstraint(SpringLayout.WEST, table, 391, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, table, -45, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, table, -391, SpringLayout.EAST, this);
		add(table);
		
		yoyoTables = new JTable();
		baseLayout.putConstraint(SpringLayout.NORTH, yoyoTables, 33, SpringLayout.SOUTH, yoyoLabel);
		baseLayout.putConstraint(SpringLayout.WEST, yoyoTables, -73, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, yoyoTables, 186, SpringLayout.SOUTH, yoyoLabel);
		baseLayout.putConstraint(SpringLayout.EAST, yoyoTables, -72, SpringLayout.EAST, this);
		add(yoyoTables);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
