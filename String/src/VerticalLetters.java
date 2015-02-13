import java.util.Scanner;
public class VerticalLetters 
{
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

	public static void printVertical()
	{	
	word = userInput.nextLine();
	for(int i=1; i<word.length(); i++)
		{
		System.out.println(word.substring(i,i++));	
		}
	}
}