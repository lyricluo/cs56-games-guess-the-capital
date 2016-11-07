/**
 * MainMenu object that player sees when game first begins
 *
 * @author Sean Shelton, Armin Mahini
 * @version UCSB CS56, F16
 */

import java.io.*;

public class MainMenu extends Menu{
    
    public int setPromptChoice(){
	super.setPromptChoice();
    }
   
    public void printMenu(){
	System.out.println("\nWelcome to the capitals quiz game! \nWhat would you like to do?");
	System.out.println("\n0. Play US State Capitals Game");
	System.out.println("1. Play World Capitals Game");
	System.out.println("2. Play a game with World and State Capitals");
	System.out.println("\nPlease select a number: \n");
    }

}
