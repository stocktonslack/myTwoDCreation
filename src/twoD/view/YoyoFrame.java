package twoD.view;

import javax.swing.JFrame;

import towD.controller.YoyoController;

public class YoyoFrame extends JFrame
{
	private YoyoPanel appPanel;
	
	public YoyoFrame(YoyoController baseController)
	{
		appPanel = new YoyoPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(300,500);
		this.setContentPane(appPanel);
		this.setResizable(true);
		this.setVisible(true);
	}
	
	
}
