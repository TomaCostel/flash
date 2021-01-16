package animalute;

public class Persoana {

	private String nume;
	private int varsta;
	private String cnp;
	
	Persoana(){
		
	}
	
	public Persoana(String nume, int varsta, String cnp) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.cnp = cnp;
	}
	@Override
	public String toString() {
		return "Persoana [nume=" + nume + ", varsta=" + varsta + ", cnp=" + cnp + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnp == null) ? 0 : cnp.hashCode());
		result = prime * result + ((nume == null) ? 0 : nume.hashCode());
		result = prime * result + varsta;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persoana other = (Persoana) obj;
		if (cnp == null) {
			if (other.cnp != null)
				return false;
		} else if (!cnp.equals(other.cnp))
			return false;
		if (nume == null) {
			if (other.nume != null)
				return false;
		} else if (!nume.equals(other.nume))
			return false;
		if (varsta != other.varsta)
			return false;
		return true;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public String getCnp() {
		return cnp;
	}
	public void setCnp(String cnp) {
		this.cnp = cnp;
	}
	
	

}
