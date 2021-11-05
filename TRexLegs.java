import acm.program.GraphicsProgram;
import java.awt.Color;
import acm.graphics.GRect;

/* This java file will produce the two types of legs that make up for the animation of the trex running in the TRexRun.java file.
 * The legs were drawn by GRects and were drawn to overlap each other to accommodate the while loop in TRexRun of removing and adding each GRect classes of the legs.
 * There are two stages of the trex legs - running and resting(down) legs.
 */
public class TRexLegs extends GraphicsProgram {
	
	public void run() {
		
		//Set Applet size
		setSize(3000,1400);
      
      //darkGreen Color for TRex
      Color darkGreen = new Color(0, 51, 0);
		
		//Resting TRex Legs (Left)
		GRect restLegLeft1 = new GRect(40, 20);
		add(restLegLeft1);
		restLegLeft1.setLocation(1456, 1035);
		restLegLeft1.setFilled(true);
		restLegLeft1.setColor(darkGreen);
		
		GRect restLegLeft2 = new GRect(30, 20);
		add(restLegLeft2);
		restLegLeft2.setLocation(1456, 1055);
		restLegLeft2.setFilled(true);
		restLegLeft2.setColor(darkGreen);
		
		GRect restLegLeft3 = new GRect(18, 30);
		add(restLegLeft3);
		restLegLeft3.setLocation(1456, 1065);
		restLegLeft3.setFilled(true);
		restLegLeft3.setColor(darkGreen);
		
		GRect restLegLeft4 = new GRect(35, 30);
		add(restLegLeft4);
		restLegLeft4.setLocation(1456, 1095);
		restLegLeft4.setFilled(true);
		restLegLeft4.setColor(darkGreen);
		
		//Running TRex Legs (Left)
		GRect runLegLeft1 = new GRect(30, 20);
		add(runLegLeft1);
		runLegLeft1.setLocation(1456, 1035);
		runLegLeft1.setFilled(true);
		runLegLeft1.setColor(darkGreen);
		
		GRect runLegLeft2 = new GRect(30, 20);
		add(runLegLeft2);
		runLegLeft2.setLocation(1471, 1055);
		runLegLeft2.setFilled(true);
		runLegLeft2.setColor(darkGreen); 
		
		//Resting TRex Legs (Right)
		GRect restLegRight1 = new GRect(40, 20);
		add(restLegRight1);
		restLegRight1.setLocation(1524, 1035);
		restLegRight1.setFilled(true);
		restLegRight1.setColor(darkGreen);
		
		GRect restLegRight2 = new GRect(15, 90);
		add(restLegRight2);
		restLegRight2.setLocation(1549, 1035);
		restLegRight2.setFilled(true);
		restLegRight2.setColor(darkGreen);
		
		GRect restLegRight3 = new GRect(35, 30);
		add(restLegRight3);
		restLegRight3.setLocation(1549, 1095);
		restLegRight3.setFilled(true);
		restLegRight3.setColor(darkGreen);
		
		//Running TRex Legs (Right)
		GRect runLegRight1 = new GRect(35, 30);
		add(runLegRight1);
		runLegRight1.setLocation(1549, 1035);
		runLegRight1.setFilled(true);
		runLegRight1.setColor(darkGreen);
	}
}