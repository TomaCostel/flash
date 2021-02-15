package first.project.restproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import first.project.restproject.entity.Salariu;
import first.project.restproject.service.SalariuService;

@Controller
public class SalariuController {

	@Autowired
	private SalariuService salariuService;

	@GetMapping("/salarii")
	private List<Salariu> getAllSalarii() {
		return salariuService.getAllSalariu();
	}
}
