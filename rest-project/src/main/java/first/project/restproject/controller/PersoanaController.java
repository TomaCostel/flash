package first.project.restproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;





persoanaService.getAllPerssons()


@RestController
public class PersoanaController {

	@Autowired
	private PersoanaService persoanaService;

    @GetMapping("/persons")
    private List<Persoana> getAllPersons() {
        return persoanaService.getAllPerssons();
    }
}