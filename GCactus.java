import acm.program.GraphicsProgram;
import java.awt.Color;
import acm.graphics.GRect; 

/**This java file produces the cactus and animation for the main TRexRun class**/
public class GCactus {
	private GRect[] rects;
	
	public GCactus(int top, int left) {
		//Draw Cactus
		Color cactus = new Color(37, 111, 0);
		rects = new GRect[4];
		rects[0] = new GRect(65, 330); //stem
		rects[1] = new GRect(275, 65); //arms
		rects[2] = new GRect(65, 65); //left
		rects[3] = new GRect(65, 65); //right
		for (int i = 0; i < rects.length; i++) {
			rects[i].setFilled(true);
			rects[i].setColor(cactus);
		}
		
		rects[0].setLocation(top + 25, left - 90);
		rects[1].setLocation(top - 80, left);
		rects[2].setLocation(top - 80, left - 60);
		rects[3].setLocation(top + 130, left - 60);
	}
	
	//Add to TRexRun
	public void add(GraphicsProgram c) {
		for (int i = 0; i < rects.length; i++) {
			c.add(rects[i]);
		}
	}

	//Animate
	public void move(int xMove, int yMove) {
		for (int i =0; i < rects.length; i++) {
			rects[i].move(-10, yMove);
			if (rects[i].getX() < -640) 
			{
				rects[i].setLocation(3000, rects[i].getY());
			}
		}
	}
}