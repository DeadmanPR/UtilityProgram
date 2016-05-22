/**
 * This class contains operations related to the Operations on Numbers Menu.
 * @author José A. Rodríguez Rivera
 *
 */
public class NumbersMenuManager {
	private static NumbersMenuManager uniqueInstance=null;
	private Menu menu;
	
	
	private NumbersMenuManager()
	{
		
	}
	
	/**
	 * Checks if the instance of the Operations on Numbers Menu is unique, and returns it.
	 * @return the unique instance of NumbersMenuManager
	 */
	public static NumbersMenuManager getInstance()
	{
		//Checks that there is only one instance at a given time.
		if (uniqueInstance == null)
		{
			uniqueInstance = new NumbersMenuManager();
			uniqueInstance.menu = new Menu(3);
			uniqueInstance.menu.setHeader("\nOperation on Numbers Menu: ");
			uniqueInstance.menu.addOption("Process Quadratic Equation");
			uniqueInstance.menu.addOption("Compute Average of List of Numbers");
			uniqueInstance.menu.addOption("Exit");
		}
		
		//Returns said unique instance.
		return uniqueInstance;
	}
	
	/**
	 * Runs the unique instance of the Operations on Numbers Menu.
	 */
	public void run()
	{
		int selectedOption;
		
		//Displays the menu.
		menu.display();
		
		//Gets the user selection, in order to apply the corresponding operation.
		selectedOption = menu.getUserSelection();
		
		//Only met if the user wasted the opportunities to enter a valid option.
		if (selectedOption == 0)
		{
			System.out.println("ERROR: User entered 3 incorrect options. Returning to the Main Menu.");
			MainMenuManager menu = MainMenuManager.getInstance();
			menu.run();
		}
		
		if(selectedOption == 1)
			Operations.quadraticEquation();
		if (selectedOption == 2)
			Operations.average();
		if (selectedOption == 3)
		{
			MainMenuManager menu = MainMenuManager.getInstance();
			menu.run();
		}
			
		
	}
}


