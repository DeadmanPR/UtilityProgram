import java.util.Scanner;

/**
 * This class contains the operations used during the program.
 * @author José A. Rodríguez Rivera
 *
 */
public class Operations {
	private static int quadEqTimes, avgTimes, reverseTimes, formatTimes, statisticTimes;
	
	/**
	 * Executes the Quadratic Equation operation.
	 */
	public static void quadraticEquation()
	{
		Scanner scr = new Scanner(System.in);
		double x2Coefficient, xCoefficient, constant;
	
		//Asks for the quadratic coefficient.
		System.out.print("\nPlease enter the x^2 coefficient (remember that this coefficient can't be 0): ");
		x2Coefficient = scr.nextDouble();
	
		//Checks that the coefficient is different from 0.
		while (x2Coefficient == 0) 
		{
			System.out.println("Please enter a valid coefficient!");
			System.out.print("\nPlease enter the x^2 coefficient (remember that this coefficient can't be 0): ");
			x2Coefficient = scr.nextDouble();
		}
	
		//Asks for the remaining coefficient, and the constant.
		System.out.print("Please enter the x coefficient: ");
		xCoefficient = scr.nextDouble();
		System.out.print("Please enter the constant: ");
		constant = scr.nextDouble();
		
		//Displays the equation to the user.
		System.out.println("This is the equation you entered: " + x2Coefficient + "x^2 + " + xCoefficient + "x + " + constant + " = 0"); 
	
		//Constructs the QuadraticEquation object, with the given coefficients.
		QuadraticEquation equation = new QuadraticEquation((float)x2Coefficient, (float)xCoefficient, (float)constant); 
		
		//Reserves space in memory for the solutions, by declaring the FLOATPair reference variable (still empty).
		FLOATPair solutions; 
	
		//Displays how many solutions the equation has.
		System.out.println("This equation has " + equation.realSolutionsCount() + " real solution(s).");
		
		//If the equation doesn't have any real solutions, the solutions are not shown (they're complex solutions).
		if (equation.realSolutionsCount() > 0)
		{
			//Prevents duplicate solutions from being shown.
			if (equation.realSolutionsCount() == 1)
			{
				solutions = equation.getRealSolutions();
				System.out.println("The real solution to this equation is x = " + solutions.getFirst());
			}
			else
			{
				//Displays the solutions to the equation.
				solutions = equation.getRealSolutions();
				System.out.println("The real solutions to this equation are x = " + solutions.getFirst() + " and x = " + solutions.getSecond());
			}
		}
		
		//This is for the statistics menu.
		quadEqTimes++;
		
		//Returns to the Operations on Numbers Menu
		NumbersMenuManager menu = NumbersMenuManager.getInstance();
		menu.run();
	}
	
	/**
	 * Executes the Average operation.
	 */
	public static void average()
	{
		double sum=0, value, avg;
		int count=0;
		Scanner scr = new Scanner (System.in);
		
		//Asks and receives the first number.
		System.out.print("\nPlease enter the first number (make sure it is a positive number): ");
		value = scr.nextDouble();
		
		//Checks that the first number is positive.
		if (value<0) 
		{
			System.out.println("Please enter a positive number!");
			System.out.print("\nPlease enter the first number (make sure it is a positive number): ");
			value = scr.nextDouble();
		}
		
		//Monitors the amount of numbers entered, and keeps track of the sum of all the numbers, to be used later.
		count++;
		sum = sum + value;
		
		//Asks for more numbers.
		System.out.print("Please enter the next number (if you're done, enter any negative number): "); 
		value=scr.nextDouble();
		
		//Entering a negative number will finish the list of numbers to be entered.
		while (value >= 0) 
		{
			count++;
			sum = sum + value;
			System.out.print("Please enter the next number (if you're done, enter any negative number): ");
			value=scr.nextDouble();
		}
		
		//Calculates the average of the numbers entered.
		avg = sum/count;
		
		//Displays the number of values entered, and the average of said numbers.
		System.out.println("You entered " + count + " values. The sum of these values is " + sum + ".");
		System.out.println("The average of the numbers you entered is " + avg + "."); 
		
		//This is for the statistics menu.
		avgTimes++; 
		
		//Returns to the previous menu.
		NumbersMenuManager menu = NumbersMenuManager.getInstance();
		menu.run();
	}
	
