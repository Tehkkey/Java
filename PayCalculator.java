// Kyle Sanchez
// 4/23/2019
// This Program generates net pay based on hours and rate

import javax.swing.JOptionPane;

public class PayCalculator {

	public static void main(String[] args) 
	{
		// call getName
		String name = getName();
		System.out.println(name);
		// call getHours
		double hours = PayCalculator.getHours();
		System.out.println(hours);
		//call getRate
		double rate = PayCalculator.getRate();
		System.out.println(rate);
		//call getBonus
		double bonus = getBonus();
		System.out.println(bonus);
		//call calcTotal
		double total = calcTotal(hours, rate, bonus);
		System.out.println(total);
		
		displayResults(name,total);
		
		} // end of main
		  // define display results
		public static void displayResults(String name, double total)
		{
			JOptionPane.showMessageDialog(null, name+", you earned $"+total);
		}
		
		public static String getName() {
			String strName = JOptionPane.showInputDialog(null, "What is your name?");
			return (strName);
		}
		
		public static double getHours() {
			String strHours = JOptionPane.showInputDialog(null, "Enter hours worked: ");
		return Double.parseDouble(strHours);
			
		}
		
		public static double getRate() {
		return Double.parseDouble(JOptionPane.showInputDialog(null, "Enter pay rate: "));
		}
		
		public static double calcTotal (double hours, double rate, double bonus)
		{
			return hours * rate + bonus; 
		}
		public static double getBonus() {
			int holiday = JOptionPane.showConfirmDialog(null, "Did you work on a holiday?");
					if (holiday == 0)
					{
						return 50.0;
					}
					else 
					{
						return 0.0;
					}
			
		
		}
}
