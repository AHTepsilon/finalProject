
public class Limiter 
{
	public Limiter()
	{
		
	}
	
	public void limitIt(int i) //loading the boundaries and physics for each tile
	{
		if(i == 1) 
		{
			if(!Principal.chickenCaptured)
			{
				if(Principal.playerY > 600)
				{
					Principal.playerY = 575;
				}
				if(Principal.playerY < 0)
				{
					Principal.playerY = 25;
				}
			}
			
			if(Principal.playerX > 600)
			{
				Principal.playerX = 575;
			}
			if(Principal.playerX < 0)
			{
				Principal.playerX = 25;
			}
			if(Principal.playerY > 600 && (Principal.playerX < 175) && (Principal.playerX > 275))
			{
				Principal.playerY = 575;
			} 
			if(Principal.playerY < 0 && Principal.playerX < 100)
			{
				Principal.playerY = 25;
			}
			
			if(Principal.playerY > 400 && Principal.playerX == 25)
			{
				Principal.playerX = 25;
				Principal.playerY = 375;
			}
			if(Principal.playerY > 400 && Principal.playerX == 75)
			{
				Principal.playerX = 75;
				Principal.playerY = 375;
			}
			if(Principal.playerY == 425 && Principal.playerX == 125)
			{
				Principal.playerX = 125;
				Principal.playerY = 375;
			}
			if(Principal.playerY == 425 && Principal.playerX == 125)
			{
				Principal.playerX = 175;
				Principal.playerY = 425;
			}
			
			if(Principal.playerX == 125 && Principal.playerY == 25)
			{
				Principal.playerX = 75;
				Principal.playerY = 25;
			}
			if(Principal.playerX == 125 && Principal.playerY == 75)
			{
				Principal.playerX = 75;
				Principal.playerY = 75;
			}
			if(Principal.playerX == 125 && Principal.playerY == 125)
			{
				Principal.playerX = 75;
				Principal.playerY = 125;
			}
			if(Principal.playerX == 125 && Principal.playerY == 175)
			{
				Principal.playerX = 75;
				Principal.playerY = 175;
			}
			if(Principal.playerX == 175 && Principal.playerY == 175)
			{
				Principal.playerX = 175;
				Principal.playerY = 225;
			}
			if(Principal.playerX == 225 && Principal.playerY == 25)
			{
				Principal.playerX = 275;;
				Principal.playerY = 25;
			}
			if(Principal.playerX == 225 && Principal.playerY == 75)
			{
				Principal.playerX = 275;;
				Principal.playerY = 75;
			}
			if(Principal.playerX == 225 && Principal.playerY == 125)
			{
				Principal.playerX = 275;;
				Principal.playerY = 125;
			}
			if(Principal.playerX == 125 && Principal.playerY == 475)
			{
				Principal.playerX = 175;
				Principal.playerY = 475;
			}
			if(Principal.playerX == 125 && Principal.playerY == 525)
			{
				Principal.playerX = 175;
				Principal.playerY = 525;
			}
			if(Principal.playerX == 125 && Principal.playerY == 575)
			{
				Principal.playerX = 175;
				Principal.playerY = 575;
			}
			if(Principal.playerX == 325 && Principal.playerY == 575)
			{
				Principal.playerX = 275;
				Principal.playerY = 575;
			}
			if(Principal.playerX == 325 && Principal.playerY == 525)
			{
				Principal.playerX = 275;
				Principal.playerY = 525;
			}
			if(Principal.playerX == 325 && Principal.playerY == 475)
			{
				Principal.playerX = 275;
				Principal.playerY = 475;
			}
			if(Principal.playerX == 325 && Principal.playerY == 425)
			{
				Principal.playerX = 275;
				Principal.playerY = 425;
			}
			if(Principal.playerX == 325 && Principal.playerY == 375)
			{
				Principal.playerX = 275;
				Principal.playerY = 375;
			}
			if(Principal.playerX == 375 && Principal.playerY == 375)
			{
				Principal.playerX = 375;
				Principal.playerY = 325;
			}
			if(Principal.playerX == 425 && Principal.playerY == 375)
			{
				Principal.playerX = 425;
				Principal.playerY = 325;
			}
			if(Principal.playerX == 475 && Principal.playerY == 375)
			{
				Principal.playerX = 475;
				Principal.playerY = 325;
			}
			if(Principal.playerX == 525 && Principal.playerY == 375)
			{
				Principal.playerX = 525;
				Principal.playerY = 325;
			}
			if(Principal.playerX == 575 && Principal.playerY == 375)
			{
				Principal.playerX = 575;
				Principal.playerY = 325;
			}
			if(Principal.playerX == 625 && Principal.playerY == 325)
			{
				Principal.playerX = 575;
				Principal.playerY = 325;
			}
			if(Principal.playerX == 625 && Principal.playerY == 275)
			{
				Principal.playerX = 575;
				Principal.playerY = 275;
			}
			if(Principal.playerX == 625 && Principal.playerY == 225)
			{
				Principal.playerX = 575;
				Principal.playerY = 225;
			}
			if(Principal.playerX == 625 && Principal.playerY == 175)
			{
				Principal.playerX = 575;
				Principal.playerY = 175;
			}
			if(Principal.playerX == 625 && Principal.playerY == 125)
			{
				Principal.playerX = 575;
				Principal.playerY = 125;
			}
			if(Principal.playerX == 625 && Principal.playerY == 75)
			{
				Principal.playerX = 575;
				Principal.playerY = 75;
			}
		}
		
		else if(i == 2)
		{
			if(!Principal.hasKey) 
			{
				if(Principal.playerX == 250 + 75 && Principal.playerY == 250 + 75)
				{
					Principal.playerY = 375;
				}
				if(Principal.playerX == 250 + 25 && Principal.playerY == 250 + 75)
				{
					Principal.playerY = 375;
				}
			}
			if(Principal.playerX > 600)
			{
				Principal.playerX = 575;
			}
			if(Principal.playerX < 0)
			{
				Principal.playerX = 25;
			}
			if(Principal.playerY < 0)
			{
				Principal.playerY = 25;
			}
			
			if(Principal.playerY == 325 && !(Principal.playerX == 275) && !(Principal.playerX == 325))
			{
				Principal.playerY = 375;
			}
			
			if(Principal.playerX == 225 && Principal.playerY == 575)
			{
				Principal.playerX = 275;
			}
			if(Principal.playerX == 225 && Principal.playerY == 525)
			{
				Principal.playerX = 275;
			}
			if(Principal.playerX == 225 && Principal.playerY == 475)
			{
				Principal.playerX = 275;
			}
			if(Principal.playerX == 175 && Principal.playerY == 475)
			{
				Principal.playerY = 425;
			}
			if(Principal.playerX == 125 && Principal.playerY == 475)
			{
				Principal.playerY = 425;
			}
			if(Principal.playerX == 75 && Principal.playerY == 475)
			{
				Principal.playerY = 425;
			}
			if(Principal.playerX == 25 && Principal.playerY == 475)
			{
				Principal.playerY = 425;
			}
		}
		
		else if(i == 3)
		{
			if(Principal.playerY == 275)
			{
				Principal.playerY = 225;
			}
			
			if(Principal.playerX == 125 && Principal.playerY == 25)
			{
				Principal.playerX = 175;
			}
			if(Principal.playerX == 125 && Principal.playerY == 75)
			{
				Principal.playerX = 175;
			}
			if(Principal.playerX == 75 && Principal.playerY == 75)
			{
				Principal.playerY = 125;
			}
			if(Principal.playerX == 25 && Principal.playerY == 75)
			{
				Principal.playerY = 125;
			}
			if(Principal.playerX == 325 && Principal.playerY == 25)
			{
				Principal.playerX = 275;
			}
			if(Principal.playerX == 325 && Principal.playerY == 75)
			{
				Principal.playerX = 275;
			}
			if(Principal.playerX == 375 && Principal.playerY == 75)
			{
				Principal.playerY = 125;
			}
			if(Principal.playerX == 425 && Principal.playerY == 75)
			{
				Principal.playerY = 125;
			}
			if(Principal.playerX == 475 && Principal.playerY == 75)
			{
				Principal.playerY = 125;
			}
			if(Principal.playerX == 525 && Principal.playerY == 75)
			{
				Principal.playerY = 125;
			}
			if(Principal.playerX == 575 && Principal.playerY == 75)
			{
				Principal.playerY = 125;
			}
			if(Principal.playerY == 375)
			{
				Principal.playerY = 425;
			}
			if(Principal.playerY == 525)
			{
				Principal.playerY = 475;
			}
		}
		
		else if(i == 4)
		{
			if(Principal.playerY == 275 && !(Principal.playerX == 325) && !(Principal.playerX == 375))
			{
				Principal.playerY = 225;
			}
			if(Principal.playerY == 375 && !(Principal.playerX == 325) && !(Principal.playerX == 375))
			{
				Principal.playerY = 425;
			}
			if(Principal.playerX == 275 && Principal.playerY == 325)
			{
				Principal.playerX = 325;
			}
			if(Principal.playerX == 425 && Principal.playerY == 325)
			{
				Principal.playerX = 375;
			}
			if(Principal.playerY == 75)
			{
				Principal.playerY = 125;
			}
			if(Principal.playerY == 525)
			{
				Principal.playerY = 475;
			}
			if(Principal.playerX == 575)
			{
				Principal.playerX = 525;
			}
			if(Principal.playerX == 525 && Principal.playerY == 125)
			{
				Principal.playerX = 475;
			}
		}
		
		else if(i == 5)
		{
			if(!Principal.hasSword)
			{
				if(Principal.playerY == 625)
				{
					Principal.playerY = 575;
				}
			}
			
			
			if(Principal.playerX < 0)
			{
				Principal.playerX = 25;
			}
			if(Principal.playerX > 275 && Principal.playerY == 275)
			{
				Principal.playerY = 225;
			}
			
			if(Principal.playerY > 300 && Principal.playerX == 325)
			{
				Principal.playerX = 275;
			}
			
			if(Principal.playerX > 75 && Principal.playerY == 525)
			{
				Principal.playerY = 475;
			}
			
			if(Principal.playerX >= 475 && Principal.playerY == 375)
			{
				Principal.playerY = 425;
			}
			
			if(Principal.playerX == 425 && Principal.playerY > 300)
			{
				Principal.playerX = 475;
			}
			
			if(Principal.playerY == 75)
			{
				Principal.playerY = 125;
			}
			
			if(Principal.playerX == 175 && Principal.playerY == 125)
			{
				Principal.playerX = 225;
			}
			
			if(Principal.playerX == 125 && Principal.playerY == 175)
			{
				Principal.playerX = 175;
			}
			
			if(Principal.playerX == 125 && Principal.playerY == 575)
			{
				Principal.playerX = 75;
			}
			
			if(Principal.playerX == 75 && Principal.playerY == 225)
			{
				Principal.playerX = 125;
			}
			
			if(Principal.playerX == 25 && Principal.playerY == 275)
			{
				Principal.playerX = 75;
			}
		}
		
		else if(i == 6)
		{
			if(Principal.playerX < 0)
			{
				Principal.playerX = 25;
			}
			
			if(Principal.playerX == 325)
			{
				Principal.playerX = 275;
			}
			
			if(Principal.playerX == 175 && Principal.playerY < 175)
			{
				Principal.playerX = 125;
			}
			
			if(Principal.playerY == 125 && Principal.playerX > 175)
			{
				Principal.playerY = 175;
			}
		}
		
		else if(i == 7)
		{
			if(Principal.playerX < 0 && !(Principal.playerY == 325) && !(Principal.playerY == 375))
			{
				Principal.playerX = 25;
			}
			
			if(Principal.playerX == 325 && !(Principal.playerY == 225) && !(Principal.playerY == 275) && !(Principal.playerY == 325))
			{
				Principal.playerX = 275;
			}
			
			if(Principal.playerY == 175 && Principal.playerX > 275)
			{
				Principal.playerY = 225;
			}
			
			if(Principal.playerY == 375 && Principal.playerX > 275)
			{
				Principal.playerY = 325;
			}
		}
		
		else if(i == 8)
		{
			if(Principal.playerY == 275 && Principal.playerX > 225)
			{
				Principal.playerY = 325;
			}
			if(Principal.playerY == 425 && Principal.playerX > 225)
			{
				Principal.playerY = 375;
			}
			if(Principal.playerX == 25)
			{
				Principal.playerX = 75;
			}
			if(Principal.playerY == 225)
			{
				Principal.playerY = 275;
			}
			if(Principal.playerY == 475)
			{
				Principal.playerY = 425;
			}
		}
		
		else if(i == 9)
		{
			if(Principal.playerX < 0)
			{
				Principal.playerX = 25;
			}
			if(Principal.playerY == 475)
			{
				Principal.playerY = 425;
			}
			if(Principal.playerX == 375)
			{
				Principal.playerX = 325;
			}
		}
		
		else if(i == 10)
		{
			if(Principal.playerY < 0)
			{
				Principal.playerY = 25;
			}
			if(Principal.playerY > 575)
			{
				Principal.playerY = 575;
			}
			if(Principal.playerY == 175 && Principal.playerX < 375)
			{
				Principal.playerY = 225;
			}
			if(Principal.playerY == 375 && Principal.playerX < 375)
			{
				Principal.playerY = 325;
			}
			if(Principal.playerX == 325 && !(Principal.playerY == 325) && !(Principal.playerY == 275) && !(Principal.playerY == 225))
			{
				Principal.playerX = 375;
			}
			if(Principal.playerX == 475)
			{
				Principal.playerX = 425;
			}
		}
	}
}
