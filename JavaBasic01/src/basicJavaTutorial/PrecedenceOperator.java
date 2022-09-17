package basicJavaTutorial;

public class PrecedenceOperator {
	
	public static void main(String[] args) {
		
		int x;
		x = 5;
		
		System.out.println("Current value of x is: " + x++); // 5+1=6 => First use then increment
		System.out.println("Current value of x is: " + ++x); // 6+1=7 => first increment then value use
		
		x = 5;
		
		System.out.println("Current value of x is: " + ++x); // First use then increment then use
		System.out.println("Current value of x is: " + x++); // First use the increment
		
	}

}
