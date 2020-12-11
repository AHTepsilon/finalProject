import processing.core.PApplet;
import processing.core.PImage;

public class Enemy 
{
	int x;
	int y;
	
	boolean isAlive;
	
	PImage enemy, enemyDead;
	PImage chicken;
	
	public Enemy(int x, int y, boolean isAlive, PApplet app) //creating and dropping enemies
	{
		this.x = x;
		this.y = y;
		
		this.isAlive = isAlive;
		
		this.enemy = app.loadImage("enemy.png");
		this.enemyDead = app.loadImage("enemyDead.png");
		this.chicken = app.loadImage("chicken.png");
	}
	
	public void paint(PApplet app)
	{
		app.fill(0, 0, 255);
		app.stroke(0);
		app.strokeWeight(2);
		
		if(isAlive)
		{
			app.image(enemy, x-25, y-25);
		}
	}
	
	public void paintChicken(PApplet app) //load the chicken for the chicken puzzle
	{
		app.image(chicken, x - 25, y - 25);
	}
	
	public void moveUp()
	{
		y--;
	}
	
	public void moveDown()
	{
		y++;
	}
	
	public void moveRight()
	{
		x++;
	}
	
	public void moveLeft()
	{
		x--;
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
