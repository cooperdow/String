import java.util.Scanner;
public class CountTheVowels{
static String name;
static String word;
static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args)
		{
		greetPlayer();
		printVertical();
		}
		public static void greetPlayer()
			{
			System.out.println("What is your name?");
			name = userInput.nextLine();
			System.out.println("Hello," + name + "! Please type your word.");
			}
	
		public static void printVertical(){
			System.out.println("Type a sentence and I'll return the vowels");
			String vowel= userInput.nextLine();
			int vowels= 0;
			for(int i = 0; i<vowel.length(); i++)
				{
				String letter= vowel.substring(i, i+1);
				switch (letter)
					{
					case "a":
					case "e":
					case "i":
					case "o":
					case "u":
						{
						vowels=vowels+1;
						break;
						}
					}
				}
			System.out.println("There are " + vowels + " vowels in your sentence");
		}
	}
