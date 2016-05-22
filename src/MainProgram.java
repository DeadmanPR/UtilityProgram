public class MainProgram {
	
	public static void main(String[] args) {
		
		//Gets unique instance of the Main Menu and runs it.
		MainMenuManager mainMenuManager = MainMenuManager.getInstance();
		mainMenuManager.run();
	}
}
