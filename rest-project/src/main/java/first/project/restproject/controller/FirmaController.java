package first.project.restproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import first.project.restproject.entity.Firma;
import first.project.restproject.service.FirmaService;

@RestController
public class FirmaController {

	@Autowired
	private FirmaService firmaService;

	@GetMapping("/firme")
	private List<Firma> getAllCompanies() {
		return firmaService.getAllFirme();
	}
}
