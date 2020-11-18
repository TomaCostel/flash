package animalute;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import enums.AnimalGender;

public class Util {

	static void findByName(AnimalShop animalShop, String name) {
		int count = 0;

		for (Parrot b : animalShop.getListaPapagali()) {
			if (b.getName().equals(name)) {
				count = count + 1;
			}
		}
		for (Cat c : animalShop.getListaPisici()) {
			if (c.getName().equals(name)) {
				count = count + 1;
			}
		}
		for (Dog c : animalShop.getListaCaini()) {
			if (c.getName().equals(name)) {
				count = count + 1;
			}
		}
		System.out.println("Au mai ramas ..." + count + "animale");

	}

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
		System.out.println("varsta animalului este " + afisareNumeAnimalsiVarsta(a));

	}

	static int afisareNumeAnimalsiVarsta(Animal a) {
		System.out.println("Numele animalului este-" + a.getName());
		return a.getAge();
	}

	Parrot papagale = new Parrot();
	Bird pasare = new Bird();

	static void buyAParrot(ArrayList<Parrot> listParrot) {
		int flag3 = 0;
		int flag2 = 0;
		do {
			Scanner s = new Scanner(System.in);

			System.out.println("Ce marime doriti sa aiba papagalul?(1-small,2-mediu,3-big");
			String marime = s.next();
			System.out.println("Ce culoare doriti sa aiba papagalul");
			String culoare = s.next();
			System.out.println("Ce gen doriti sa aiba animalul?");
			String gen = s.next();

			for (Parrot p : listParrot) {
//FAC SA MEARGA .marim.equals
				/*
				 * if ((p.getMarimeaAnimal()).equals(marime) && p.getColor().equals(culoare) &&
				 * p.getGen().equals(gen)) { System.out.println("sa gasit un papagal");
				 * Parrot.parrotDescription(p); flag3 = 1;
				 */
				// sper ca merge :D
				if (marime.equals(p.getMarimeaAnimal()) && culoare.equals(p.getColor()) && gen.equals(p.getGen())) {
					System.out.println("sa gasit un papagal");
					Parrot.parrotDescription(p);
					flag3 = 1;
				}
			}
			// verificam daca nu sa gasit papagalul
			if (flag3 != 1) {
				System.out.println("Nu s-a gasit ");
				System.out.println("doriti sa continuati?");
				if ("da".equalsIgnoreCase(s.next())) {
					flag2 = 1;
				} else {
					flag2 = 0;
				}
			}

		} while (flag2 == 1);
	}

	public static void afisarePapagali(ArrayList<Parrot> parrotList) {
		System.out.println();
		int countM = 0;
		int countF = 0;
		for (Parrot p : parrotList) {
			if (AnimalGender.M.equals(p.getGen())) {
				countM++;

			}
			if (AnimalGender.F.equals(p.getGen())) {
				countF++;

			}

		}
		System.out.println(countM + "<<<rezultatul papagalului mascul");
		System.out.println(countF + "<<<rezultatul papagalului mascul");

	}

	public void afisareNumeSiVarsta(ArrayList<Animal> listaAnimale) {

		listaAnimale.stream().forEach(a -> {
			System.out.println("Nume animal=" + a.getName() + "si varsta animal=" + a.getAge());
			if (a.getName().startsWith("a") || a.getName().startsWith("e") || a.getName().startsWith("i")
					|| a.getName().startsWith("o") || a.getName().startsWith("u")) {
				System.out.println("Nume animal=" + a.getName() + "si varsta animal=" + a.getAge());
			}

		});

	}

	public void createShortList(ArrayList<Animal> listaAnimale) {

		List<Animal> listaAnimaleNoua = new ArrayList<Animal>();
		for (Animal animal : listaAnimale) {
			if (animal.getName().startsWith("a")) {
				listaAnimaleNoua.add(animal);
			}

		}

		listaAnimale.stream().forEach(animal -> {
			if (animal.getName().startsWith("a")) {
				listaAnimaleNoua.add(animal);
			}
		});
		listaAnimale.stream().filter(animal -> animal.getName().startsWith("a"))
				.forEach(element -> listaAnimaleNoua.add(element));

		List<Animal> listaAnimaleNoua2 = new ArrayList<Animal>();
		listaAnimaleNoua2 = listaAnimale.stream().filter(animal -> animal.getName().startsWith("a"))
				.collect(Collectors.toList());

	}

}
