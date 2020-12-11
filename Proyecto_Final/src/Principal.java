import processing.core.PApplet;
import processing.core.PImage;

public class Principal extends PApplet
{

	public static void main(String[] args) 
	{
		PApplet.main("Principal");
	}
	
	@Override
	public void settings() //void Awake
	{
		size(600, 600);
	}

	int dirtPathColor;
	TheMainCharacter player;
	static public int playerX, playerY;

	PImage dirtTiles;
	
	PImage characterDown, characterUp, characterLeft, characterRight, characterWalkRight, characterWalkLeft, characterWalkUp, characterWalkDown;
	
	PImage healthyHeart, brokenHeart;
	
	PImage door;
	
	PImage sword;
	
	PImage leverOne, leverTwo;
	
	PImage keyKey;
	
	Tilemap tilemap;
	Limiter limiter;
	
	int doorX, doorY;
	
	int healthyHeartOneX, healthyHeartOneY, healthyHeartTwoX, healthyHeartTwoY, healthyHeartThreeX, healthyHeartThreeY, health;
	
	companion stageOneCompanion, stageTwoCompanion, stageThreeCompanion, stageFourCompanion, stageFiveCompanion, stageSixCompanion, stageSevenCompanion;
	
	Enemy enemyStageSix, enemyStageSixTwo, enemyStageSeven, enemyStageSevenTwo, enemyStageSevenThree;
	Enemy enemyStageNine, enemyStageNineTwo, enemyStageTen, enemyStageTenTwo;
	Enemy firstChicken;
	
	static public boolean chickenCaptured;
	
	int enemyX1, enemyY1, enemyX2, enemyY2, enemyX3, enemyX4, enemyX5, enemyY3, enemyY4, enemyY5;
	
	int invFrames;
	boolean invFramesActive;
	
	boolean switchOne, switchTwo, switchThree, allSwitches;
	static public boolean hasKey;
	static public boolean hasSword;
	
	companionHintAndStages cominsta;
	
	static public int stage;
	
	@Override
	public void setup() //void Start
	{
		dirtPathColor = color(121, 89, 56);
		player = new TheMainCharacter(25, 25);
		
		playerX = player.getX();
		playerY = player.getY();
		
		dirtTiles = loadImage("TL14.png");
		
		door = loadImage("door.png");
		
		sword = loadImage("sword.png");
		
		leverOne = loadImage("LeverOne.png");
		leverTwo = loadImage("LeverTwo.png");
		
		keyKey = loadImage("key.png");
		
		characterDown = loadImage("Character1.png");
		characterLeft = loadImage("Character4.png");
		characterRight = loadImage("Character7.png");
		characterUp = loadImage("Character10.png");
		
		characterWalkDown = loadImage("Character2.png");
		characterWalkUp = loadImage("Character11.png");
		characterWalkLeft = loadImage("Character5.png");
		characterWalkRight = loadImage("Character8.png");
		
		stage = 1;
		
		doorX = 250;
		doorY = 250;
		
		hasKey = false;
		
		tilemap = new Tilemap(this);
		limiter = new Limiter();
		cominsta = new companionHintAndStages();
		
		enemyStageSix = new Enemy(50, 300, true, this);
		enemyStageSixTwo = new Enemy(150, 300, true, this);
		enemyStageSeven = new Enemy(50, 300, true, this);
		enemyStageSevenTwo = new Enemy(100, 350, true, this);
		enemyStageSevenThree = new Enemy(400, 250, true, this);
		enemyStageNine = new Enemy(250, 400, true, this);
		enemyStageNineTwo = new Enemy(250, 300, true, this);
		enemyStageTen = new Enemy(300, 250, true, this);
		enemyStageTenTwo = new Enemy(350, 250, true, this);
		
		firstChicken = new Enemy(425, 125, true, this);
		
		enemyX1 = enemyStageSix.getX();
		enemyX2 = enemyStageSixTwo.getX();
		enemyY1 = enemyStageSix.getY();
		enemyY2 = enemyStageSixTwo.getY();
		
		enemyX3 = enemyStageSeven.getX();
		enemyY3 = enemyStageSeven.getY();
		enemyX4 = enemyStageSevenTwo.getX();
		enemyY4 = enemyStageSevenTwo.getY();
		enemyX5 = enemyStageSevenThree.getX();
		enemyY5 = enemyStageSevenThree.getY();
		
		stageOneCompanion = new companion(575, 275, "Capture the chicken to \n continue", 375, 375, this);
		stageTwoCompanion = new companion(375, 375, "The castle's door seems locked, \n we need a key", 375, 275, this);
		stageThreeCompanion = new companion(525, 125, "There's a barrel on the other \n side of the river.", 325, 25, this);
		stageFourCompanion = new companion(475, 125, "Perhaps you can reach the other \n side with this bridge", 375, 25, this);
		stageFiveCompanion = new companion(275, 275, "You might need a weapon \n for the next part", 325, 275, this);
		stageSixCompanion = new companion(275, 175, "Be careful with those globs \n they are very toxic", 275, 75, this);
		stageSevenCompanion = new companion(275, 375, "There are three roads,\n you should go left first", 325, 375, this);
	}
	
