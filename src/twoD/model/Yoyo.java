package twoD.model;

public class Yoyo
{
	private String name;
	private int price;
	private String color;
	private boolean isCool;

	@Override
	public String toString()
	{
		String yoyoString = "";
		yoyoString += "Why hello there, I am a yoyo and my name is " + name + ".";
		yoyoString += "I am " + price + "and a cool " + color + "and";
		if(isCool)
		{
			yoyoString += " I am too legit to quit.";
		}
		else
		{
			yoyoString += " I am a sad and boring yoyo.";
		}
		
		return yoyoString;
	}

	public String getName()
	{
		return name;
	}

	public int getPrice()
	{
		return price;
	}

	public String getColor()
	{
		return color;
	}

	public boolean isCool()
	{
		return isCool;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public void setCool(boolean isCool)
	{
		this.isCool = isCool;
	}
}
