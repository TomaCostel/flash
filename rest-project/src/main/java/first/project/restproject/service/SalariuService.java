package first.project.restproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import first.project.restproject.entity.Persoana;
import first.project.restproject.entity.Salariu;
import first.project.restproject.repository.SalariuRepository;

@Service
public class SalariuService {

	@Autowired
	private static SalariuRepository salariuRepository;

	public static List<Salariu> getAllSalariu() {
		return salariuRepository.findAll();

	}

}