	@Override
	public void draw() //void Update
	{		
		background(dirtPathColor);
		System.out.println(playerX + ", " + playerY);
		textSize(10);
		
		strokeWeight(1);
		stroke(0);
		noFill();
		
		//Fill the window with the brown dirt tiles
		for(int xM = 0; xM < 600; xM += 50)
		{
			for(int yM = 0; yM < 600; yM += 50)
			{
				square(xM, yM, 50);
				image(dirtTiles, xM, yM);
			}
		}
		
		player.paint(this);
		player.setX(playerX);
		player.setY(playerY);

		switch(stage) //switches which tilemap and which limiter shall be loaded depending on the "stage" variable
		{
			case 1:
				tilemap(1);
				limiter(1);
				break;
			case 2:
				tilemap(2);
				limiter(2);
				break;
			case 3:
				tilemap(3);
				limiter(3);
				break;
			case 4:
				tilemap(4);
				limiter(4);
				break;
			case 5:
				tilemap(5);
				limiter(5);
				break;
			case 6:
				tilemap(6);
				limiter(6);
				break;
			case 7:
				tilemap(7);
				limiter(7);
				break;
			case 8:
				tilemap(8);
				limiter(8);
				break;
			case 9:
				tilemap(9);
				limiter(9);
				break;
			case 10:
				tilemap(10);
				limiter(10);
				break;
		}
		
		//the little block of method-calling, ain't it pretty?
		companionHintAndStages();
		characterMovement();
		attack();
		switches();
		victory();
		enemies();
		chickenPuzzle();
	
	}
	
	public void keyPressed() //upon pressing a key
	{
		switch(key) //movement of the character
		{
		case 'w':
			playerY -= 50;
			break;
		case 'W':
			playerY -= 50;
			break;
		case 's':
			playerY += 50;
			break;
		case 'S':
			playerY += 50;
			break;
		case 'a':
			playerX -= 50;
			break;
		case 'A':
			playerX -= 50;
			break;
		case 'd':
			playerX += 50;
			break;
		case 'D':
			playerX += 50;
			break;
		}
		
		switch(key) //DEBUG quick stage changer, TO BE USED ONLY DURING DEBUGING AND TESTING
		{
		case '1':
			stage = 1;
			break;
		case '2':
			stage = 2;
			break;
		case '3':
			stage = 3;
			break;
		case '4':
			stage = 4;
			break;
		case '5':
			stage = 5;
			break;
		case '6':
			stage = 6;
			break;
		case '7':
			stage = 7;
			break;
		case '8':
			stage = 8;
			break;
		case '9':
			stage = 9;
			break;
		case '0':
			stage = 10;
			break;
		}
		
	}
	
	public void tilemap(int i) //load the tilemaps from the Tilemap class
	{	
		if(i == 1)
		{
			tilemap.display(1, this);
		}
		if(i == 2)
		{
			tilemap.display(2, this);
			
			if(!hasKey)
			{
				image(door, doorX, doorY);
				image(door, doorX + 50, doorY);
				image(door, doorX, doorY + 50);
				image(door, doorX + 50, doorY + 50);
			}
		}
		if(i == 3)
		{
			tilemap.display(3, this);
		}
		if(i == 4)
		{
			tilemap.display(4, this);
		}
		if(i == 5)
		{
			tilemap.display(5, this);
		}
		if(i == 6)
		{
			tilemap.display(6, this);
		}
		if(i == 7)
		{
			tilemap.display(7, this);
		}
		if(i == 8)
		{
			tilemap.display(8, this);
		}
		if(i == 9)
		{
			tilemap.display(9, this);
		}
		if(i == 10)
		{
			tilemap.display(10, this);
		}
}
	
