import java.util.Scanner;

public class age 
{
	
	//ask the user their age and tell them if they are young or old
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		
		int age = cin.nextInt();
		
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
		
		cin.close();
	}

}
