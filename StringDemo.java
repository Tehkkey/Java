
public class StringDemo {

	public static void main(String[] args) {
		
		// how to check if two string objects contain same text
		// we should use .equals() for check rather than ==
		// == checks if the memory addresses/references are the same RATHER
		// than the contents
		// declare a string to hold "chocolate"
		
		String text1 = "chocolate";
		// declare another string with a different memory address
		// force new memory address using string constructor
		
		String text2 = new String("chocolate");
		
		//if the memory addresses are teh same print "same memory"
		if (text1 == text2) {
			System.out.println("same memory references");
		}
		else { 
			System.out.println("different memory references");
		}
		
		// if the string contents are the same print "same text"
		if (text1.equals(text2)) {
			System.out.println("same text");
		}
		else {
			System.out.println("different");
		}
		
		//Strings are immutable -you cannot put a different string at the same memory location
		String text3="      vanilla      ";
		//trim removes leading a trailing blanks
		System.out.println(text3);
		System.out.println(text3.trim());
		System.out.println(text3);
		
		// reassign variable value
		text3 = text3.trim();
		System.out.println(text3);
		
		parsingStrings("Seattle Seahawks");
		
		printUpperChars("memorial day");
		
		
		String ransomText = ransomNote("memorial day");
		// expected ransomText meMorIal daY
		System.out.println(ransomText);
		
		

	}
	
	//this method will take a string and print out each character on a separate line capitalized
	public static void printUpperChars(String text) {
		// cycle through the text using for loop
		for(int i=0; i<text.length(); i++) {
			System.out.println(Character.toUpperCase(text.charAt(i)));
		}
	}
	
	// this method will create a string and return a string with every third
	//letter capitalized from the passed in string
	public static String ransomNote(String text) {
		String newText = "";
		for (int i=0; i<text.length(); i++)
		{
			char letter = text.charAt(i);
			if ((i+1) % 3 ==0)
			{
				newText += Character.toUpperCase(letter);
			}
			else {
				newText += letter;
			}
		}
		return newText;
	}
	
	
	// This method will take a team name
	// and 
	public static void parsingStrings(String team) {
		String city = "";
		String teamname = "";
		int space = team.indexOf(" "); // space will hold index 7
		city = team.substring(0, space);
		teamname = team.substring(space + 1);
		System.out.println(city);
		System.out.println(teamname);
		
	}

}
