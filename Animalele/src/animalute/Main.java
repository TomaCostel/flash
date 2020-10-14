package animalute;

import static animalute.Dog.HAS_PEDIGREE;

public class Main {

	public static void main(String[] args) {

		Animal animal1 = new Dog();

		Animal animal3 = new Dog();
		animal1.setName("Leon");

		System.out.println(animal1.getName());
		System.out.println(animal3.getName());

		System.out.println(HAS_PEDIGREE);
		System.out.println(animal3);
		Animal.drink();
		Animal.planeta = "is pe marte";
		Dog catel = new Dog();
		catel.setCountryOfOrigin("Romania");
		catel.setMerge(true);
		catel.setMakeNoise(false);
	}

}
