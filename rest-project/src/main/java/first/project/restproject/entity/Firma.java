package first.project.restproject.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters.LocalDateConverter;



@Entity
@Table(name="firma")
public class Firma {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(columnDefinition = "bigint", nullable = false)
	private Long id;
	private String name;
	private String location;
	@Column(columnDefinition = "date", name = "data_infiintare")
	@Convert(converter = LocalDateConverter.class)
	private LocalDate dataInfiinitare;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataInfiinitare == null) ? 0 : dataInfiinitare.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Firma other = (Firma) obj;
		if (dataInfiinitare == null) {
			if (other.dataInfiinitare != null)
				return false;
		} else if (!dataInfiinitare.equals(other.dataInfiinitare))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Firma [id=" + id + ", name=" + name + ", location=" + location + ", dataInfiinitare=" + dataInfiinitare
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDate getDataInfiinitare() {
		return dataInfiinitare;
	}

	public void setDataInfiinitare(LocalDate dataInfiinitare) {
		this.dataInfiinitare = dataInfiinitare;
	}

}
