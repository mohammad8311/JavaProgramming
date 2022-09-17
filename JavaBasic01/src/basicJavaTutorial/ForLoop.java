package basicJavaTutorial;

public class ForLoop {

	public static void main(String[] args) {
		
		//print even number using for loop
		int i;
		
		for (i=2; i<=100; i=i+2)
		{
			System.out.println(i);
		}
		
		//print odd number using for loop
		for (i=1; i<=100; i=i+2)
		{
			System.out.println(i);
		}
		
		//for loop break using if condition
		for (i=1; i<=10; i++)
		{
			System.out.println(i);
			if (i == 5)
				break;
		}
		
		//
		
		for (int k = 0; k <= 5; k-=k+4)
		{
			System.out.println("*");
		}

	}

}
