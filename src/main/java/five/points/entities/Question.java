package five.points.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Question {

	@Id
	@GeneratedValue
	private Long id;
	private String reponse_1;
	private String reponse_2;
	private String reponse_3;
	private String reponse_4;
	private Long score;

	@ManyToOne
	private Participant idparticipant;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReponse_1() {
		return reponse_1;
	}

	public void setReponse_1(String reponse_1) {
		this.reponse_1 = reponse_1;
	}

	public String getReponse_2() {
		return reponse_2;
	}

	public void setReponse_2(String reponse_2) {
		this.reponse_2 = reponse_2;
	}

	public String getReponse_3() {
		return reponse_3;
	}

	public void setReponse_3(String reponse_3) {
		this.reponse_3 = reponse_3;
	}

	public String getReponse_4() {
		return reponse_4;
	}

	public void setReponse_4(String reponse_4) {
		this.reponse_4 = reponse_4;
	}

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public Question(String reponse_1, String reponse_2, String reponse_3, String reponse_4, Long score) {
		super();
		this.reponse_1 = reponse_1;
		this.reponse_2 = reponse_2;
		this.reponse_3 = reponse_3;
		this.reponse_4 = reponse_4;
		this.score = score;
	}

	public Question() {
		super();
	}

}
