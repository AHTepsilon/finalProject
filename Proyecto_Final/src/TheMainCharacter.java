import processing.core.PApplet;

public class TheMainCharacter 
{
	int x;
	int y;
	
	public TheMainCharacter(int x, int y) //the main character class simply creates the object
	{
		this.x = x;
		this.y = y;
	}
	
	public void paint(PApplet app)
	{
		app.fill(255, 0, 0);
		app.noStroke();
		//app.circle(x, y, 10);
	}
	
	public int getX() 
	{
		return x;
	}
	
	public int getY() 
	{
		return y;
	}
	
	public void setX(int x) 
	{
		this.x = x;
	}
	
	public void setY(int y) 
	{
		this.y = y;
	}

}
