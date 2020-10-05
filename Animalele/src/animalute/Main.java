package animalute;

import static animalute.Animal.HAS_PEDIGREE;

public class Main {

	public static void main(String[] args) {

		Animal animal1 = new Animal();
		Animal animal2 = new Animal("Ham", 4);
		Animal animal3 = new Animal();
		animal1.setName("Leon");

		System.out.println(animal1.getName());
		System.out.println(animal2.getName());

		System.out.println(HAS_PEDIGREE);
		System.out.println(animal3);
		Animal.drink();
		Animal.planeta = "is pe marte";
	}

}
