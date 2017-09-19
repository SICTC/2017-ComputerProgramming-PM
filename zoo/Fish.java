/**
 * @author Mr. Hoover and the PM Class.
 * 
 * This class represents fish of all different kinds.
 */
public class Fish extends Animal implements Comparable<Fish>
{

	//data fields
	int fins;
	int eyes;
	
	static int fishCount=0;
	
	//primary constructor
	/**
	 * Default constructor. Manually specify all parameters relating to the fish.
	 * @param n the name of the fish
	 * @param c the color of the fish
	 * @param s the species of the fish
	 * @param f the number of fins
	 * @param e the number of eyes
	 */
	public Fish(String n, String c, String s, int f, int e)
	{
		super(n,c,s);
		fins = f;
		eyes = e;
		
		fishCount++;
	}
	
	//observers
	/**
	 * @return a String representation of the fish
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "Fish:" + super.toString() + ", fins=" +fins+ ", eyes=" +eyes;
	}
	
	/**
	 * The number of fish objects present in our program.
	 * @return total number of fish objects in memory
	 */
	public int fishCount()
	{
		return fishCount;
	}
	
	/**
	 * 
	 * @return the number of fins
	 */
	public int getFins()
	{
		return fins;
	}
	
	/**
	 * 
	 * @return the number of eyes
	 */
	public int getEyes()
	{
		return eyes;
	}
	
	/**
	 * Prints an ASCII representation of a fish swimming.
	 */
	public void swim()
	{
		System.out.println(name + " goes swimming! <>< <>< ><> ><>");
	}
	
	/**
	 * The winner of a fish fight is determined by who has more fins.  If they have the same number of fins, then it is determined by who has more eyes.  If they have the same number of eyes, a fisherman appears and they both lose.
	 * @param f the fish that is being fought.
	 */
	public void fight(Fish f)
	{
		if(f.getFins() > fins)
		{
			System.out.println(f.getName() + " wins!");
		}
		else if(f.getFins() < fins)
		{
			System.out.println(name + " wins!");
		}
		else if(f.getEyes() > eyes) //same number of fins, so check eyes
		{
			System.out.println(f.getName() + " wins!");
		}
		else if(f.getEyes() < eyes)
		{
			System.out.println(name + " wins!");
		}
		else //same number of fins and eyes!
		{
			System.out.println("Everybody loses...caught by a bigger fish!");
		}
	}
	
	//mutators
	/**
	 * A shark attacks and removes a fin.
	 */
	public void sharkAttack()
	{
		if(fins>0)
		{
			fins--;
		}
	}
	
	/**
	 * The fish is exposed to radiation and grows more fins or eyes.
	 */
	public void radiation()
	{
		int random = (int)(1+2*Math.random());
		if(random == 1)
		{
			int moreEyes = (int)(1+7*Math.random());
			eyes = eyes + moreEyes;
			System.out.println(name + " grew extra eyes!");
		}
		if(random ==2)
		{
			int moreFins = (int)(1+17*Math.random());
			fins = fins + moreFins;
			System.out.println(name + " grew extra fins!");
		}
	}
	
	//comparable interface function
	/**
	 * @param f the fish being compared to
	 * @return a negative int if the calling fish's name comes before the argument fish's name in the alphabet, 0 if the names are the same, and a positive int otherwise.
	 * @see java.lang.String#compareTo(String)
	 */
	public int compareTo(Fish f)
	{
		return name.compareTo(f.getName());
		//return f.getName().compareTo(name); //invert ordering
		//return f.getName().compareTo(f.getName()); //returns 0 every time
	}
	
	
}
