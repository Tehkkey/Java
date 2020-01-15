import java.awt.Color;

import acm.graphics.GCompound;
import acm.graphics.GOval;
import acm.graphics.GRect;

/**
 * This class represents a car in the ACM graphical environment
 * 
 * @author susan
 *
 */
public class Car extends GCompound {

	private int speed;
	private Color bodyColor;
	private static final int SPEED_ADJ = 10;

	/**
	 * Car constructor method
	 * 
	 * @param bColor car's bodyColor
	 * @param s      speed of car movement in horizontal direction
	 * @param x      initial x location of car before movement
	 * @param y      initial y location of car before movement
	 */
	public Car(Color bColor, int s, int x, int y) {
		bodyColor = bColor;
		speed = s;
		// set initial placement of car
		// in graphical window
		this.setLocation(x, y);

		// tank top
		GRect top = new GRect(20, 20, 60, 40);
		top.setFillColor(Color.GREEN);
		top.setFilled(true);

		// car body
		GRect body = new GRect(0, 40, 100, 30);
		body.setFillColor(bColor);
		body.setFilled(true);

		// tank wheel
		GOval wheel1 = new GOval(0, 40, 30, 30);
		wheel1.setFillColor(Color.BLACK);
		wheel1.setFilled(true);

		// tank wheel 2
		GOval wheel2 = new GOval(30, 40, 30, 30);
		wheel2.setFillColor(Color.BLACK);
		wheel2.setFilled(true);
		
		// tank wheel 3
		GOval wheel3 = new GOval(61, 40, 30, 30);
		wheel3.setFillColor(Color.BLACK);
		wheel3.setFilled(true);

		// glue car parts together.
		add(top);
		add(body);
		add(wheel1);
		add(wheel2);
		add(wheel3);

	}

	/**
	 * This method moves the car in a horizontal direction (speed pixels)
	 */
	public void movePosition() {
		this.move(speed, 0);
	}

	/**
	 * This method stops the car moving by setting the speed to 0 pixels
	 */
	public void stop() {
		speed = 0;
	}

	/**
	 * This method will accelerate the car by adding a SPEED ADJUSTMENT
	 */
	public void accelerate() {
		speed += SPEED_ADJ;
	}

	/**
	 * Resets the cars position on the left side on the window
	 */
	public void reset() {
		this.setLocation(0, this.getY());

	}

}
