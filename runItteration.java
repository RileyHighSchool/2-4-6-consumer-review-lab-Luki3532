/*
 * Activity 2.4.4
 */
import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;

public class runItteration
{
	public static void main(String[] args)
	{	
    	Scanner sc = new Scanner(System.in);
	String letters = ("abcdefghijklmnopqrstuvwxyz"); 
	String alphaP = "";
	System.out.println(letters);
	String phrase = "This is a phrase!";
	ArrayList<String> entryLetterList = new ArrayList<String>(); // Create an ArrayList object
	System.out.println("The following shows the letter frequencies for the phrase");
	String entry = sc.nextLine();
	//for each letter of the alfabet check to see how many times it appears in the entry from user
	//make a variable that changes in the for loop to itterate through the alphabet
	//make a 2nd loop to itterate through letter in the entry
	int x = 0;
	// System.out.print(x);
	final int alphabetLength = letters.length();
	int i = 0;
	//single alphabet letter changes Starting with a
	while( i <= alphabetLength-1)
	{
		alphaP = letters.substring(i,i+1);
		// System.out.println(alphaP + "This is the" + i +"itteration");
		//loop through the entry and check for that letter
		//for the letters in the entry check to see if it is the same as the single alphabet letter
		String entryLetter;
		for(int entryParse = 0; entryParse < entry.length(); entryParse++)
		{
			entryLetter = entry.substring(entryParse, entryParse + 1);
			if(entryLetter.equals(alphaP))
			{
				// System.out.println("Entry letter in "+ entryParse+" phase is:  " + alphaP);
				entryLetterList.add(alphaP);
			}
		}
		// go to the next letter in the alphabet
		i++;
	}
	String alphaPb;
	System.out.println(entryLetterList);
    for(int partOBet = 0; partOBet < alphabetLength; partOBet++)
	{
	alphaPb = letters.substring(partOBet, partOBet+1);
	System.out.println("Freq of " + alphaPb + ": "+Collections.frequency(entryLetterList, alphaPb));
	}
    }
}

