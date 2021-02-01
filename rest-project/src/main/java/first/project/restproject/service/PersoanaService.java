package first.project.restproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import first.project.restproject.repository.PersoanaRepository;
import first.project.restproject.entity.Persoana;

@Service
public class PersoanaService {
	@Autowired
	private PersoanaRepository persoanaRepository;

	public List<Persoana> getAllPerssons() {
		return persoanaRepository.findAll();

	}

}
