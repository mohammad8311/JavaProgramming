package basicJavaTutorial;

public class ConditionalJava02 {
	
	public static void main(String[] args) {
		
		//Switch case statement
		int x =  1;
		
		switch (x)
		{
		case 1:
			System.out.println("Bangladesh");
			break;
			
		case 2:
			System.out.println("USA");
			break;
			
		default:
			System.out.println("Out of earth");
						
		}
		
		
		//convert if else condition to switch case statement
		int y = 1;
		
		//if else
		if (y == 1)
		{
			System.out.println("Hi");
		}
		else if (y == 2)
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("Good Bye");
		}
		
		//switch case
		switch (y)
		{
		case 1:
			System.out.println("Hi");
			break;
		case 2:
			System.out.println("Hello");
			break;
		default:
			System.out.println("Good Bye");
			
		}
		
		
		
	}
}

