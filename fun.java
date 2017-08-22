import java.util.Scanner;

public class fun {

	//functions go outside main method, but still inside class body
	//modifier returnType name(argType1 arg1, argType2 arg2, ...)
	//{
	//	//method body
	//}
	
	//change earth-year age to mars-year age
	static double earthToMars(double age)
	{
		return age/1.88;
	}
	
	static double earthToDog(double age)
	{
		return 7*age;
	}
	
	static void areYouOld(double age)
	{
		if(age<0)
		{
			System.out.println("You don't exist yet...");
		}
		else if(age<30)
		{
			System.out.println("You're still young!");
			
			if(age < 13)
			{
				System.out.println("You aren't even a teenager, yet.");
			}
		}
		else if(age >= 30 && age < 60)
		{
			System.out.println("Middle of the road.");
		}
		else if(age>=60)
		{
			System.out.println("Oh, man, you're old!");
			
			if(age >= 100)
			{
				System.out.println("You're REALLY old!");
			}
		}
	}
	
	//all about functions
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Enter your age in earth years.");
		int earth = cin.nextInt();
		double mars = earthToMars((double)earth);
		double dog = earthToDog((double)earth);
		
		System.out.println("Earth age: " + earth);
		areYouOld(earth);
		
		System.out.println("Mars age: " + mars);
		areYouOld(mars);
		
		System.out.println("Dog age: " + dog);
		areYouOld(dog);
		
		cin.close();
	}
}
