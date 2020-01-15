import java.util.Random;

public class randomnumbergeneration extends Object{

	public static void main(String[] args) {
		// construct a random object
		// pattern
		// data type object_name = new class_name();
		/*Random gen = new Random(); // constructor method
		for(int i=1; i <= 10; i ++) {
			int num = gen.nextInt(10) + 1; // generate 0-9
		// added + 1 to exclude zero from numbers
		System.out.println(num);
		} // end of for loop  */
		
		// generate a random number in the range 5-10
		Random gen = new Random(); // constructor method
		for(int i=1; i <= 10; i ++) {
			int num = gen.nextInt(6) +5 ; // generate 0-9
		// added + 1 to exclude zero from numbers
		System.out.println(num);
		}

	}

}
