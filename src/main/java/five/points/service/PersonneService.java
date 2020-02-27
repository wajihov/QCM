package five.points.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import five.points.dao.PersonneRepository;
import five.points.entities.Personne;

@Service
public class PersonneService implements IPersonne {

	@Autowired
	private PersonneRepository personneService;

	@Override
	public Personne savePerson(String name, String prenom, String email, String password) {
		Personne personne = new Personne();
		if (name != null)
			personne.setName(name);
		if (prenom != null)
			personne.setLasname(prenom);
		if (email != null)
			personne.setEmail(email);
		if (email != null)
			personne.setPassword(password);
		Personne p = personneService.save(personne);
		return p;
	}

	@Override
	public Personne authentification(String email, String password) {
		Personne personne = new Personne();
		if (email != null && password != null) {
			personne = personneService.authentification(email, password);
		}
		if (personne != null)
			return personne;
		else
			return null;
	}

}
