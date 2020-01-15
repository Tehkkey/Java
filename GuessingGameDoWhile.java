import java.util.*;
public class GuessingGameDoWhile {

	public static void main(String[] args) {

			//Step 1 generate a hidden number
			// between 1 and 100
			Random gen = new Random();
			int hiddenNumber = gen.nextInt(100)+ 1;
			System.out.println(hiddenNumber); // debug statement
			Scanner kb = new Scanner(System.in);
			
			// declare and initialize the guess outside loop
			
			int guess = 0; 
			
			int totalGuesses = 0;
			
			do {
				System.out.println("Enter a guess between 1 and 100:");
				// read in the user's guess into the guess variable
				// using our scanner kb object
				guess =  kb.nextInt();
				// increment totalGuesses
				totalGuesses++;
				// tell the user if the guess was too high or too low or correct
				if (guess < hiddenNumber ) {
					System.out.println("Too low");
				} else if(guess > hiddenNumber)
				{
					System.out.println("Too High");
				} else
				{
					System.out.println("Winner, Winner!!!");
				}
				
				
			}	while (guess != hiddenNumber);
			
			System.out.println("You guessed correctly with only "+totalGuesses+" guess(es).");

	}

}
