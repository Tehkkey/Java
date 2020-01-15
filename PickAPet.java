// Kyle Sanchez
// Eric Sanden
// 5/13/2019
// This program suggests a pet based on age and gender


import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

public class PickAPet {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		
      
      // prompt the user for their name using
		// show input dialog(null, "prompt")
		String setName = JOptionPane.showInputDialog(null, "Enter your name");
      
		int setAge = JOptionPane.showInputDialog(null, "Enter your age");
      int age = Integer.parseInt(ageStr);
      
      char setGender = JOptionPane.showInputDialog(null, "Enter your gender");
      
		JOptionPane.showMessageDialog(null,  "Welcome, " + name);
				 	
				
		
		// call the toString() method
				
		System.out.println(p1.toString());
		//Person p2 
				
	
		}
	
}
	
