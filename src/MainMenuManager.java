/**
 * This class contains operations related to the Main Menu.
 * @author José A. Rodríguez Rivera
 *
 */
public class MainMenuManager {
	private static MainMenuManager uniqueInstance=null;
	private Menu menu;
	

	private MainMenuManager()
	{
		
	}
	
	/**
	 * Makes sure there is only one instance of the main menu active.
	 * @return the unique MainMenuManager
	 */
	public static MainMenuManager getInstance()
	{
		//Verifies that there is only one instance active.
		if (uniqueInstance == null)
		{
			uniqueInstance = new MainMenuManager();
			uniqueInstance.menu = new Menu(3);
			uniqueInstance.menu.setHeader("\nMain Menu: ");
			uniqueInstance.menu.addOption("Perform Operations on Numbers");
			uniqueInstance.menu.addOption("Perform Operations on Strings");
			uniqueInstance.menu.addOption("Show Use Statistics");
			uniqueInstance.menu.addOption("Exit Program");
		}
		
		//Returns the unique instance of the MainMenuManager.
		return uniqueInstance;
	}
	
	/**
	 * Runs the unique menu from the MainMenuManager.
	 */
	public void run()
	{
		int selectedOption;
		
		//Displays the menu.
		menu.display();
		
		//Gets user selection, and applies several operations based on the input.
		selectedOption = menu.getUserSelection();
		
		//If the user entered 3 incorrect options, the program ends.
		if (selectedOption == 0)
			System.out.println("ERROR: The program has been terminated. (User entered 3 incorrect options)");
		
		if(selectedOption == 1)
		{
			NumbersMenuManager menu = NumbersMenuManager.getInstance();
			menu.run();
		}
		if (selectedOption == 2)
		{
			StringsMenuManager menu = StringsMenuManager.getInstance();
			menu.run();
		}
		if (selectedOption == 3)
			Operations.statistics();
		if(selectedOption == 4)
		{
			System.out.println("The program has been successfully terminated.");
			System.exit(0);
		}
	}
}
