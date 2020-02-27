package five.points.service;

import five.points.entities.Personne;

public interface IPersonne {

	public Personne savePerson(String name, String prenom, String email, String password);

	public Personne authentification(String email, String password);

}
