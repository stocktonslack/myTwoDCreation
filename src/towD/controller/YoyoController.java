package towD.controller;

import javax.swing.JOptionPane;

import twoD.model.Yoyo;
import twoD.view.YoyoFrame;

public class YoyoController
{
	private Yoyo[][] myYoyo;
	private YoyoFrame appFrame;
	
	public YoyoController()
	{
		myYoyo = new Yoyo[3][2];
		
		fillMyYoyoArray();
		
		appFrame = new YoyoFrame(this);
	}
	
	private void fillMyYoyoArray()
	{
		for(int row = 0; row < myYoyo.length; row ++)
		{
			for(int col = myYoyo[row].length-1; col >= 0; col --)
			{
				String name = row + col + "Yoyo";
				int price = (int) (Math.random() * 12);
				boolean isCool = (price % 2 == 0);
				
				myYoyo [row][col] = new Yoyo();
			}
		}
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "This is the best Yoyo app thing");
	}

	public Object[][] getMyYoyo()
	{
		return null;
	}
	
}
