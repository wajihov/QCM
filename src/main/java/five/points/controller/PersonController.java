package five.points.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import five.points.entities.Personne;
import five.points.service.PersonneService;

@RestController
@RequestMapping("/register")
public class PersonController {

	@Autowired
	private PersonneService personneService;

	@PostMapping("/savePerson")
	public Personne savePerson(@RequestBody FormModel formModel) {
		Personne p = personneService.savePerson(formModel.getName(), formModel.getLasname(), formModel.getEmail(),
				formModel.getPassword());
		return p;
	}

	@PostMapping("/auth")
	public Personne authentification(@RequestBody FormModel formModel) {
		Personne p = personneService.authentification(formModel.getEmail(), formModel.getPassword());
		if (p != null)
			return p;
		else
			return null;
	}

}
