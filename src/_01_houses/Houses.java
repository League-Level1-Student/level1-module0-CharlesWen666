package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot gg= new Robot();
	void drawHouse(String height1, String color) {
		int height =0;
		if(height1.equalsIgnoreCase("Small")) {
			height=60;
		}
		else if(height1.equalsIgnoreCase("Medium")) {
			height=120;
		}
		else {
			height=250;
		}
		if(color.equalsIgnoreCase("green")) {
		gg.setPenColor(Color.green);	
		}
		else if(color.equalsIgnoreCase("red")){
			gg.setPenColor(Color.red);
		}
		else {
			gg.setPenColor(Color.blue);
		}
		gg.penDown();
		gg.move(height);
		gg.turn(90);
		gg.move(40);
		gg.turn(90);
		gg.move(height);
		gg.turn(-90);
		gg.setPenColor(Color.GREEN);
		gg.move(20);
		gg.turn(-90);
	}
	public void run() {
		gg.setSpeed(100);
		gg.setX(50);
		gg.setY(500);
		Random num = new Random();
		for(int i=0;i<10;i++) {
			int x=num.nextInt(3);
			String a="";
			String c="";
			if(x==1) {
				a="small";
				c="green";
			}
			else if(x==2) {
				a="medium";
				c="blue";
			}
			else {
				a="large";
				c="red";
			}
			drawHouse(a,c);
		}
		
	}
}
