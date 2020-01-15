import java.awt.Color;
import java.awt.event.KeyEvent;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;
/**
 * 
 * @author susan
 * This class displays a highway with a moving car that will reappear on the left side
 * when it drives off the right side. You can stop the moving car by
 * pressing "s" for stop.  You can restart the moving car by pressing "a" for accelerate
 * You can continue to press "a" to increase the speed of the car.
 */
public class Highway extends GraphicsProgram {

	private Car car1; // declare car instance variable here so it can
						// be seen in the the following methods: drawVehicles(), run(),
	                    // and keyPressed()

	public void init() {
		// set window background color
		this.setBackground(Color.GREEN);

		// set window size 800 pixels wide, 600 pixels high
		this.setSize(800, 600);

		// listen for keyboard input
		this.addKeyListeners();

	}

	public void drawVehicles() {
		// construct a car that is red and has speed 20 pixels horizontally and is
		// intially placed
		// at x=200 and y=175
		car1 = new Car(Color.RED, 20, 200, 175);
		// add car to window
		this.add(car1);
	}

	public void drawRoad() {
		// draw Road
		GRect road = new GRect(0, this.getHeight() / 3, this.getWidth(), this.getHeight() / 4);
		road.setColor(Color.GRAY);
		road.setFilled(true);
		this.add(road);
	}

	public void run() {
		// draw road before vehicles so you don't cover them up
		drawRoad();

		// draw vehicles next
		drawVehicles();
		
		//infinite while loop
		while(true)
		{
			car1.movePosition();
			// pause for the human eye
			pause(200);
			//System.out.println(car1.toString());
			if(car1.getX() > this.getWidth())
			{
				car1.reset();
			}
		}
	}



	public static void main(String[] args) {
		Highway h = new Highway();
		h.start();
	}

}
