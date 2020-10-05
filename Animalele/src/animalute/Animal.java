package animalute;

public class Animal {

	public static final boolean HAS_PEDIGREE = true;
	private String name;
	static String planeta;
	private int noOfFeet;
	private String countryOfOrigin;
	private boolean merge;

	private Type type;
	private Type2 type2;

	public Type getType() {
		return type;
	}

	public void setType(Type r) {
		this.type = r;
	}

	public Type2 getType2() {
		return type2;
	}

	public void setType2(Type2 x) {
		this.type2 = x;
	}

	public int getNoOfFeet() {
		System.out.println("Are  " + noOfFeet + " picioare");
		return noOfFeet;
	}

	public void setNoOfFeet(int numarDePicioare) {
		this.noOfFeet = numarDePicioare;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.toUpperCase();
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public boolean isMerge() {
		return merge;
	}

	public void setMerge(boolean merge) {
		this.merge = merge;
	}

	Animal() {
		name = "Huanito";
	}

	Animal(String nume, int numarDePicioare) {
		System.out.println("Numele este" + nume + "Si are : " + numarDePicioare);
		this.name = nume;
		noOfFeet = numarDePicioare;
	}

	Animal(String nume) {
		System.out.println(nume);
		this.name = nume;
		nume = "Ezikiel";
		System.out.println(name + "--");
	}

	static void eat() {
		System.out.println("animalul manaca");
	}

	static void eat(int a) {
		System.out.println("animalul manaca");
	}

	static void drink() {
		System.out.println("animalul bea");
	}

	void sleep() {
		System.out.println("animalul doarme");
	}

	boolean isSleeping() {
		if (merge == true) {
			System.out.println("animalul nu doarme");
			return false;
		} else {
			System.out.println("animalul doarme");
			return true;
		}
	}

}
