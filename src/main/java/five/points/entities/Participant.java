package five.points.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Participant {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	private Personne person;

	@OneToMany(mappedBy = "idparticipant")
	private List<Question> questions;
	private Long sommeScore;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Personne getPerson() {
		return person;
	}

	public void setPerson(Personne person) {
		this.person = person;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Long getSommeScore() {
		return sommeScore;
	}

	public void setSommeScore(Long sommeScore) {
		this.sommeScore = sommeScore;
	}

	public Participant() {
		super();
	}

}
