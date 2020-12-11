import processing.core.PApplet;
import processing.core.PImage;

public class Tilemap 
{
	PImage bottomRightTile, upperLeftTile, bottomLeftTile, upperRightTile, centerUpLeftTile, centerUpRightTile, centerDownLeftTile, centerDownRightTile;
	PImage leftFacing, rightFacing, downFacing, upFacing, filler, dirtTiles, upperRightCorner, upperLeftCorner, bottomRightCorner, bottomLeftCorner;
	
	PImage castle1, castle2;
	
	PImage water, door, bridge;
	
	PImage barrel;
	
	int doorX, doorY;
	
	public Tilemap(PApplet app) //tiles loader for every tilemap
	{
		bottomRightTile = app.loadImage("TL1.png");
		upperLeftTile = app.loadImage("TL2.png");
		bottomLeftTile = app.loadImage("TL3.png");
		upperRightTile = app.loadImage("TL4.png");
		centerUpLeftTile = app.loadImage("TL6.png");
		centerUpRightTile = app.loadImage("TL8.png");
		centerDownLeftTile = app.loadImage("TL7.png");
		centerDownRightTile = app.loadImage("TL5.png");
		rightFacing = app.loadImage("TL9.png");
		upFacing = app.loadImage("TL10.png");
		leftFacing = app.loadImage("TL11.png");
		downFacing = app.loadImage("TL12.png");
		filler = app.loadImage("TL13.png");
		dirtTiles = app.loadImage("TL14.png");
		upperLeftCorner = app.loadImage("TL15.png");
		upperRightCorner = app.loadImage("TL16.png");
		bottomRightCorner = app.loadImage("TL17.png");
		bottomLeftCorner = app.loadImage("TL18.png");
		

		castle1 = app.loadImage("castle1.png");
		castle2 = app.loadImage("castle2.png");
		
		water = app.loadImage("water.png");
		door = app.loadImage("door.png");	
		bridge = app.loadImage("bridge.png");
		barrel = app.loadImage("barrel.png");
	}
	
