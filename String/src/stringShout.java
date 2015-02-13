import java.util.Scanner;
public class stringShout
{
static String name;
static String shout;
static Scanner userInput = new Scanner(System.in);
public static void main(String[] args)
	{
	greetPlayer();
	changeShoutToLowerCase();
	}
	public static void greetPlayer()
	{
	System.out.println("What is your name?");
	name = userInput.nextLine();
	System.out.println("Hello," + name + "! Please shout something at me.");
	}

	public static void changeShoutToLowerCase(){
	Scanner userInput= new Scanner(System.in);
	shout= userInput.nextLine();
	System.out.println(shout.toLowerCase());
	}
}