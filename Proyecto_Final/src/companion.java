import processing.core.PApplet;
import processing.core.PImage;

public class companion 
{
	int x;
	int y;
	
	PImage dog;
	
	String hint;
	
	int xDialog;
	int yDialog;
	
	public companion(int x, int y, String hint, int xDialog, int yDialog, PApplet app) //this class controls the companions in each stage
	{
		this.x = x;
		this.y = y;
		this.hint = hint;
		this.xDialog = xDialog;
		this.yDialog = yDialog;
		
		dog = app.loadImage("dog.png");
	}
	
	public void paint(PApplet app)
	{
		app.stroke(0);
		app.fill(255);
		app.rect(xDialog, yDialog, 200, 50);
		
		app.fill(255, 0, 0);
		//app.circle(x, y, 15);
		app.image(dog, x - 35, y);
	}
	
	public void hint(PApplet app)
	{
		app.fill(0);
		app.text(hint, xDialog + 25, yDialog + 25);
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	
}
