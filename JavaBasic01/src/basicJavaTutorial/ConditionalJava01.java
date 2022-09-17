package basicJavaTutorial;

public class ConditionalJava01 {

	public static void main(String[] args) {
		
		//if statement		
		int x = 22;
		
		if (x % 2 == 0 || x % 4 == 0)
		{
			System.out.println("X is true!");
		}
		
		
		//if else statement
		int a = 10;
		
		if (a > 5 && a < 10)
		{
			System.out.println("6 to 10");
		}
		else
		{
			System.out.println("Condition false! ");
		}
		
		//even odd number
		int num  = 45;
		
		if (num % 2 == 0)
		{
			System.out.println("This is even number!");
		}
		else
		{
			System.out.println("This is odd number!");
		}
		
		//Check the characater is vowel or consonent
		char ch = 'k';
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println("k is vowel!");
		}
		else
		{
			System.out.println("k is consonent!");
		}
		
		

	}

}
