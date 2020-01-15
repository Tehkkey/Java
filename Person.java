// Kyle Sanchez
// Eric Sanden
// 5/13/2019


import javax.swing.*;
import java.awt.event.*;

	 public class Person extends Object
{
	 // define the person's attributes/fields/instance variables
     private String name; //default null
     private int age;// defaults 0
     private String gender;
     // provide our own default constructor
     // to replace Java's automatically
     // provided 
         // parameterized constructor
         
     public Person(String name, int age, String g)
     { 
    	 // instance variables ALWAYS  go on the left side of the = !!!!!!!
    	 
    	 this.name=name;
    	 this.age=age;
    	 gender = g;
     }
     
     // provide a toString that prints the state of your
     // Person object
     // We will override the toString in the Object class
     public String toString() {
    	 return "Dear "+ getName()+
       ", I suggest a "+ getPet()
		 +" as your next pet.\n\n";
               
     }
     // getter or accessor method
     // getter for gender
     public String getGender()
     {
    	 return gender;
     }
     public String getName()
     {
    	 return name;
     }
     
     public int getAge()
     {
    	 return age;
     }
     
     
     // setters or mutator method
     public void setGender(String g)
     {
    	 this.gender = gender;
     }
     public void setName(String n)
     {
    	 name = n;
     }
     public void setAge(int age)
     {
    	 this.age = age;
     }     
	
         	 		
     
     // getter  method for getPet
     public String getPet()
     {
    	 if (gender.equals("M") && (age <= 10)) {
    		 return "Hamster";
    	 }
    	 if (gender.equals ("M") && (10 < age  << 30)){
    		 return "Spider";
    	 }
    	 if ( gender == ("M") && (30 > age)) {
    		 return "Dog";
    	 }
    	 if(  gender == ("F") && ( age<= 10)) {
    		 return "Bunny";
    	 }
    	 if (gender == ("F") && (10 <  age  << 30)) {
    		 return "Horse";
    	 }
    	 if (gender == ("F") && (30 > age)) {
    		 return "Cat";
    		}
    	 else  { 
    		 return "Re-enter Gender M/F";
          }
  }
}
