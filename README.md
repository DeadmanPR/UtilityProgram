# Brief Overview:
This is a program that is written in Java and does several things:
- Process a Quadratic Equation
	- Receives a quadratic equation and shows the real solutions.
- Compute Average of Numbers
	- Calculates the average of entered numbers.
- Reverse a String
	- Receives a sentence (or message) and displays it reversed.
- Format a String	
	- Formats an entered message, according to an entered pattern.

# Compilation and Execution of the program:
To compile this program, use your terminal window and locate the src folder in this directory, and type:
~~~~
javac MainProgram.java
~~~~

To run this program, type: 
~~~~
java MainProgram
~~~~

# Program Operations:
When you run the program, you will be greeted by this menu:
~~~~
Main Menu:
1> Perform Operations on Numbers
2> Perform Operations on Strings
3> Show Use Statistics
4> Exit Program
~~~~

To execute an action, type the option number and press Enter (be careful, if you enter a wrong option number 3 times, 
the program will exit).

~~~~
1: Opens the Operations on Numbers Menu
2: Opens the Operations on Strings Menu
3: Shows the statistics of the current session
4: Exits the program
~~~~


# Operations on Numbers Menu:
~~~~
1> Process Quadratic Equation
2> Compute Average of List of Numbers
3> Exit
~~~~

##### 1- Quadratic Equations

In this part, you can enter the coefficients of a quadratic equation, as required by the program, and it will display:
- The complete equation
- How many real solutions does it have
- The solutions to the quadratic equation

##### 2 - Average
Here, you can enter numbers in order to calculate the average value of them. You can enter as many numbers as you'd like, and when you're done, you type a negative number, and the program will show you the average value.

##### 3 - Exit
Returns to the main menu.


# Operations on Strings Menu:
~~~~
1> Show Reverse of a Given String
2> Format Strings
3> Exit
~~~~

##### 1 - Reverse of a Given String
Here, you enter a message (can include numbers), and the program will display it in reverse!

##### 2- Format Strings
Here, you enter a message (can include numbers), you enter a pattern, and the program will display your formatted message.
        
>Formats are given in this form: xxx-xxx-xxxx.
For example, if your message is 123456789 and you give the pattern                    xx-xxxx-xxx, the program will
display 12-3456-789.

##### 3 - Exit
Returns to the main menu.
