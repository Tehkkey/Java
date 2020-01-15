// Kyle Sanchez
// This program generates a nice compliment based on the users age
// 4/23/2019

import javax.swing.JOptionPane;
import java.util.Random;

public class programCompliment
{

	public static void main(String[] args) 
	{
		// prompt the user for their name using
		// show input dialog(null, "prompt")
		String name = JOptionPane.showInputDialog(null, "Enter your name");
		
		JOptionPane.showMessageDialog(null,  "Welcome, " + name);
		
		String ageStr = JOptionPane.showInputDialog(null, "Enter your age");
		
		int age = Integer.parseInt(ageStr);
      
      Random rand = new Random();
      int rand_int1 = rand.nextInt((5-2) +1) + 2;
		
		// returns 0 - yes, 1 - no, 2 - cancel
		JOptionPane.showConfirmDialog(null, "Are you age: " +(age));
      
      JOptionPane.showMessageDialog(null,  "You're looking great! Definitely younger than " + (age - rand_int1));
		
		//int years = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age"));

	}

}