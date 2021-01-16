package animalute;

import java.util.ArrayList;

public class AnimalShop {

	private String shopName;
	private String adress;
	private String details;

//	private String location;

	private ArrayList<Dog> listaCaini = new ArrayList<Dog>();
	private ArrayList<Cat> listaPisici = new ArrayList<Cat>();
	private ArrayList<Parrot> listaPapagali = new ArrayList<Parrot>();

	public void countEachAnimal() {
		int numarCaini = 0;
		int numarPisici = 0;
		int numarPapagali = 0;

		for (Dog b : listaCaini) {
			numarCaini = numarCaini + 1;
		}
		listaCaini.stream().forEach(b -> System.out.println("numele cainelui este" + b.getName()));
		listaCaini.stream().forEach(b -> {
			System.out.println("numele cainelui este" + b.getName());

		});
		for (Cat c : listaPisici) {
			numarPisici = numarPisici + 1;
		}
		for (Parrot b : listaPapagali) {
			numarPapagali = numarPapagali + 1;
		}
		System.out.println("Au ramas.... " + numarCaini + "caini");
		System.out.println("Au ramas......" + numarPisici + "pisici");
		System.out.println("Au ramas......" + numarPapagali + "papagali");
	}

//totusi nu cred ca e bine ,trebuia undeva sa ies din for :D 
	AnimalShop() {

	}

	AnimalShop(String details) {
		this.details = details;
	}

	public ArrayList<Cat> getListaPisici() {
		return listaPisici;
	}

	public void setListaPisici(ArrayList<Cat> listaPisici) {
		this.listaPisici = listaPisici;
	}

	public ArrayList<Parrot> getListaPapagali() {
		return listaPapagali;
	}

	public void setListaPapagali(ArrayList<Parrot> listaPapagali) {
		this.listaPapagali = listaPapagali;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public ArrayList<Dog> getListaCaini() {
		return listaCaini;
	}

	public void setListaCaini(ArrayList<Dog> listaCaini) {
		this.listaCaini = listaCaini;
	}

	/*
	 * private Dog dog1; private Dog dog2; private Cat cat; private Bird bird1;
	 * private Bird bird2;
	 */
	/*
	 * public void showAnimalForSale() { System.out.println(this.dog1.getName());
	 * System.out.println(this.dog2.getName());
	 * System.out.println(this.cat.getName());
	 * System.out.println(this.bird1.getName());
	 * System.out.println(this.bird2.getName()); }
	 */
	/*
	 * public Dog getDog2() { return dog2; }
	 * 
	 * public void setDog2(Dog dog2) { this.dog2 = dog2; }
	 */
	/*
	 * AnimalShop(String shopName, String location) { this.shopName = shopName;
	 * this.location = location; }
	 */
	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	/*
	 * public String getLocation() { return location; }
	 * 
	 * public void setLocation(String location) { this.location = location; }
	 */
	/*
	 * public Dog getDog1() { return dog1; }
	 * 
	 * public void setDog1(Dog dog1) { this.dog1 = dog1; }
	 * 
	 * public Cat getCat() { return cat; }
	 * 
	 * public void setCat(Cat cat) { this.cat = cat; }
	 * 
	 * public Bird getBird1() { return bird1; }
	 * 
	 * public void setBird1(Bird bird1) { this.bird1 = bird1; }
	 * 
	 * public Bird getBird2() { return bird2; }
	 * 
	 * public void setBird2(Bird bird2) { this.bird2 = bird2; }
	 */
}
