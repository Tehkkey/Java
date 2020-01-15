//Kyle Sanchez

//IT 219

// This program will take total caloric intake for two days, calculate the average
// and output whether you were closer to your goal on day 1 or 2.

import java.util.*;

public class CalorieTracker {

	public static void main(String[] args) {
		
		System.out.println("This program compares your daily caloric intake\r\n" + 
				"for two days and determines which day was better\r\n" + 
				"in regards to reaching your fitness goals.");
		Scanner kb = new Scanner(System.in);
		dailyCalorie();
		System.out.println("Information for day 1:");
		int meals = meals();
		int activity = activity();
		dailyCalorie2();
		System.out.println("Information for day 2:");
		int meals2 = meals2();
		int activity2 = activity2();
		// Determine net calories from returned variables
		int netCalorieDay1 = meals - activity;
		System.out.println("Day 1 Net Calories = "+netCalorieDay1);
		int netCalorieDay2 = meals2 - activity2;
		System.out.println("Day 2 Net Calories = "+netCalorieDay2);
		if (netCalorieDay1 < netCalorieDay2)
		{
			System.out.println("You were closer to your goal on day 1**");
		}
		else
		{
			System.out.println("You were closer to your goal on day 2**");
		}
		int averageCalories = (netCalorieDay1 + netCalorieDay2)/2;
		System.out.println("Average Net Calories = "+averageCalories);
		
		
		
		
	}
	
	
	// this method gets input from the user to determine daily calorie goal
	public static int dailyCalorie()
	{
		System.out.println("\nWhat is your daily calorie goal?");
		// read in the user's guess into the guess variable
		// using our scanner kb object
		Scanner kb = new Scanner(System.in);
		int daily =  kb.nextInt();
		System.out.println(daily);
		return daily;
		
	}
	
	
	// this method gets input from the user to determine total calories of meals combined
	public static int meals()
	{
		System.out.println("How many meals did you eat?");
		Scanner kb = new Scanner(System.in);
		int meals = kb.nextInt();
		int count = 0;
		int sum = 0;
		while (count <= meals - 1)
		{
			count++;
			System.out.println("how many calories were consumed in meal "+ count+"?");
			int total = kb.nextInt(); 
			sum += total;
			kb.nextLine();
		}
		System.out.println("Total caloric intake = " +sum+ " --");
		return sum;
		
	}
	
	
	// This method gets input from the user to determine caloric burn for the day
	public static int activity()
	{
		int caloricBurn = 0;
		System.out.println("What was your activity level? "
				+ "1) Not active  2) Lightly active 3) Active or 4) Very active?");
		Scanner kb = new Scanner(System.in);
		int activity = kb.nextInt();
		switch (activity) {
		case 1:
			System.out.println("Estimated active caloric burn = 0 --");
			return caloricBurn = 0;
		case 2:
		
			System.out.println("Estimated active caloric burn = 250 calories --");
			return caloricBurn = 250;
		case 3:
		
			System.out.println("Estimated active caloric burn = 500 calories --");
			return caloricBurn = 500;
		case 4:
		
			System.out.println("Estimated active caloric burn = 750 calories --");
			return caloricBurn = 750;
		default:
			System.out.println("Please try again");
		}
		return caloricBurn;
		
		
	}
	
	
		// this method gets input from the user to determine daily calorie goal
		public static int dailyCalorie2()
		{
			System.out.println("\nWhat is your daily calorie goal for day 2?");
			// read in the user's guess into the guess variable
			// using our scanner kb object
			Scanner kb = new Scanner(System.in);
			int daily2 =  kb.nextInt();
			System.out.println(daily2);
			return daily2;
			
		}
		
		
		// this method gets input from the user to determine total calories of meals combined
		public static int meals2()
		{
			System.out.println("How many meals did you eat?");
			Scanner kb = new Scanner(System.in);
			int meals = kb.nextInt();
			int count = 0;
			int sum2 = 0;
			while (count <= meals - 1)
			{
				count++;
				System.out.println("how many calories were consumed in meal "+ count+"?");
				int total = kb.nextInt(); 
				sum2 += total;
				kb.nextLine();
			}
			System.out.println("Total caloric intake = " +sum2+ " --");
			return sum2;
			
		}
		
		
		// This method gets input from the user to determine caloric burn for the day
		public static int activity2()
		{
			System.out.println("What was your activity level? "
					+ "1) Not active  2) Lightly active 3) Active or 4) Very active?");
			Scanner kb = new Scanner(System.in);
			int activity = kb.nextInt();
			if (activity == 1)
				{
				System.out.println("Estimated active caloric burn = 0 --");
				return 0;
				}
			else if (activity == 2)
			{
				System.out.println("Estimated active caloric burn = 250 calories --");
				return 250;
			}
			else if (activity == 3)
			{
				System.out.println("Estimated active caloric burn = 500 calories --");
				return 500;
			}
			else if (activity == 4)
			{
				System.out.println("Estimated active caloric burn = 750 calories --");
				return 750;
			}
			
			return activity;
			
	}


}
