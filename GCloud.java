import acm.program.GraphicsProgram;
import java.awt.Color;
import acm.graphics.GOval;
import acm.graphics.GRect;

/**This java file produces the clouds and animation for the main TRexRun class**/
public class GCloud {
	private GRect rect;
	private GOval[] ovals;

	public GCloud(int top, int left) {
		//Draw Clouds
		rect = new GRect(400, 47);
		ovals = new GOval[3];
		ovals[0] = new GOval(400, 175);
		ovals[1] = new GOval(250, 112);
		ovals[2] = new GOval(250, 112);
		for (int i = 0; i < ovals.length; i++) {
			ovals[i].setFilled(true);
			ovals[i].setColor(Color.WHITE);
		}
		rect.setLocation(top - 20, left + 65);
		rect.setFilled(true);
		rect.setColor(Color.WHITE);
		
		ovals[0].setLocation(top - 20, left - 70);
		ovals[1].setLocation(top + 250, left);
		ovals[2].setLocation(top - 150, left);
	}
	
	//Add to TRexRun
	public void add(GraphicsProgram g) {
		g.add(rect);
		for (int i = 0; i < ovals.length; i++) {
			g.add(ovals[i]);
		}
			
	}
	//Animate 
	public void move(int xMove, int yMove) {
		rect.move(-10, yMove);
		if(rect.getX() < -640)
		{
			rect.setLocation(3000, rect.getY());
		}
		
		for (int i = 0; i < ovals.length; i++) {
			ovals[i].move(-10, yMove);
			if(ovals[i].getX() < -640)
			{
				ovals[i].setLocation(3000, ovals[i].getY());
			}
		}
	}
}
