import processing.core.PApplet;

public class companionHintAndStages 
{
	public companionHintAndStages()
	{
		
	}
	
	@SuppressWarnings("static-access")
	public void stager(int stageConfig, PApplet app) //loading and configurating each stage
	{
		if(stageConfig == 1)
		{
			
			app.text("Press 'Z' to interact", 375, 450);
			
			if(Principal.playerY == -25)
			{
				Principal.playerY = 575;
				Principal.stage = 2;
			}
			
			if(Principal.playerY == 625)
			{
				Principal.playerY = 25;
				Principal.stage = 3;
			}
		}
		
		if(Principal.stage == 2)
		{
			if(Principal.playerY == 625)
			{
				Principal.stage = 1;
				Principal.playerY = 25;
			}
		}
		if(Principal.stage == 3)
		{
			
			if(app.keyPressed)
			{
				if(app.key == 'z' && app.dist(Principal.playerX, Principal.playerY, 175, 475) < 75)
				{
					Principal.hasSword = true;
					app.text("You found a sword... with four blades \n Press 'X' to attack", 255, 525);
				}
			}
			
			if(Principal.playerY == -25)
			{
				Principal.stage = 1;
				Principal.playerY = 575;
			}
			if(Principal.playerX == 625)
			{
				Principal.stage = 4;
				Principal.playerX = 25;
			}
			if(Principal.playerX == -25)
			{
				Principal.stage = 5;
				Principal.playerX = 575;
			}
		}
		
		if(Principal.stage == 4)
		{
			
			if(Principal.playerX == -25)
			{
				Principal.stage = 3;
				Principal.playerX = 575;
			}
		}
		
		if(Principal.stage == 5) 
		{
			
			if(Principal.playerX == 625)
			{
				Principal.stage = 3;
				Principal.playerX = 25;
			}
			
			if(Principal.playerY == 625)
			{
				Principal.stage = 6;
				Principal.playerY = 25;
			}
		}
		
		if(Principal.stage == 6)
		{
			
			if(Principal.playerY == -25)
			{
				Principal.stage = 5;
				Principal.playerY = 575;
			}
		
			if(Principal.playerY == 625)
			{
				Principal.stage = 7;
				Principal.playerY = 25;
			}
		}
		
		if(Principal.stage == 7)
		{
			
			if(Principal.playerY == -25)
			{
				Principal.stage = 6;
				Principal.playerY = 575;
			}
			if(Principal.playerX == -25)
			{
				Principal.stage = 8;
				Principal.playerX = 575;
			}
			if(Principal.playerX == 625)
			{
				Principal.stage = 10;
				Principal.playerX = 25;
			}
			if(Principal.playerY == 625)
			{
				Principal.stage = 9;
				Principal.playerY = 25;
			}
		}
		if(Principal.stage == 8)
		{
			if(Principal.playerX == 625)
			{
				Principal.stage = 7;
				Principal.playerX = 25;
			}
			
		}
		if(Principal.stage == 9)
		{
			if(Principal.playerY == -25)
			{
				Principal.stage = 7;
				Principal.playerY = 575;
			}
		}
		if(Principal.stage == 10)
		{
			if(Principal.playerX == -25)
			{
				Principal.stage = 7;
				Principal.playerX = 575;
			}
		}
	}
}
