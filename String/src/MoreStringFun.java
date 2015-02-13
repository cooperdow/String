import java.util.Scanner;
public class MoreStringFun {
static String name;
static String sentence;
static Scanner userInput=new Scanner (System.in);
public static void main(String[] args) {
	greetUser();
	noSpace();
	//vowelCount();
	}
		public static void greetUser()
			{
			System.out.println("What is your name?");
			name = userInput.nextLine();
			System.out.println("Hello," + name + "! Enjoy the game.");
			}
		public static void noSpace()
			{
			System.out.println("Please type a sentence with at least five words(no punctuation)");
			sentence=userInput.nextLine();
			String noSpaceSentence=sentence.replace(" ","");
			System.out.println(noSpaceSentence);
			System.out.println("You have " + sentence.length() + " characters in the sentence");
			System.out.println("You have " + noSpaceSentence.length() + " letters in the sentence");;
			int vowelCount = 0;
			for (int i=0; i<sentence.length(); i++)
				{
				String letter= sentence.substring(i, i+1);
				switch(letter)
					{
					case "a":
					case "e":
					case "i":
					case "o":
					case "u":
						{
						vowelCount++;
						break;
						}
					}
				}
					System.out.println("You have " + vowelCount + " vowels");
					System.out.println("You have " + (noSpaceSentence.length() - vowelCount) + " consonants");
				
					}

			
			
			
		//public static void vowelCount()
			{
			String vowel= sentence;
			int vowels= 0;
			for(int i = 0; i<vowel.length(); i++)
			{	
			String letter= vowel.substring(i, i+1);
			switch(letter)
				{
				case "a":
				case "e":
				case "i":
				case "o":
				case "u":
					{
					vowels=vowels+1;
						{	
						System.out.println("You have " + vowel.length() + " total vowels");
						break;
						}
					}
				}
			}
		}
		//public static void consonantCount()
			{
			String consonant= sentence;
			int consonants= 0;
			for(int i = 0; i<consonant.length(); i++)
				{
				String letter= consonant.substring(i, i+1);
				switch(letter)
					{
					case "b":
					case "c":
					case "d":
					case "f":
					case "g":
					case "h":
					case "j":
					case "k":
					case "l":
					case "m":
					case "n":
					case "p":
					case "q":
					case "r":
					case "s":
					case "t":
					case "v":
					case "w":
					case "x":
					case "y":
					case "z":
						{
						consonants=consonants+1;
							{
							System.out.println("You have " + consonant.length() + " consonants your sentence");
							break;
							}
						}
					}
		}
	}
}