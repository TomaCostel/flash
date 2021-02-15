package first.project.restproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import first.project.restproject.entity.Persoana;
import first.project.restproject.service.PersoanaService;

@RestController
public class PersoanaController {

	@Autowired
	private PersoanaService persoanaService;

	@GetMapping("/persons")
	private List<Persoana> getAllPersons() {
		return persoanaService.getAllPerssons();
	}
}