	public void limiter(int i) //load the limiters from the Limiter class
	{
		if(i == 1)
		{
			limiter.limitIt(1);
		}
		if(i == 2)
		{
			limiter.limitIt(2);
		}
		if(i == 3)
		{
			limiter.limitIt(3);
		}
		if(i == 4)
		{
			limiter.limitIt(4);
		}
		if(i == 5)
		{
			limiter.limitIt(5);
		}
		if(i == 6)
		{
			limiter.limitIt(6);
		}
		if(i == 7)
		{
			limiter.limitIt(7);
		}
		if(i == 8)
		{
			limiter.limitIt(8);
		}
		if(i == 9)
		{
			limiter.limitIt(9);
		}
		if(i == 10)
		{
			limiter.limitIt(10);
		}	
}
	
	public void companionHintAndStages() //load the stages' configuration from the companionHintAndStages class
	{
		if(stage == 1)
		{
			stageOneCompanion.paint(this);
			cominsta.stager(1, this);
		}
		if(stage == 2)
		{
			stageTwoCompanion.paint(this);
			cominsta.stager(2, this);
		}
		if(stage == 3)
		{
			stageThreeCompanion.paint(this);
			cominsta.stager(3, this);
		}
		if(stage == 4)
		{
			stageFourCompanion.paint(this);
			cominsta.stager(4, this);
		}
		if(stage == 5)
		{
			stageFiveCompanion.paint(this);
			cominsta.stager(5, this);
		}
		if(stage == 6)
		{
			stageSixCompanion.paint(this);
			cominsta.stager(6, this);
		}
		if(stage == 7)
		{
			stageSevenCompanion.paint(this);
			cominsta.stager(7, this);
		}
		if(stage == 8)
		{
			cominsta.stager(8, this);
		}
		if(stage == 9)
		{
			cominsta.stager(9, this);
		}
		if(stage == 10)
		{
			cominsta.stager(10, this);
		}
		
		//didn't want to transfer these lines to the class because they reference another class
		if((dist(playerX, playerY, stageOneCompanion.getX(), stageOneCompanion.getY()) < 100) && keyPressed && stage == 1)
		{
			if(key == 'Z' || key == 'z') 
			{
				stageOneCompanion.hint(this);
			}
		}
		if((dist(playerX, playerY, stageTwoCompanion.getX(), stageTwoCompanion.getY()) < 100) && keyPressed && stage == 2)
		{
			if(key == 'Z' || key == 'z') 
			{
				stageTwoCompanion.hint(this);
			}
		}
		if((dist(playerX, playerY, stageThreeCompanion.getX(), stageThreeCompanion.getY()) < 100) && keyPressed && stage == 3)
		{
			if(key == 'Z' || key == 'z') 
			{
				stageThreeCompanion.hint(this);
			}
		}
		if((dist(playerX, playerY, stageFourCompanion.getX(), stageFourCompanion.getY()) < 100) && keyPressed && stage == 4)
		{
			if(key == 'Z' || key == 'z') 
			{
				stageFourCompanion.hint(this);
			}
		}
		if((dist(playerX, playerY, stageFiveCompanion.getX(), stageFiveCompanion.getY()) < 100) && keyPressed && stage == 5)
		{
			if(key == 'Z' || key == 'z') 
			{
				stageFiveCompanion.hint(this);
			}
		}
		if((dist(playerX, playerY, stageSixCompanion.getX(), stageSixCompanion.getY()) < 100) && keyPressed && stage == 6)
		{
			if(key == 'Z' || key == 'z') 
			{
				stageSixCompanion.hint(this);
			}
		}
		if((dist(playerX, playerY, stageSevenCompanion.getX(), stageSevenCompanion.getY()) < 100) && keyPressed && stage == 7)
		{
			if(key == 'Z' || key == 'z') 
			{
				stageSevenCompanion.hint(this);
			}
		}
	}
	
