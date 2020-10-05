package animalute;

public class Dog {

	private String name;
	private int noOfFeet;
	private String countryOfOrigin;
	private String color;
	private boolean makeNoise;

	public String getShowColor() {
		System.out.println("culoarea este " + color);
		return color;
	}
	public void setShowColor(String culoare) {
		this.color=culoare;
		}
	
	public void eat() {
		System.out.println("animalul manaca");
	}

	public void drink() {
		System.out.println("animalul bea");
	}

	public boolean isSleeping() {
		if (this.makeNoise == true) {
			System.out.println("animalul nu doarme");
			return false;
		} else {
			System.out.println("animalul doarme");
			return true;
		}
	}
	public boolean setIsSleeping(boolean faceZgomot) {
		this.makeNoise=faceZgomot;
		return faceZgomot;
		
	}

	public String getName() {
		System.out.println("Numele cainelui e:  " + name);
		return name;
	}
	public void setName(String nume) {
		this.name=nume.toUpperCase();
	}
	public boolean isPlaying() {
		boolean x = isSleeping();
		if (x == true) {
			return false;
		}
		else {
			return true;
		}
		

	}
}