	/**
	 * Executes the String Reverser operation.
	 */
	public static void stringReverser()
	{
		Scanner msg = new Scanner(System.in);
		String message, messageReversed="";
		int stringLength, indexMessage;
		
		//Asks and receives the string to be reversed.
		System.out.print("\nPlease enter the string to be reversed: ");
		message = msg.nextLine(); 
		
		//Sets the maximum index for the charAt method.
		stringLength = message.length();
		indexMessage = stringLength - 1; 
		
		//Sets the last character of the string as the first character of a new string, and so on.
		do {
			messageReversed = messageReversed + message.charAt(indexMessage);
			indexMessage--;
			} while (indexMessage >= 0);
		
		//Displays the reversed string.
		System.out.println("The reversed message is: " + messageReversed); 
		
		//This is for the statistics menu.
		reverseTimes++; 
		
		//Returns to the previous menu.
		StringsMenuManager menu = StringsMenuManager.getInstance();
		menu.run();
	}
	
	/**
	 * Executes the String Formatter operation.
	 */
	public static void stringFormatter()
	{
		Scanner msg = new Scanner (System.in);
		Scanner scr = new Scanner(System.in);
		String message, format, formattedMessage;
		int stringLength,formatBreakpoint,indexMessage, index, again;
		
		//Asks and receives the string to be formatted.
		System.out.print("\nPlease enter your message: ");
		message = msg.nextLine(); 
		do
		{
			//Initializes the index.
			index=0;
			
			//Asks and receives the format pattern.
			System.out.print("Please enter your format (using x and -): ");
			format = msg.nextLine();
			
			//Sets the maximum index for the substring method.
			stringLength = message.length();
			indexMessage = stringLength-1; 
			
			//Changes the format's x to §, to prevent conflicts with the string having x, thus getting replaced.
			format = format.replaceAll("x", "§"); 
			
			//Creates a copy of the pattern string, with the first x replaced.
			formattedMessage=format.replaceFirst("§", message.substring(index, index+1));
			index++;
			
			//Replaces the remaining characters from the string.
			do
			{			
				formattedMessage=formattedMessage.replaceFirst("§", message.substring(index, index+1));
				index++;
			} while (index<=indexMessage); 
			
			//Checks the last occurrence of the last character in the string.
			formatBreakpoint=formattedMessage.lastIndexOf(message.charAt(indexMessage)); 
			
			//Trims away anything after the last character of the string.
			formattedMessage = formattedMessage.substring(0,formatBreakpoint+1); 
			
			//Displays the formatted string.
			System.out.println("Your formatted message is: " + formattedMessage); 
			
			//This is for the statistics menu.
			formatTimes++; 
			
			System.out.print("Would you want to format it in a different way? (1 for yes/ 0 for no): "); //Asks for different format with the same string.
			again = scr.nextInt();
		} while (again == 1);
		
		
	//Returns to previous menu.
	StringsMenuManager menu = StringsMenuManager.getInstance();
	menu.run();
	}
	
	/**
	 * Executes the Statistics operation, showing the times each operation was used in the current session.
	 */
	public static void statistics()
	{
		statisticTimes++;
		System.out.println('\n');
		System.out.println("\t" + "Operation in the Program" + "\t\t" + "Number of Times Executed");
		System.out.println("     ================================" + "\t" + "      ============================");
		System.out.println("       " + "Process a Quadratic Equation" + "\t\t\t    " + quadEqTimes);
		System.out.println("       " + "Compute Average of Numbers" + "\t\t\t    " + avgTimes); 
		System.out.println("       " + "Reverse a String" + "\t\t\t\t\t    " + reverseTimes);
		System.out.println("       " + "Format a String" + "\t\t\t\t\t    " + formatTimes); 
		System.out.println("       " + "Show Statistics" + "\t\t\t\t\t    " + statisticTimes); 
		System.out.println(" ");
		MainMenuManager menu = MainMenuManager.getInstance();
		menu.run();
	}
}