	public void characterMovement() //despite its name, this method actually changes the sprite for the character depending on the key pressed
	{
		if(keyPressed) 
		{
			if(key == 'w' || key == 'W') //up
			{
				image(characterWalkUp, playerX - 25, playerY - 25);
			}
			else if(key == 's' || key == 'S') //down
			{
				image(characterWalkDown, playerX - 25, playerY - 25);
			}
			else if(key == 'd' || key == 'D') //right
			{
				image(characterWalkRight, playerX - 25, playerY - 25);
			}
			else if(key == 'a' || key == 'A') //left
			{
				image(characterWalkLeft, playerX - 25, playerY - 25);
			}
			else
			{
				image(characterDown, playerX - 25, playerY - 25); //neutral position 
			}
		}
		else
		{
			image(characterDown, playerX - 25, playerY - 25); //neutral position 
		}
	}
	
	//function regarding the behaviour for the enemies, didn't want to move it to a class because it references another class
	public void enemies() 
	{
		if(stage == 6)
		{
			enemyStageSix.paint(this);
			enemyStageSixTwo.paint(this);
			
			if(playerY > enemyStageSix.getY())
			{
				enemyStageSix.moveDown();
			}
			else if(playerY < enemyStageSix.getY())
			{
				enemyStageSix.moveUp();
			}
			if(playerY < enemyStageSixTwo.getY())
			{
				enemyStageSixTwo.moveUp();
			}
			else if(playerY > enemyStageSixTwo.getY())
			{
				enemyStageSixTwo.moveDown();
			}
			
			if(playerX > enemyStageSix.getX())
			{
				enemyStageSix.moveRight();
			}
			else if(playerX < enemyStageSix.getX())
			{
				enemyStageSix.moveLeft();
			}
			if(playerX > enemyStageSixTwo.getX())
			{
				enemyStageSixTwo.moveRight();
			}
			else if(playerX < enemyStageSixTwo.getX())
			{
				enemyStageSixTwo.moveLeft();
			}
			
			if((playerX == enemyStageSix.getX()) && (playerY == enemyStageSix.getY()))
			{
				gameOver();
			}
			if((playerX == enemyStageSixTwo.getX()) && (playerY == enemyStageSixTwo.getY()))
			{
				gameOver();
			}
			
			if(keyPressed) 
			{
				if(dist(playerX, playerY, enemyStageSix.getX(), enemyStageSix.getY())< 40 && (key == 'x' || key == 'X') && hasSword)
				{
					enemyStageSix.setY(90000);
				}
				if(dist(playerX, playerY, enemyStageSixTwo.getX(), enemyStageSixTwo.getY())< 40 && (key == 'x' || key == 'X') && hasSword)
				{
					enemyStageSixTwo.setY(90000);
				}
			}
		}
		
		if(stage == 7)
		{
			enemyStageSeven.paint(this);
			enemyStageSevenTwo.paint(this);
			enemyStageSevenThree.paint(this);
			
			if(playerY > enemyStageSeven.getY())
			{
				enemyStageSeven.moveDown();
			}
			else if(playerY < enemyStageSeven.getY())
			{
				enemyStageSeven.moveUp();
			}
			if(playerY < enemyStageSevenTwo.getY())
			{
				enemyStageSevenTwo.moveUp();
			}
			else if(playerY > enemyStageSevenTwo.getY())
			{
				enemyStageSevenTwo.moveDown();
			}
			if(playerY > enemyStageSevenThree.getY())
			{
				enemyStageSevenThree.moveDown();
			}
			else if(playerY < enemyStageSevenThree.getY())
			{
				enemyStageSevenThree.moveUp();
			}
			
			if(playerY > enemyStageSeven.getX())
			{
				enemyStageSeven.moveRight();
			}
			else if(playerY < enemyStageSeven.getX())
			{
				enemyStageSeven.moveLeft();
			}
			if(playerY < enemyStageSevenTwo.getX())
			{
				enemyStageSevenTwo.moveLeft();
			}
			else if(playerY > enemyStageSevenTwo.getX())
			{
				enemyStageSevenTwo.moveRight();
			}
			if(playerY > enemyStageSevenThree.getX())
			{
				enemyStageSevenThree.moveRight();
			}
			else if(playerY < enemyStageSevenThree.getX())
			{
				enemyStageSevenThree.moveLeft();
			}
			
			if(playerX == enemyStageSeven.getX() && playerY == enemyStageSeven.getY())
			{
				gameOver();
			}
			if(playerX == enemyStageSevenTwo.getX() && playerY == enemyStageSevenTwo.getY())
			{
				gameOver();
			}
			if(playerX == enemyStageSevenThree.getX() && playerY == enemyStageSevenThree.getY())
			{
				gameOver();
			}
			
			if(keyPressed) 
			{
				if(dist(playerX, playerY, enemyStageSeven.getX(), enemyStageSeven.getY())< 40 && (key == 'x' || key == 'X') && hasSword)
				{
					enemyStageSeven.setY(90000);
				}
				if(dist(playerX, playerY, enemyStageSevenTwo.getX(), enemyStageSevenTwo.getY())< 40 && (key == 'x' || key == 'X') && hasSword)
				{
					enemyStageSevenTwo.setY(90000);
				}
				if(dist(playerX, playerY, enemyStageSevenThree.getX(), enemyStageSevenThree.getY())< 40 && (key == 'x' || key == 'X') && hasSword)
				{
					enemyStageSevenThree.setY(90000);
				}
			}
			
		}
		
		if(stage == 9)
		{
			enemyStageNine.paint(this);
			enemyStageNineTwo.paint(this);
			
			if(playerY > enemyStageNine.getY())
			{
				enemyStageNine.moveDown();
			}
			else if(playerY < enemyStageNine.getY())
			{
				enemyStageNine.moveUp();
			}
			if(playerY < enemyStageNineTwo.getY())
			{
				enemyStageNineTwo.moveUp();
			}
			else if(playerY > enemyStageNineTwo.getY())
			{
				enemyStageNineTwo.moveDown();
			}
			
			if(playerX > enemyStageNine.getX())
			{
				enemyStageNine.moveRight();
			}
			else if(playerX < enemyStageNine.getX())
			{
				enemyStageNine.moveLeft();
			}
			if(playerX > enemyStageNineTwo.getX())
			{
				enemyStageNineTwo.moveRight();
			}
			else if(playerX < enemyStageNineTwo.getX())
			{
				enemyStageNineTwo.moveLeft();
			}
			
			if(playerX == enemyStageNine.getX() && playerY == enemyStageNine.getY())
			{
				gameOver();
			}
			if(playerX == enemyStageNineTwo.getX() && playerY == enemyStageNineTwo.getY())
			{
				gameOver();
			}
			
			if(keyPressed) 
			{
				if(dist(playerX, playerY, enemyStageNine.getX(), enemyStageNine.getY())< 40 && (key == 'x' || key == 'X') && hasSword)
				{
					enemyStageNine.setY(90000);
				}
				if(dist(playerX, playerY, enemyStageNineTwo.getX(), enemyStageNineTwo.getY())< 40 && (key == 'x' || key == 'X') && hasSword)
				{
					enemyStageNineTwo.setY(90000);
				}
			}
		}
		
		if(stage == 10)
		{
			enemyStageTen.paint(this);
			enemyStageTenTwo.paint(this);
			
			if(playerY > enemyStageTen.getY())
			{
				enemyStageTen.moveDown();
			}
			else if(playerY < enemyStageTen.getY())
			{
				enemyStageTen.moveUp();
			}
			if(playerY < enemyStageTenTwo.getY())
			{
				enemyStageTenTwo.moveUp();
			}
			else if(playerY > enemyStageTenTwo.getY())
			{
				enemyStageTenTwo.moveDown();
			}
			
			if(playerX > enemyStageTen.getX())
			{
				enemyStageTen.moveRight();
			}
			else if(playerX < enemyStageTen.getX())
			{
				enemyStageTen.moveLeft();
			}
			if(playerX > enemyStageTenTwo.getX())
			{
				enemyStageTenTwo.moveRight();
			}
			else if(playerX < enemyStageTenTwo.getX())
			{
				enemyStageTenTwo.moveLeft();
			}
			
			if(playerX == enemyStageTen.getX() && playerY == enemyStageTen.getY())
			{
				gameOver();
			}
			if(playerX == enemyStageTenTwo.getX() && playerY == enemyStageTenTwo.getY())
			{
				gameOver();
			}
			
			if(keyPressed) 
			{
				if(dist(playerX, playerY, enemyStageTen.getX(), enemyStageTen.getY())< 40 && (key == 'x' || key == 'X') && hasSword)
				{
					enemyStageTen.setY(90000);
				}
				if(dist(playerX, playerY, enemyStageTenTwo.getX(), enemyStageTenTwo.getY())< 40 && (key == 'x' || key == 'X') && hasSword)
				{
					enemyStageTenTwo.setY(90000);
				}
			}
		}
	}

