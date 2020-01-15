
public class LoopsPractice {

	public static void main(String[] args) {
               //LoopsPractice test = new LoopsPractice();
		              // test.printAll();
                    Scanner print = new Scanner(System.in);
    	              System.out.println("Enter a positive number and i will print to that number ");
    	              int num = print.nextLine();
                    forLoops();
               }
   
          	
 
    	
    	public void forLoops()
	         {
		      // 1 to input num
		       for (int i=1; i <= num; i++)
		      {
			         System.out.print(i+" ");
			         System.out.print("hello"); // hello is not in loop
		      }
    }
	
	}


