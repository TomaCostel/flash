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
import org.springframework.stereotype.Controller;

@Entity
@Table(name = "salariu")
public class Salariu {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(columnDefinition = "bigint", name = "id_salariu", nullable = false)
	private Long idSalariu;
	private Long value;
	private String moneda;

	public Salariu() {
		super();
	}

	public Salariu(Long idSalariu, Long value, String moneda) {
		super();
		this.idSalariu = idSalariu;
		this.value = value;
		this.moneda = moneda;
	}

	public Long getIdSalariu() {
		return idSalariu;
	}

	public void setIdSalariu(Long idSalariu) {
		this.idSalariu = idSalariu;
	}

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

}