package animalute;

import enums.AnimalGender;

public class Parrot extends Bird {

	private String rasa = "perus nimfa micul Alexander";// asta este exercitiul 3
	private AnimalGender gen;
	private boolean traiesteInColonie;

	public AnimalGender getGen() {
		return gen;
	}

	public void setGen(AnimalGender gen) {
		this.gen = gen;
	}

	static void parrotDescription(Parrot p) {
		System.out.println("papagalul se numeste.. " + p.getName());
		System.out.println("papagalul si are culoarea.. " + p.getColor());
	}// aici este exercitiul 2

	public String getRasa() {
		return rasa;
	}

	public void setRasa(String rasa) {
		if (rasa.contains("perus") || rasa.contains("nimfa") || rasa.contains("micul Alexandru"))
			this.rasa = rasa;

	}

	/*
	 * public String getGen() { return gen; }
	 * 
	 * public void setGen(String gen) { this.gen = gen; }
	 */
	public boolean isTraiesteInColonie() {
		return traiesteInColonie;
	}

	public void setTraiesteInColonie(boolean traiesteInColonie) {
		this.traiesteInColonie = traiesteInColonie;
	}

}
