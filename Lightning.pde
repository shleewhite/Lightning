int startX = 150;
int startY = 150;
int endX = 0;
int endY = 0;
void setup()
{
	size(600, 600);
	strokeWeight(1);
	background(0, 0, 0);
}
void draw()
{
	stroke(0, (int)(Math.random()*256), (int)(Math.random()*256));
	while (endX < 600) 
	{
		
		endX = startX + (int)((Math.random()*10) - 5);
		endY = startY + (int)((Math.random()*10) - 5);
		line(startX, startY, endX, endY);
		startX = endX;
		startY = endY;
	}
}
void mousePressed()
{
	startX = 150;
	startY = 150;
	endX = 0;
	endY = 0;
}

