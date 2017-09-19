
public class Zoo 
{

	public static void main(String[] args) 
	{
		Animal dog = new Animal("Fido", "Husky", "White");
		System.out.println(dog.animalCount() + "\n");
		
		Dino raptor = new Dino("Blue", "Velociraptor", "Blue", 3, 100, true);
		System.out.println(raptor.animalCount());
		System.out.println(raptor.dinoCount() + "\n");
		
		Bird pigeon = new Bird("Harry", "Carrier Pigeon", "Gray", 0, 0, false, false);
		System.out.println(pigeon.animalCount());
		System.out.println(pigeon.dinoCount());
		System.out.println(pigeon.birdCount() + "\n");
		
		Fish nemo = new Fish("Nemo", "Clownfish", "Orange", 2, 2);
		System.out.println(nemo.animalCount());
		System.out.println(pigeon.dinoCount());
		System.out.println(pigeon.birdCount());
		System.out.println(nemo.fishCount() + "\n");
		
		System.out.println(dog);
		System.out.println(raptor);
		System.out.println(pigeon);
		System.out.println(nemo);
	}

}
