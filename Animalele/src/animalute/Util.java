package animalute;

import java.util.Scanner;

public class Util {

	static void introduceAnimal() {
		Scanner n = new Scanner(System.in);
		int flag1 = 0;
		Animal a = new Cat();
		do {
			System.out.println("introduceti animalul dorit ");
			String raspuns = n.next();

			String cat = "Cat";
			String bird = "Bird";
			String dog = "Dog";
			String parrot = "Parrot";
			if (cat.equalsIgnoreCase(raspuns)) {
				flag1 = 0;
				a = new Cat();

			} else if (bird.equalsIgnoreCase(raspuns)) {
				flag1 = 0;
				a = new Bird();

			} else if (dog.equalsIgnoreCase(raspuns)) {
				flag1 = 0;
				a = new Dog();

			} else if (parrot.equalsIgnoreCase(raspuns)) {
				flag1 = 0;
				a = new Parrot();
			} else {
				flag1 = 1;
			}
		} while (flag1 == 1);

		System.out.println("Introduce varsta");
		int varsta = n.nextInt();
		System.out.println("Introduce numele");
		String nume = n.next();

		a.setAge(varsta);
		a.setName(nume);
		System.out.println("varsta animalului este "+afisareNumeAnimalsiVarsta(a));
		
	}
	

	static int afisareNumeAnimalsiVarsta(Animal a) {
		System.out.println("Numele animalului este-" + a.getName());
		return a.getAge();
	}

	static void buyAParrot() {

		Scanner marime = new Scanner(System.in);
		int numar = marime.nextInt();
		System.out.println("Ce marime doriti sa aiba papagalul?(1-small,2-mediu,3-big");
		switch (numar) {
		case 1:
			System.out.println("1-small" + numar);
			break;
		case 2:
			System.out.println("2-medium" + numar);
			break;

		case 3:
			System.out.println("3-medium" + numar);
			break;
		}
		System.out.println("Ce culoare doriti sa aiba papagalul");

		Scanner culoare = new Scanner(System.in);
		String colori = culoare.nextLine();

		System.out.println("Ce culoare doriti sa aiba papagalul?");
		System.out.println(colori);

		Scanner geno = new Scanner(System.in);
		String genoul = geno.nextLine();

		System.out.println("Ce gen doriti sa aiba animalul?");
		System.out.println(genoul);
	}
}
