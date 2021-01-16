package animalute;

import java.util.HashMap;

import enums.Currency;

public class Salariu {

	private double valoare;
	private Currency moneda;
	private String idSalariu;

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idSalariu == null) ? 0 : idSalariu.hashCode());
		result = prime * result + ((moneda == null) ? 0 : moneda.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valoare);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Salariu other = (Salariu) obj;
		if (idSalariu == null) {
			if (other.idSalariu != null)
				return false;
		} else if (!idSalariu.equals(other.idSalariu))
			return false;
		if (moneda != other.moneda)
			return false;
		if (Double.doubleToLongBits(valoare) != Double.doubleToLongBits(other.valoare))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Salariu [valoare=" + valoare + ", moneda=" + moneda + ", idSalariu=" + idSalariu + "]";
	}

	Salariu(double valoare, Currency moneda, String idSalariu) {
		this.valoare = valoare;
		this.moneda = moneda;
		this.idSalariu = idSalariu;
	}

	Salariu() {

	}
	
	public double getValoare() {
		return valoare;
	}

	public void setValoare(double valoare) {
		this.valoare = valoare;
	}

	public Currency getMoneda() {
		return this.moneda;
	}

	public void setMoneda(Currency moneda) {
		this.moneda = moneda;
	}

	public String getIdSalariu() {
		return idSalariu;
	}

	public void setIdSalariu(String idSalariu) {
		this.idSalariu = idSalariu;
	}

}
