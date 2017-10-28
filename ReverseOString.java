/*
 * Author: Michael Loerop
 * Date: 10/26/2017
 * Reverse O String
 * Takes in a sentence and gives it back reversed
 */
package reverseostring;
import java.util.Scanner;
/**
 *
 * @author Michael Loerop
 */
public class ReverseOString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        Scanner input = new Scanner(System.in);
        String userInput; //put user input into a string
        
        //Get input from user
        System.out.println("Please enter a word: ");
        userInput = input.nextLine();
        
        //print out each character in reverse
        for (int x = userInput.length(); x >= 1; x--)
        {
            //starting with the last character, 
            //print out each character in a line.
            System.out.print(userInput.charAt(x-1));
        }
    
    }
    
}
