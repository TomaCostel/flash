package first.project.restproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import first.project.restproject.entity.Firma;
import first.project.restproject.entity.Persoana;
import first.project.restproject.repository.FirmaRepository;

@Service
public class FirmaService {

	@Autowired
	private FirmaRepository firmaRepository;

	public List<Firma> getAllFirme() {
		return firmaRepository.findAll();

	}

}
