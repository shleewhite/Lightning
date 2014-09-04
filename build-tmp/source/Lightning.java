import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX = 150;
int startY = 150;
int endX = 0;
int endY = 0;
public void setup()
{
	size(600, 600);
	strokeWeight(1);
	background(0, 0, 0);
}
public void draw()
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
public void mousePressed()
{
	startX = 150;
	startY = 150;
	endX = 0;
	endY = 0;
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
