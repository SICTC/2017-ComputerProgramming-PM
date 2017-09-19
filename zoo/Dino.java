
public class Dino extends Animal
{
	int horns;
	int teeth;
	boolean feathers;
	
	static int dinoCount=0;
	
	public Dino(String n, String s, String c, int h, int t, boolean f)
	{
		super(n,s,c);
		horns = h;
		teeth = t;
		feathers = f;
		
		dinoCount++;
	}
	
	public int getHorns()
	{
		return horns;
	}
	
	public int getTeeth()
	{
		return teeth;
	}
	
	public boolean hasFeathers()
	{
		return feathers;
	}
	
	public int dinoCount()
	{
		return dinoCount;
	}
	
	public String toString()
	{
		return "Dino:" +super.toString()+ ", horns=" +horns+ ", teeth=" +teeth+ ", feathers=" +feathers;
	}
}
