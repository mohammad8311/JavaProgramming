package basicPackages;

import java.util.Scanner;

public class ClassA_mainMethod {
	
	public static void main(String[]args)
	{
		//This line is used for print 
		System.out.print("This is the first line");
		String websiteUrl = "www.google.com";
		int number1 = 5;
		int number2 = 10;
		
		int sum = number1 + number2;
		
		System.out.println(sum);
		System.out.println("Google Website URL: " + websiteUrl);
		
		printName("Salehin");
		
		Scanner takeInput = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int Num1 = takeInput.nextInt();
		
		System.out.println("Enter the second number: ");
		int Num2 = takeInput.nextInt();
		
		int sumTwoNumber = Num1 + Num2;
		
		System.out.println("Sum of two number = " + sumTwoNumber);
		
		ClassB objectFromClassB = new ClassB();
		objectFromClassB.provideName("Ketherine Langford");
		
		ClassB.provideName("Noel Austin");
		
		int sumFromMethod = ClassB.sumTwoNumber(Num2, Num2);
		System.out.println("Sum of two number by using method: " + sumFromMethod);
		
		
	}
	
	
	
	public static void printName(String a)
	{
		String name = a;
		System.out.println(name);
	}

}
