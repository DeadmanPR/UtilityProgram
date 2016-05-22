/**
 * This class contains several operations related to the Operations on Strings menu.
 * @author José A. Rodríguez Rivera
 *
 */
public class StringsMenuManager {
	private static StringsMenuManager uniqueInstance=null;
	private Menu menu;
	
	private StringsMenuManager()
	{
		
	}
	
	/**
	 * Checks if there is only one instance of the menu running, and returns it.
	 * @return the unique instance of StringsMenuManager
	 */
	public static StringsMenuManager getInstance()
	{
		//Checks for the unique instance.
		if (uniqueInstance == null)
		{
			uniqueInstance = new StringsMenuManager();
			uniqueInstance.menu = new Menu(3);
			uniqueInstance.menu.setHeader("\nOperation on Strings Menu: ");
			uniqueInstance.menu.addOption("Show Reverse of a Given String");
			uniqueInstance.menu.addOption("Format Strings");
			uniqueInstance.menu.addOption("Exit");
		}
		
		//Returns said unique instance.
		return uniqueInstance;
	}
	
	
	/**
	 * Runs the Operations on Strings menu.
	 */
	public void run()
	{
		int selectedOption;
		
		//Displays the menu.
		menu.display();
		
		//Gets the user selection in order to apply the corresponding operation.
		selectedOption = menu.getUserSelection();
		
		//Only met if the user wasted their opportunities to enter a valid option.
		if (selectedOption == 0)
		{
			System.out.println("ERROR: User entered 3 incorrect options. Returning to the Main Menu.");
			MainMenuManager menu = MainMenuManager.getInstance();
			menu.run();
		}
		
		if(selectedOption == 1)
			Operations.stringReverser();
		if (selectedOption == 2)
			Operations.stringFormatter();
		if (selectedOption == 3)
		{
			MainMenuManager menu = MainMenuManager.getInstance();
			menu.run();
		}
			
		
	}
}
