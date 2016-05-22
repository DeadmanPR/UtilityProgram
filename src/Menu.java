import java.util.Scanner;

/**
 * This class has several operations related to Menus.
 * @author Jose A. Rodriguez Rivera
 *
 */
public class Menu {
	private int nOptions=0, maxChances;
	private String content="";
	
	/**
	 * Constructs a Menu that sets the maximum number of opportunities to enter a valid option.
	 * @param maxChances the maximum number of opportunities to enter a valid option
	 */
	public Menu(int maxChances)
	{
		this.maxChances=maxChances;
		
	}
	
	/**
	 * Adds an option to the corresponding Menu.
	 * @param option the option to be added
	 */
	public void addOption(String option)
	{
		nOptions++;
		content = content + "\t" + nOptions + "> " + option + '\n';
	}
	
	/**
	 * Sets the header (title) of the corresponding Menu.
	 * @param header the title of the Menu
	 */
	public void setHeader(String header)
	{
		content = header + "\n" + content;
	}
	
	/**
	 * Gets the user selection for the corresponding Menu. If the maximum opportunities are used, it returns 0.
	 * @return the user selection, or 0 if the user wasted their opportunities to enter a valid selection
	 */
	public int getUserSelection()
	{
		int incorrectOptions=0;
		int selectedOption;
		Scanner scr = new Scanner(System.in);
		System.out.println("Please, enter a valid option for this menu: ");
		selectedOption = scr.nextInt();
		while (selectedOption <= 0 || selectedOption > nOptions)
				{
					incorrectOptions++;
					if (incorrectOptions==maxChances)
						return 0;
					System.out.println("\nPlease, enter a valid option for this menu (" + (maxChances-incorrectOptions) + " tries remaining): ");
					selectedOption = scr.nextInt();
				}
		return selectedOption;
		
	}
	
	
	/**
	 * Displays the menu to the user.
	 */
	public void display()
	{
		System.out.println(content);
	}
}