	public void attack() //attack function
	{
		if(keyPressed)
		{
			if((key == 'x' || key == 'X') && hasSword)
			{
				image(sword, playerX - 75, playerY - 75);
			}
		}
	}
	
	public void switches() //controls the switches in stages 8, 9 and 10, and the key
	{
		if(stage == 8)
		{
			if(keyPressed)
			{
				if((key == 'z' || key == 'Z') && dist(playerX, playerY, 125, 325) < 75)
				{
					switchOne = true;
				}
			}
			
			if(!switchOne)
			{
				image(leverOne, 125, 325);
			}
			else if(switchOne)
			{
				image(leverTwo, 125, 325);
			}
		}
		
		if(stage == 9)
		{
			if(keyPressed)
			{
				if((key == 'z' || key == 'Z') && dist(playerX, playerY, 275, 375) < 75)
				{
					switchTwo = true;
				}
			}
			
			if(!switchTwo)
			{
				image(leverOne, 275, 375);
			}
			else if(switchTwo)
			{
				image(leverTwo, 275, 375);
			}
		}
		
		if(stage == 10)
		{
			if(keyPressed)
			{
				if((key == 'z' || key == 'Z') && dist(playerX, playerY, 375, 75) < 75)
				{
					switchThree = true;
				}
			}
			
			if(!switchThree)
			{
				image(leverOne, 375, 75);
			}
			else if(switchThree)
			{
				image(leverTwo, 375, 75);
			}
		}
		
		if(stage == 7)
		{
			if(!hasKey && switchOne && switchTwo && switchThree)
			{
				image(keyKey, 150, 250);
			}
			
			if(keyPressed)
			{
				if((key == 'z' || key == 'Z') && dist(playerX, playerY, 150, 250) < 75)
				{
					hasKey = true;
				}
			}
		}
	}
	