	public void display(int i, PApplet app)
	{
		if(i == 1) 
		{
		app.image(upperRightTile, 50, 0);
		app.image(upperLeftTile, 0, 0);
		app.image(rightFacing, 0, 50);
		app.image(rightFacing, 0, 100);
		app.image(rightFacing, 0, 150);
		app.image(rightFacing, 0, 200);
		app.image(rightFacing, 0, 250);
		app.image(rightFacing, 0, 300);
		app.image(leftFacing, 50, 50);
		app.image(leftFacing, 50, 100);
		app.image(leftFacing, 50, 150);
		app.image(downFacing, 100, 200);
		
		//fillers
		for(int j = 0; j <= 150; j += 50)
		{
			for(int m = 100; m <= 150; m += 50)
			{
				app.image(filler, m, j);
			}
		}
		
		app.image(upperRightCorner, 50, 200);
		app.image(upperLeftCorner, 150, 200);
		
		app.image(bottomLeftTile, 0, 350);
		app.image(upFacing, 50, 350);
		app.image(upFacing, 100, 350);
		app.image(bottomLeftCorner, 150, 350);
		app.image(rightFacing, 150, 400);
		app.image(rightFacing, 150, 450);
		app.image(rightFacing, 150, 500);
		app.image(rightFacing, 150, 550);
		
		app.image(rightFacing, 250, 0);
		app.image(rightFacing, 250, 50);
		app.image(rightFacing, 250, 100);
		
		app.image(downFacing, 150, 200);
		app.image(upperLeftCorner, 200, 200);
		app.image(upperLeftCorner, 250, 150);
		app.image(upperLeftTile, 200, 150);

		app.image(bottomRightCorner, 250, 300);
		app.image(bottomRightTile ,550, 300);
		
		for(int n = 300; n < 550; n += 50)
		{
			app.image(upFacing, n, 300);
		}
		
		for(int o = 350; o < 600; o += 50)
		{
			app.image(leftFacing, 250, o);
		}
		
		for(int p = 0; p < 300; p += 50)
		{
			app.image(leftFacing, 550, p);
		}
		
		for(int q = 300; q < 600; q += 50)
		{
			for(int r = 350; r < 600; r += 50)
			{
				app.image(filler, q, r);
			}
		}
		
		for(int k = 0; k <= 100; k += 50)
		{
			for(int l = 400; l <= 550; l += 50)
			{
				app.image(filler, k, l);
			}
		}
		
		app.image(filler, 200, 0);
		app.image(filler, 200, 50);
		app.image(filler, 200, 100);
		}
		
		else if(i == 2)
		{
			//castle
			
			app.image(castle1, 0, 300);
			app.image(castle1, 50, 300);
			app.image(castle1, 100, 300);
			app.image(castle1, 150, 300);
			app.image(castle1, 200, 300);
			
			app.image(castle1, 350, 300);
			app.image(castle1, 400, 300);
			app.image(castle1, 450, 300);
			app.image(castle1, 500, 300);
			app.image(castle1, 550, 300);
			
			for(int u = 0; u < 250; u += 50)
			{
				for(int v = 0; v < 300; v += 50)
				{
					app.image(castle1, u, v);
				}
			}
			
			for(int w = 350; w < 600; w += 50)
			{
				for(int z = 0; z < 300; z += 50)
				{
					app.image(castle1, w, z);
				}
			}
			
			for(int aa = 0; aa < 250; aa += 50)
			{
				app.image(castle2, 250, aa);
				app.image(castle2, 300, aa);
			}
			
			app.image(rightFacing, 250, 550);
			app.image(rightFacing, 250, 500);
			app.image(rightFacing, 250, 450);
			app.image(bottomLeftCorner, 250, 400);
			
			app.image(upFacing, 200, 400);
			app.image(upFacing, 150, 400);
			app.image(upFacing, 100, 400);
			app.image(upFacing, 50, 400);
			app.image(bottomLeftTile, 0, 400);
			app.image(rightFacing, 0, 350);
			
			app.image(leftFacing, 550, 550);
			app.image(leftFacing, 550, 500);
			app.image(leftFacing, 550, 450);
			app.image(leftFacing, 550, 400);
			app.image(leftFacing, 550, 350);
			
			for(int ab = 0; ab < 250; ab += 50)
			{
				app.image(filler, ab, 550);
				app.image(filler, ab, 500);
				app.image(filler, ab, 450);
			}
		}
		
		else if(i == 3)
		{
			app.image(leftFacing, 250, 0);
			app.image(leftFacing, 250, 50);
			app.image(upperRightCorner, 250, 100);
			
			app.image(downFacing, 300, 100);
			app.image(downFacing, 350, 100);
			app.image(downFacing, 400, 100);
			app.image(downFacing, 450, 100);
			app.image(downFacing, 500, 100);
			app.image(downFacing, 550, 100);
			
			for(int s = 300; s < 600; s+= 50)
			{
				app.image(filler, s, 0);
				app.image(filler, s, 50);
			}
			
			app.image(rightFacing, 150, 0);
			app.image(rightFacing, 150, 50);
			app.image(upperLeftCorner, 150, 100);
			
			app.image(downFacing, 100, 100);
			app.image(downFacing, 50, 100);
			app.image(downFacing, 0, 100);
			
			for(int t = 0; t < 150; t+= 50)
			{
				app.image(filler, t, 0);
				app.image(filler, t, 50);
			}
			
			for(int ac = 0; ac < 600; ac += 50)
			{
				for(int ad = 250; ad < 400; ad += 50)
				{
					app.image(water, ac, ad);
				}
			}
			
			for(int ae = 0; ae < 600; ae += 50)
			{
				app.image(upFacing, ae, 450);
			}
			for(int af = 0; af < 600; af += 50)
			{ 
				app.image(filler, af, 500);
				app.image(filler, af, 550);
			}
			
			app.image(barrel, 150, 450);
		}
		
		else if(i == 4)
		{
			app.image(downFacing, 0, 100);
			app.image(downFacing, 50, 100);
			app.image(downFacing, 100, 100);
			app.image(downFacing, 150, 100);
			app.image(downFacing, 200, 100);
			app.image(downFacing, 250, 100);
			app.image(downFacing, 300, 100);
			app.image(downFacing, 350, 100);
			app.image(downFacing, 400, 100);
			
			app.image(upperRightTile, 450, 100);
			app.image(upperRightCorner, 450, 150);
			app.image(upperRightTile, 500, 150);
			app.image(leftFacing, 500, 200);
			
			for(int ac = 0; ac < 600; ac += 50)
			{
				for(int ad = 250; ad < 400; ad += 50)
				{
					app.image(water, ac, ad);
				}
			}
			
			for(int af = 0; af < 600; af += 50)
			{
				app.image(filler, af, 0);
				app.image(filler, af, 50);
			}
			
			app.image(filler, 500, 100);
			app.image(filler, 550, 100);
			app.image(filler, 550, 150);
			app.image(filler, 550, 200);
			app.image(upperRightCorner, 500, 250);
			app.image(downFacing, 550, 250);
			app.image(upFacing, 550, 350);
			app.image(bottomRightCorner, 500, 350);
			
			for(int ae = 0; ae < 600; ae += 50)
			{
				app.image(upFacing, ae, 450);
			}
			
			for(int ag = 0; ag < 600; ag += 50)
			{ 
				app.image(filler, ag, 500);
				app.image(filler, ag, 550);
			}
			
			app.image(leftFacing, 500, 450);
			app.image(leftFacing, 500, 400);
			app.image(filler, 550, 400);
			app.image(filler, 550, 450);
			
			app.image(bridge, 300, 250);
			app.image(bridge, 350, 250);
			app.image(bridge, 300, 300);
			app.image(bridge, 350, 300);
			app.image(bridge, 300, 350);
			app.image(bridge, 350, 350);
		}
		
		else if(i == 5)
		{
			app.image(downFacing, 550, 100);
			app.image(downFacing, 500, 100);
			app.image(downFacing, 450, 100);
			app.image(downFacing, 400, 100);
			app.image(downFacing, 350, 100);
			app.image(downFacing, 300, 100);
			app.image(downFacing, 250, 100);
			
			app.image(upperLeftTile, 200, 100);
			app.image(upperLeftTile, 150, 150);
			app.image(upperLeftTile, 100, 200);
			app.image(upperLeftTile, 50, 250);
			app.image(upperLeftTile, 0, 300);
			
			app.image(upperLeftCorner, 200, 150);
			app.image(upperLeftCorner, 150, 200);
			app.image(upperLeftCorner, 100, 250);
			app.image(upperLeftCorner, 50, 300);
			
			app.image(rightFacing, 0, 350);
			app.image(rightFacing, 0, 400);
			app.image(rightFacing, 0, 450);
			app.image(rightFacing, 0, 500);
			app.image(rightFacing, 0, 550);
			
			for(int ag = 0; ag < 600; ag += 50)
			{ 
				app.image(filler, ag, 0);
				app.image(filler, ag, 50);
			}
			
			for(int ah = 100; ah < 250; ah += 50)
			{
				app.image(filler, 0, ah);
				app.image(filler, 50, ah);
			}
			
			app.image(filler, 0, 250);
			app.image(filler, 100, 100);
			app.image(filler, 100, 150);
			app.image(filler, 150, 100);
			
			for(int ae = 100; ae < 600; ae += 50)
			{
				app.image(upFacing, ae, 450);
			}
			
			app.image(leftFacing, 50, 500);
			app.image(leftFacing, 50, 550);
			app.image(bottomRightCorner, 50, 450);
			
			for(int ag = 100; ag < 600; ag += 50)
			{ 
				app.image(filler, ag, 500);
				app.image(filler, ag, 550);
			}
			
			for(int ac = 300; ac < 600; ac += 50)
			{
				for(int ad = 250; ad < 400; ad += 50)
				{
					app.image(water, ac, ad);
				}
			}
			
			for(int ai = 300; ai < 450; ai += 50)
			{
				for(int aj = 400; aj < 600; aj += 50)
				{
					app.image(water, ai, aj);
				}
			}
			
			app.image(rightFacing, 300, 500);
			app.image(rightFacing, 300, 550);
			
			app.image(leftFacing, 400, 500);
			app.image(leftFacing, 400, 550);
			
			app.image(bottomLeftCorner, 300, 450);
			app.image(bottomRightCorner, 400, 450);
		}
		
		else if(i == 6)
		{
			for(int ak = 0; ak < 600; ak += 50)
			{
				app.image(water, 300, ak);
				app.image(water, 350, ak);
				app.image(water, 400, ak);
			}
				
				app.image(leftFacing, 100, 0);
				app.image(leftFacing, 100, 50);
				app.image(leftFacing, 100, 100);
				
				app.image(upperRightCorner, 100, 150);
				
				app.image(downFacing, 150, 150);
				app.image(downFacing, 200, 150);
				app.image(downFacing, 250, 150);
				
				app.image(upperLeftCorner, 300, 150);
				
				app.image(rightFacing, 300, 100);
				app.image(rightFacing, 300, 50);
				app.image(rightFacing, 300, 0);
				
				for(int al = 150; al <= 250; al += 50)
				{
					for(int am = 0; am < 150; am += 50)
					{
						app.image(filler, al, am);
					}
				}
				
				for(int al = 450; al <= 550; al += 50)
				{
					for(int am = 0; am < 600; am += 50)
					{
						app.image(leftFacing, 400, am);
						app.image(filler, al, am);
						
						app.image(rightFacing, 0, am);
					}
				}
		}
		
		else if(i == 7)
		{
			for(int ak = 0; ak < 200; ak += 50)
			{
				app.image(water, 300, ak);
				app.image(water, 350, ak);
				app.image(water, 400, ak);
			}
			
			for(int ap = 0; ap < 300; ap += 50)
			{
				app.image(rightFacing, 0, ap);
			}
			
			for(int ap = 400; ap < 600; ap += 50)
			{
				app.image(rightFacing, 0, ap);
			}
			
			app.image(upperLeftCorner, 0, 300);
			
			for(int al = 450; al <= 550; al += 50)
			{
				for(int am = 0; am < 200; am += 50)
				{
					app.image(leftFacing, 400, am);
					app.image(filler, al, am);
				}
			}
			
			app.image(downFacing, 450, 200);
			app.image(downFacing, 500, 200);
			app.image(downFacing, 550, 200);
			app.image(upperRightCorner, 400, 200);
			
			app.image(bottomLeftCorner, 0, 350);
			
			app.image(upFacing, 300, 300);
			app.image(upFacing, 350, 300);
			app.image(upFacing, 400, 300);
			app.image(upFacing, 450, 300);
			app.image(upFacing, 500, 300);
			app.image(upFacing, 550, 300);
			
			app.image(bottomRightCorner, 250, 300);
			
			app.image(leftFacing, 250, 350);
			app.image(leftFacing, 250, 400);
			app.image(leftFacing, 250, 450);
			app.image(leftFacing, 250, 500);
			app.image(leftFacing, 250, 550);
			
			for(int aq = 300; aq < 600; aq += 50)
			{
				for(int ar = 350; ar < 600; ar += 50)
				{
					app.image(filler, aq, ar);
				}
			}
			
		}
		
		else if(i == 8)
		{
			for(int as = 250; as < 600; as += 50)
			{
				app.image(downFacing, as, 300);
				app.image(upFacing, as, 350);
				
				app.image(filler, as, 250);
				app.image(filler, as, 400);
			}
			
			app.image(upperRightTile, 200, 250);
			app.image(bottomRightTile, 200, 400);
			app.image(upperLeftTile, 50, 250);
			app.image(bottomLeftTile, 50, 400);
			
			app.image(downFacing, 100, 250);
			app.image(downFacing, 150, 250);
			
			app.image(rightFacing, 50, 300);
			app.image(rightFacing, 50, 350);
			
			app.image(upFacing, 100, 400);
			app.image(upFacing, 150, 400);
			
			app.image(upperRightCorner, 200, 300);
			app.image(bottomRightCorner, 200, 350);
			
			for(int au = 0; au < 600; au += 50)
			{
				for(int at = 0; at < 250; at += 50)
				{
					app.image(filler, au, at);
				}
				
				for(int av = 450; av < 600; av += 50)
				{
					app.image(filler, au, av);
				}
			}
			
			for(int aw = 250; aw < 450; aw += 50)
			{
				app.image(filler, 0, aw);
			}
		}
		else if(i == 9)
		{
			for(int ax = 0; ax < 450; ax += 50)
			{
				app.image(rightFacing, 0, ax);
				app.image(leftFacing, 300, ax);
			}
			
			for(int ay = 0; ay < 350; ay += 50)
			{
				app.image(upFacing, ay, 400);
			}
			
			for(int az = 350; az < 600; az += 50)
			{
				for(int ba = 0; ba < 475; ba += 50)
				{
					app.image(filler, az, ba);
				}
			}
			
			for(int bc = 0; bc < 350; bc += 50)
			{
				app.image(filler, bc, 450);
			}
			
			for(int bd = 0; bd < 600; bd += 50)
			{
				app.image(water, bd, 500);
				app.image(water, bd, 550);
			}
		}
		else if(i == 10)
		{
			for(int be = 0; be < 350; be += 50)
			{
				app.image(downFacing, be, 200);
				app.image(upFacing, be, 300);
			}
			
			for(int bf = 0; bf < 200; bf += 50)
			{
				app.image(rightFacing, 350, bf);
			}
			
			for(int bg = 350; bg < 600; bg += 50) 
			{
				app.image(rightFacing, 350, bg);
			}
			
			app.image(upperLeftCorner, 350, 200);
			app.image(bottomLeftCorner, 350, 300);
			
			for(int bh = 0; bh < 600; bh += 50)
			{
				app.image(water, 450, bh);
				app.image(water, 500, bh);
				app.image(water, 550, bh);
			}
			
			for(int bi = 0; bi < 350; bi += 50)
			{
				for(int bl = 0; bl < 200; bl += 50)
				{
					app.image(filler, bi, bl);
				}
				
				for(int bk = 350; bk < 600; bk += 50)
				{
					app.image(filler, bi, bk);
				}
			}
			
			app.image(upperLeftTile, 350, 0);
			app.image(bottomLeftTile, 350, 550);
			app.image(downFacing, 400, 0);
			app.image(upFacing, 400, 550);
			app.image(upperLeftCorner, 450, 0);
			app.image(bottomLeftCorner, 450, 550);
		}
	}
	
	public int getDoorX() {
		return doorX;
	}
	
	public int getDoorY() {
		return doorY;
	}
	
	public void setDoorX(int doorX) {
		this.doorX = doorX;
	}
	
	public void setDoorY(int doorY) {
		this.doorY = doorY;
	}
}
