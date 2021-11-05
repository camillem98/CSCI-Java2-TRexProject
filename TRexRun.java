/* C SCI 143 - Java II
 * Camille Joyce Mercado
 * 
 * This java file will produce an animation of a dinosaur/trex running that pays a homage to the Google TRex Run Offline Game.
 * The trex will be in the middle of the screen running alongside clouds and a cactus moving across behind it.
 * The colors used in this project were cyan and custom colors of tan, light green, dark green. 
 * The graphics objects that were used are GRect and GOval.
 * 
 */

import acm.program.GraphicsProgram;
import java.awt.Color;
import acm.graphics.*;
import java.util.*;

public class TRexRun extends GraphicsProgram{
	public void init() {
		//Set Applet size
		setBackground(Color.CYAN);
		setSize(3000, 1400);
	}
	
	public void run() {
		//Draw desert
		GRect desert = new GRect(3000, 450);
		add(desert);
		desert.setLocation(0, 1050);
		desert.setFilled(true);
		Color sand = new Color(176, 126, 76);
		desert.setColor(sand);
		
		//Call GCloud
		GCloud cloudA = new GCloud(400, 500);
		cloudA.add(this);
		GCloud cloudB = new GCloud(2400, 200);
		cloudB.add(this);
		
		//Call GCactus
		GCactus cactusA = new GCactus(2400, 810);
		cactusA.add(this);
		
		//Drawing TRex
		GRect body = new GRect(128, 125);
		add(body);
		body.setLocation(1436, 910);
		body.setFilled(true);
		Color darkGreen = new Color(0, 51, 0);
		body.setColor(darkGreen);
		
		GRect tail1 = new GRect(20, 106);
		add(tail1);
		tail1.setLocation(1416, 910);
		tail1.setFilled(true);
		tail1.setColor(darkGreen);
		
		GRect tail2 = new GRect(20, 106);
		add(tail2);
		tail2.setLocation(1396, 886);
		tail2.setFilled(true);
		tail2.setColor(darkGreen);
		
		GRect tail3 = new GRect(20, 106);
		add(tail3);
		tail3.setLocation(1376, 862);
		tail3.setFilled(true);
		tail3.setColor(darkGreen);
		
		GRect tail4 = new GRect(20, 106);
		add(tail4);
		tail4.setLocation(1356, 830);
		tail4.setFilled(true);
		tail4.setColor(darkGreen);
		
		GRect body1 = new GRect(140, 130);
		add(body1);
		body1.setLocation(1456, 886);
		body1.setFilled(true);
		body1.setColor(darkGreen);
		
		GRect body2 = new GRect(140, 130);
		add(body2);
		body2.setLocation(1476, 862);
		body2.setFilled(true);
		body2.setColor(darkGreen);
		
		GRect body3 = new GRect(128, 116);
		add(body3);
		body3.setLocation(1508, 838);
		body3.setFilled(true);
		body3.setColor(darkGreen);
		
		GRect body4 = new GRect(96, 90);
		add(body4);
		body4.setLocation(1540, 814);
		body4.setFilled(true);
		body4.setColor(darkGreen);
		
		GRect neck = new GRect(75, 138);
		add(neck);
		neck.setLocation(1561, 700);
		neck.setFilled(true);
		neck.setColor(darkGreen);
		
		GRect arm = new GRect(65, 30);
		add(arm);
		arm.setLocation(1600, 838);
		arm.setFilled(true);
		arm.setColor(darkGreen);
		
		GRect hand = new GRect(15, 55);
		add(hand);
		hand.setLocation(1665, 838);
		hand.setFilled(true);
		hand.setColor(darkGreen);
		
		GRect jaw = new GRect(145, 25);
		add(jaw);
		jaw.setLocation(1600, 779);
		jaw.setFilled(true);
		jaw.setColor(darkGreen);
		
		GRect jaw2 = new GRect(60, 40);
		add(jaw2);
		jaw2.setLocation(1600, 739);
		jaw2.setFilled(true);
		jaw2.setColor(darkGreen);
		
		GRect face = new GRect(250, 105);
		add(face);
		face.setLocation(1561, 645);
		face.setFilled(true);
		face.setColor(darkGreen);
		
		GRect top = new GRect(200, 30);
		add(top);
		top.setLocation(1586, 620);
		top.setFilled(true);
		top.setColor(darkGreen);
		
		GRect eye = new GRect(25, 25);
		add(eye);
		eye.setLocation(1611, 665);
		eye.setFilled(true);
		eye.setColor(Color.WHITE);

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
		
		GRect runLegRight1 = new GRect(35, 30);
		add(runLegRight1);
		runLegRight1.setLocation(1549, 1035);
		runLegRight1.setFilled(true);
		runLegRight1.setColor(darkGreen);


	/* This section of code is made by a while loop to accommodate the animation of the trex's legs running by adding and removing the GRect object of each leg.
	 * The timer object was also used to control the speed of the legs, clouds and cactus. 
	 */
	
	//Animate Clouds, Cactus and TRex Running Legs
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
		@Override
		public void run() {
			while(true) {
				remove(runLegLeft1);
				remove(runLegLeft2);
				remove(restLegRight1);
				remove(restLegRight2);
				remove(restLegRight3);		
				add(restLegLeft1);
				add(restLegLeft2);
				add(restLegLeft3);
				add(restLegLeft4);			
				add(runLegRight1);			
				cloudA.move(-20, 0);
				cloudB.move(-20, 0);
				cactusA.move(-20, 0);
				
				pause(95);
				
				remove(restLegLeft1);
				remove(restLegLeft2);
				remove(restLegLeft3);
				remove(restLegLeft4);
				remove(runLegRight1);			
				add(runLegLeft1);
				add(runLegLeft2);
				add(restLegRight1);
				add(restLegRight2);
				add(restLegRight3);
				cloudA.move(-20, 0);
				cloudB.move(-20, 0);
				
				pause(95);	
			}
		}
	};
	//Speed of Animation
	 timer.schedule(task, 0, 1000);
	}
  }