	public void victory() //controls the victory screen
	{
		if(playerY == 275 && stage == 2)
		{
			fill(0);
			square(0, 0, 600);
			
			fill(255, 0, 0);
			textAlign(CENTER);
			textSize(30);
			text("To Be Continued...", 300, 300);
		}
	}
	
	public void gameOver() //controls the consequences of getting killed
	{
		playerX = 90000;
	}
	
	public void chickenPuzzle()
	{
		if(stage == 1) 
		{
			firstChicken.paintChicken(this);
			
		if(!chickenCaptured)
		{	
			if(playerY > firstChicken.getY())
			{
				firstChicken.moveUp();
			}
			else if(playerY < firstChicken.getY() || playerY == firstChicken.getY())
			{
				firstChicken.moveDown();
			}
			
			if(playerX > firstChicken.getX()  || playerX == firstChicken.getX())
			{
				firstChicken.moveLeft();
			}
			else if(playerX < firstChicken.getX())
			{
				firstChicken.moveRight();
			}
			
			if(firstChicken.getX() > 575)
			{
				firstChicken.setX(575);
			}
			if(firstChicken.getX() < 25)
			{
				firstChicken.setX(25);
			}
			if(firstChicken.getY() > 575)
			{
				firstChicken.setY(575);
			}
			if(firstChicken.getY() < 25)
			{
				firstChicken.setY(25);
			}
		}
			
			if(keyPressed)
			{
				if((key == 'z' || key == 'Z') && dist(playerX, playerY, firstChicken.getX(), firstChicken.getY()) < 75)
				{
					firstChicken.setX(575);
					firstChicken.setY(275);
					
					chickenCaptured = true;
				}
			}
			
		}
		}
	}


