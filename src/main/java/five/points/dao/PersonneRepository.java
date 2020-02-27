package five.points.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import five.points.entities.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long> {

	@Query("Select u From Personne u Where u.email=?1 and u.password=?2")
	Personne authentification(String mail, String pass);

}
