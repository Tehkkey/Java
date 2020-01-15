import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Loops
{

public static void main(String[] args)
    {
       // call static method
       Loops.generateNums(10, 50, 25);
       Loops test = new Loops(); 
       // call the non-static method 
       test.addNumbers();
       int answer = guessFruit();
       System.out.println("You guessed it, with only "+answer+" incorrect guesses");
       test.forLoops();
    }
    

	public void forLoops()
	{
		// 1 to 70
		for (int i=1; i <= 70; i++)
		{
			System.out.print(i+" ");
			System.out.print("hello"); // hello is not in loop
		}
		//print down from 5
		for (int i=5; i>=1; i--)
		{
			System.out.print(i+" ");
		
		}
		// infinite loop
		/*for(;;)
		{
			System.out.print("Hello");
		}*/
		// print by 3's
		for (int i=3; i<=15; i=i+3)
		{
			System.out.print(i+" ");
		
		}
		// two variables in the for loop
		// separate comma
		for(int i=0, j=2; i<10; i++, j+=2)
		{
			System.out.println("i: " +i+" j: " +j);
		}
		
		int i=0;
		for (;i<10; i++)
		{
			System.out.println("scope");
			
		}
		System.out.print(i);
	}
    // adds the numbers 1 to 70 using a while loop and 
    // prints the total sum outside the loop
    // use constants MIN=1 and MAX=70, a counter, and an accumulator(total)
    public void addNumbers()
    {
    	final int MIN=1;
    	final int MAX=70;
    	
    	// declare a counter that would increment MIN to MAX
    	int counter = MIN;
    	// declare an accumulator (keeps total)
    	int total = 0;
    	
    	while (counter <= MAX)
    	{
    		total = total + counter; // total += counter
    		//System.out.println(total);
    		counter++;  // counter = counter+1
    		
    	}
    
    	System.out.println("Total is " + total);
    	
    
    
    }
    public static int guessFruit()
    {
    	Scanner kb = new Scanner(System.in);
    	System.out.println("Guess which fruit i'm thinking of ");
    	String fruit = kb.nextLine();
    	
    	
    	
    	int counter = 0;  // counts wrong guesses
    	while( !fruit.equalsIgnoreCase("apple"))
    	{
    		counter++;
    		System.out.println("Enter another fruit: ");
    		fruit = kb.nextLine();
    		
    		
    	}
    	return counter;
    }
    
    
    
    
    public static void generateNums(int min, int max, int stop)
    {
        // construct a Random Number generator
        Random gen = new Random();
        
        
        int num=Integer.MIN_VALUE;
        int count=0; // declared a counter variable
        int total=0; // sum up all the randomly generated numbers
                     // total is an accumulator variable
        while ( num != stop )
        {
           // generate random number
           num = gen.nextInt(max-min+1) + min;
        // print out number - keep generating and printing num
        // until num = stop value
           System.out.print(num+" ");
           count++; //increment the count
           // add randomly generated number to the running accumulator
           total+=num; // total = total + num;
        }
        System.out.println("\nGenerated stopping value "+stop+" Count: "+count);
        System.out.println("The sum of the random numbers is "+total);
    
    }





}