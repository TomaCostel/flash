package animalute;

import static animalute.Dog.HAS_PEDIGREE;

import java.util.ArrayList;
import java.util.List;

import enums.AnimalGender;

public class Main {

	static boolean canBeAdopted(Bird p) {
		if (p.isCiupeste() == false && p.getAge() < 3) {
			System.out.println("Pasarea  " + p.getName() + " poate fi adoptata");
			return true;
		} else {
			System.out.println("Pasarea  " + p.getName() + "nu poate fi adoptata");
			return false;
		} 

	}

	public static void main(String[] args) {

		System.out.println(HAS_PEDIGREE);
		Animal.drink();
		AnimalShop magazinAnimale = new AnimalShop("Relu", "Irlanda");
		
		Cat cat1=new Cat("relu");
		Bird bird1 = new Bird();
		Bird pasare = new Bird();
		Dog dog1=new Dog("nume");
		
		Util.afisareNumeAnimalsiVarsta(cat1);
		Util.afisareNumeAnimalsiVarsta(dog1);
		Util.afisareNumeAnimalsiVarsta(bird1);
		
		
		
		bird1.whichIsChildFriendly(pasare);

		magazinAnimale.setBird1(bird1);
		magazinAnimale.setBird2(pasare);
		magazinAnimale.setCat(cat1);
		magazinAnimale.setDog1(dog1);
		magazinAnimale.setDog2(dog1);
		
		magazinAnimale.showAnimalForSale();

		
		boolean b=Main.canBeAdopted(bird1);
		
		Parrot papagal1 = new Parrot();
		Parrot papagal2 = new Parrot();
		Parrot papagal3 = new Parrot();
		Parrot papagal4 = new Parrot();
		
		
	
		
		
		papagal1.setAge(2);
		papagal1.setCanFly(false);
		papagal1.setCiupeste(false);
		papagal1.setName("Gica");
		papagal1.setColor("Verde");
		papagal1.setCountryOfOrigin("Franta");
		papagal1.setGen(AnimalGender.F);
		papagal1.setRasa("micul");;
		papagal1.setTraiesteInColonie(true);
		
		papagal2.setAge(2);
		papagal2.setCanFly(false);
		papagal2.setCiupeste(false);
		papagal2.setName("Patlagica");
		papagal2.setColor("Verde");
		papagal2.setCountryOfOrigin("Germania");
		papagal2.setGen(AnimalGender.F);
		papagal2.setRasa("micul Alexander");
		papagal2.setTraiesteInColonie(true);
		
		papagal3.setAge(2);
		papagal3.setCanFly(false);
		papagal3.setCiupeste(false);
		papagal3.setName("Relu");
		papagal3.setColor("Rosu");
		papagal3.setCountryOfOrigin("Norvegia");
		papagal3.setGen(AnimalGender.M);
		papagal3.setRasa("nimfa");
		papagal3.setTraiesteInColonie(true);
		
		papagal4.setAge(2);
		papagal4.setCanFly(false);
		papagal4.setCiupeste(false);
		papagal4.setName("Ghita");
		papagal4.setColor("Mov");
		papagal4.setCountryOfOrigin("Spania");
		papagal4.setGen(AnimalGender.M);
		papagal4.setRasa("perus");
		papagal4.setTraiesteInColonie(true);
	
	
		ArrayList<Parrot> listaPapagali=new ArrayList<Parrot>();
		
		
		listaPapagali.add(papagal3);
		listaPapagali.add(papagal2);
		listaPapagali.add(papagal1);
		listaPapagali.add(papagal4);
		
		Util.buyAParrot(listaPapagali);
		Util.afisarePapagali(listaPapagali);
		System.out.println("inainte de for each");
		for(Bird c:listaPapagali) {
			System.out.println(c.getName());
		}
		
		//Util.buyAParrot();
		System.out.println("-----------------");
		Util.introduceAnimal();
		
		
	}

}
