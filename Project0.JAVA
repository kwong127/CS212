package com.QueensCollegeCS212;

import javax.swing.JOptionPane;

public class Project0 
{
	public static void main(String[] Arg) 
	{
		while (true ) //while loop causes behavior to repeat infinitely
		{
			String inputSentence;
			inputSentence = JOptionPane.showInputDialog(null, "Enter a sentence: ");
			
			if (inputSentence.equalsIgnoreCase("Stop")) //if "stop" is entered in input, exit program (equalsIgnoreCase will ignore the case sensitivity)
					System.exit(0);
			
			int upCount = 0; int lowCount = 0; //these are counters for upperCase E && lowerCase E
			
			for (int i = 0; i < inputSentence.length(); i++) //this is a for loop to count length of characters in inputSentence
			{
				if ( inputSentence.charAt(i) == 'E') //checks sentence for uppercase E
				{
					upCount ++; //adds 1 to counter every time there is 'E'
				}
			
				if ( inputSentence.charAt(i) == 'e')
				{
					lowCount ++; //adds 1 to counter every time there is 'e'
				}
			
			}
			JOptionPane.showMessageDialog(null , "Number of lowercase e's: " + lowCount + "\n" + "Number of uppercase e's: " + upCount); //shows output box with "Number of upper/lower case" and the counters that have been added			
		}
	}
}
