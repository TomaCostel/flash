package animalute;

import java.util.Scanner;

public class Util {

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


